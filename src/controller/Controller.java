package controller;

import bl.factory.flower.ArtCreator;
import bl.factory.flower.FlowerCreator;
import bl.factory.flower.NatCreator;
import bl.to.ArtParams;
import bl.to.NatParams;
import bl.to.TO;
import entity.decorate.Decoration;
import entity.flower.Flower;
import java.util.HashMap;
import view.TheView;




public class Controller {
    
    private TheView view;
    
    private static Controller instance;
    
//    private List<String> viewCommands = new ArrayList<>();
    private HashMap<String, FlowerCreator> flowerMap = new HashMap<>();
    
    private HashMap<String, DecorationCreator> dMap = new HashMap<>();
    
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
        
        
    }
    
    public void getInputFromView(String command) {
        
        TO to = view.userInput(5);
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
