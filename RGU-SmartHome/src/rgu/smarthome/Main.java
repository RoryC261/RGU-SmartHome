/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgu.smarthome;

/**
 *
 * @author roryc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Light light1 = new Light("Blue", false);
        System.out.println(light1.switchOn());
        System.out.println(light1.changeColour("Blue"));
        System.out.println(light1.switchOff());
    }
    
}
