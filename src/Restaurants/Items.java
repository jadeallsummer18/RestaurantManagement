/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurants;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author amaechi
 */
public class Items {
    
    private double chickenBowl;
    public double chickenBowlV;  //V stands for variable
    
    private double chickenBurgerMeal;
    public double chickenBurgerMealV;

    private double chickenWings;
    public double chickenWingsV;

    private double BonelessChickenBreast;
    public double BonelessChickenBreastV;
    
    private double veggieBurger;
    public double veggieBurgerV;
  
    private double milkShake;
    public double milkShakeV;

    private double tea;
    public double teaV;
    
    private double Lemonade;
    public double LemonadeV;
    
    private double coke;
    public double cokeV;
    
    private double water;
    public double waterV;
    
    private JFrame frame;

    
    public Items() {
        
        this.chickenBowl = 7.99;
        this.chickenBurgerMeal = 10.99;
        this.chickenWings = 10.99;
        this.BonelessChickenBreast = 12.99;
        this.veggieBurger = 8.99;
        this.milkShake = 3.99;
        this.tea = 1.99;
        this.Lemonade = 2.99;
        this.coke = 2.99;
        this.water = 1.99;
        

    }
    
    

    public double getChickenBowl() {
        return this.chickenBowl;
    }

    public double getChickenBurgerMeal() {
        return this.chickenBurgerMeal;
    }

    public double getChickenWings() {
        return this.chickenWings;
    }

    public double getBonelessChickenBreast() {
        return this.BonelessChickenBreast;
    }

    public double getVeggieBurger() {
        return this.veggieBurger;
    }

    public double getMilkShake() {
        return this.milkShake;
    }

    public double getTea() {
        return this.tea;
    }

    public double getLemonade() {
        return this.Lemonade;
    }

    public double getCoke() {
        return this.coke;
    }

    public double getWater() {
        return this.water;
    } 
    
    
    public void iExitSystem() {
        frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame, "confirm if you want to exit", 
                "Restaurant Management Systems", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }
    

    
    
    
}
