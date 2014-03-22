package view;

import controller.Controller;
import java.util.ArrayList;
import java.util.List;

/**
 *This class interacts with user
 * @author Egor
 */
public class TheView {
    
    Controller controller = Controller.getInstance();
    
    public TheView() {
    }
    
    /**
     * Method emulates user's input
     * @param amountOfThreasures
     */
    public void userInput(int amount) {
            controller.executeFromView("SpringBouquet");    
            controller.executeFromView("SummerBouquet");
    }
    
    /**
     * Printing received message
     * @param message 
     */
    public void printMessage(String message) {
        System.out.println(message);
    }
}
