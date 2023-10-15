/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *  IS-A
 * HAS-A
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Boat b1 = new Boat();
        b1.hoistSail();
        b1.lowerSail();
     
        Plane plane1 = new Plane();
        plane1.accelerate(700);
        plane1.getDirection();
        
        Truck truck1 = new Truck();
        truck1.brake();
        truck1.getType();
        
      
    }
    
}
