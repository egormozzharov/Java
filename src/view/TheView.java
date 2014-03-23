package view;

import bl.to.TO;
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
    public TO userInput(int amount) {
        TO to = new TO();
        
        List<String> flowers = new ArrayList<>();
        flowers.add("Роза");
        flowers.add("Роза");
        flowers.add("Роза искусственная");
        
        List<String> decorations = new ArrayList<>();
        decorations.add("Лента стандартная");
        decorations.add("Обертка стандартная");
        
        to.setDecorations(decorations);
        to.setFlowers(flowers);
        
        return to;
    }
    
    /**
     * Printing received message
     * @param message 
     */
    public void printMessage(String message) {
        System.out.println(message);
    }
}
