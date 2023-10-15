/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author diogo
 */
public class Boat extends Vehicle implements Sailable {
    
//    public Boat(int num) {
//        System.out.println("Construtor " + num);
//    }

    @Override
    public void hoistSail() {
        System.out.println("Hoist sail");
    }

    @Override
    public void lowerSail() {
           System.out.println("Lower sail");
    }

    @Override
    public boolean isSailHoisted() {
         System.out.println("is sail Hoisted");
         return true;
    }

    @Override
    public void landHo() {
           System.out.println("land ho");
    }
    
}
