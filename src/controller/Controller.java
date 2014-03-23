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
        nParams.setName("Роза нутаральная");
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
    
    public void getInputFromView(String command) {
        
        TO to = view.userInput(5);
        
        
       // validation
        boolean correct = true;
        BouquetBuilder builder = new BouquetBuilder();
        List<String> flowers = to.getFlowers();
        
        List<String> createFlowers = new ArrayList<>();
        for (String currFlower : flowers) {
            if (true == flowerMap.containsKey(currFlower)) {
                createFlowers.add(currFlower);
            }else {
                view.printMessage("error!" + currFlower + " is not defined");
            }
        }
        
        List<String> decoration = to.getDecorations();
        List<String> createDecoration = new ArrayList<>();
        for (String currDec : decoration) {
            if (true == dMap.containsKey(currDec)) {
                createDecoration.add(currDec);
            }else {
                view.printMessage("error!" + currDec + " is not defined");
            }
        }
        
        BouquetBuilder builder1 = new BouquetBuilder();
        Director director = new Director();
        director.setBouquetBuilder(builder);
        director.constructBouquet();
        director.getBouquet();
        
//        if (true == map.containsKey(command)) {
//              BouquetBuilder builder = map.get(command);
//              Director director = new Director();
//              director.setBouquetBuilder(builder);
//              director.constructBouquet();
//              Bouquet bouquet = director.getBouquet();
//              view.printMessage(bouquet.getBouquetInfo());
//        } 
//        else {
//            view.printMessage("UncorrectCommand!");
//        }
    }
    
    
    public void run () {
        view = new TheView();
        view.userInput(2);
    }    
    
}
