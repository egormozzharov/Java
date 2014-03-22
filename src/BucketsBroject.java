/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controller.Controller;


/**
 *
 * @author Egor
 */
public class BucketsBroject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Controller controller = Controller.getInstance();
        controller.run();       
        
//        Director director = new Director();
//        director.setBouquetBuilder(new SpringBouquetBuilder());
//        director.constructBouquet();
//        Bouquet bouquet = director.getBouquet();
//        String str = bouquet.getBouquetInfo();
//        System.out.println(str);
    }
    
}
