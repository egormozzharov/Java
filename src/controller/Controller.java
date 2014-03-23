package controller;

import bl.builder.BouquetBuilder;
import bl.builder.Director;
import bl.factory.decoration.DecorCreator;
import bl.factory.decoration.RibCreator;
import bl.factory.decoration.WrapCreator;
import bl.factory.flower.ArtCreator;
import bl.factory.flower.FlowerCreator;
import bl.factory.flower.NatCreator;
import bl.to.ArtParams;
import bl.to.NatParams;
import bl.to.RibParams;
import bl.to.TO;
import bl.to.WrapParams;
import entity.Bouquet;
import entity.decorate.Decoration;
import entity.flower.Flower;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import view.TheView;




public class Controller {
    
    private TheView view;
    
    private static Controller instance;
    
    private HashMap<String, FlowerCreator> flowerMap = new HashMap<>();
    
    private HashMap<String, DecorCreator> dMap = new HashMap<>();
    
    public static Controller getInstance() {
        if (null == instance) {
            instance = new Controller();
        }
        return instance;
    }  
    
    private Controller() {
        NatParams nParams = new NatParams();
        nParams.setName("Роза натуральная");
        nParams.setExpirationDays(10);
        flowerMap.put(nParams.getName(), new NatCreator(nParams));
        
        ArtParams aParams = new ArtParams();
        aParams.setName("Роза искусственная");
        aParams.setToxic(true);
        flowerMap.put(aParams.getName(), new ArtCreator(aParams));
        
        RibParams rParams = new RibParams();
        rParams.setName("Лента стандартная");
        rParams.setLength(10);
        dMap.put(rParams.getName(), new RibCreator(rParams));
        
        WrapParams wParams = new WrapParams();
        wParams.setName("Обертка стандартная");
        wParams.setSquare(10);
        dMap.put(wParams.getName(), new WrapCreator(wParams));
        
        
    }
    
    private void getInputFromView() {
        
        TO to = view.userInput(5);
        
        
       // validation
        List<String> flowers = to.getFlowers();        
        List<Flower> createFlowers = new ArrayList<>();
        for (String currFlower : flowers) {
            if (true == flowerMap.containsKey(currFlower)) {
                FlowerCreator flowerCreator = flowerMap.get(currFlower);
                createFlowers.add(flowerCreator.factoryMethod());
            }else {
                view.printMessage("error!" + currFlower + " is not defined");
            }
        }
        
        List<String> decoration = to.getDecorations();
        List<Decoration> createDecoration = new ArrayList<>();
        for (String currDec : decoration) {
            if (true == dMap.containsKey(currDec)) {
                DecorCreator decorCreator = dMap.get(currDec);
                createDecoration.add(decorCreator.factoryMethod());
            }else {
                view.printMessage("error!" + currDec + " is not defined");
            }
        }
        
        BouquetBuilder builder = new BouquetBuilder(createFlowers,
                                                    createDecoration);
        Director director = new Director();
        director.setBouquetBuilder(builder);
        director.constructBouquet();
        Bouquet bouquet = director.getBouquet();
        view.printMessage(bouquet.getBouquetInfo());
    }
    
    
    public void run () {
        view = new TheView();
        getInputFromView();
    }    
    
}
