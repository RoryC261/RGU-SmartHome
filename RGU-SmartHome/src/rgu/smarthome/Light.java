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
public class Light {
    
    // === Fields ===
    private String colour;
    private boolean state;
    
    // === Constructor ===
    public Light(String colour, boolean state){
        this.colour = colour;
        this.state = state; 
    }
    
    // === Getters ===
    public String getColour(){
        return colour;
    }
    
    public boolean getState(){
        return state;
    }
    
    // === Setters ===
    public void setColour(String colour){
       this.colour = colour;
    }
    
    public void setState(boolean state){
    this.state = state;
    }
    
    
    // === Methods ===
    public String changeColour(String colour){
        setColour(colour);
        return "Light colour has been changed to " + getColour();
    }
    
    public String switchOn(){
        setState(true);
        return "Light is now ON";
    }
    
    public String switchOff(){
        setState(false);
        return "Light is now OFF";
    }

}
