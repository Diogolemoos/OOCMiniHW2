/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author diogo
 */
public class Truck extends Vehicle implements Drivable {

    @Override
    public void accelerate(float speed) {
        System.out.println("Accelerating - Truck");
    }
    

    @Override
    public void brake() {  
        System.out.println("Brake - Truck");
    }
    

    @Override
    public void turn(float angle) {
        System.out.println("Turning - Truck");
    }

    @Override
    public float getDirection() {
        System.out.println("Direction - Truck");
        return 0;
    }

    @Override
    public float getSpeed() {
        System.out.println("Speeding - Truck");
        return 0;
    }

    @Override
    public String getMake() {
        System.out.println("Make - Truck");
        return "";
    }

    @Override
    public String getType() {
        System.out.println("Type - Truck");
        return "";
    }
    
}
