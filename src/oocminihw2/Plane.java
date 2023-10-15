/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author diogo
 */
public class Plane extends Vehicle implements Flyable {

    @Override
    public void changeAltitude(float change) {
        System.out.println("Changing the Altitude");
    }

    @Override
    public float getAltitude() {
          System.out.println("Atitude");
          return 0;
    }

    @Override
    public void accelerate(float speed) {
        System.out.println("Accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Stoping");
    }
    

    @Override
    public void turn(float angle) {
        System.out.println("Turning");
    }

    @Override
    public float getDirection() {
        System.out.println("Direction");
        return 0;
    }

    @Override
    public float getSpeed() {
        System.out.println("Speed");
        return 0;
    }

    @Override
    public String getMake() {
        System.out.println("Making");
        return "";
    }

    @Override
    public String getType() {
        System.out.println("Type");
        return "";
    }
    
}
