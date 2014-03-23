package controller;

import bl.builder.BouquetBuilder;
import bl.builder.Director;
import entity.Bouquet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import view.TheView;




public class Controller {
    
    private TheView view;
    
    private static Controller instance;
    
//    private List<String> viewCommands = new ArrayList<>();
    private HashMap<String, BouquetBuilder> map = new HashMap<>();
    
    public static Controller getInstance() {
        if (null == instance) {
            instance = new Controller();
        }
        return instance;
    }  
    
    private Controller() {
//        viewCommands.add("SpringBouquet");
//        viewCommands.add("SummerBouquet");
    }
    
    public void getInputFromView(String command) {
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
