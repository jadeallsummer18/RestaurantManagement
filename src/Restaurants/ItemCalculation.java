/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurants;

/**
 *
 * @author amaechi
 */
public class ItemCalculation extends Items{
    
    private double costOfMeal;
    private double costOfDrinks;
    private double totalCost;
    private double salesTax;
    private double totalCostPlusTax;

    /**
     *
     */
 
    
    public ItemCalculation () {
     
        this.costOfMeal = 0;
        this.costOfDrinks = 0;
        this.totalCost = 0;
        this.totalCostPlusTax = 0;
        this.salesTax = 0.075;    
    }
    
    public double getCostOfMeal() {     
       costOfMeal = super.chickenBowlV + super.chickenBurgerMealV + 
               super.chickenWingsV + super.BonelessChickenBreastV + super.veggieBurgerV;
       
       totalCost = costOfMeal;
     
       return costOfMeal;
    }
    
   
    
    public double getCostOfDrinks() {
        
        costOfDrinks = super.milkShakeV + super.teaV + super.LemonadeV
                + super.cokeV + super.waterV;
        
       totalCost = costOfDrinks;
        
        return costOfDrinks;
    }

    public double getTotalCost() {
        return totalCost;
    }
    
    public double getSalesTax(double amount) {
        
        double taxAmount = (amount * salesTax);
        
        return taxAmount;
    }

    public double getTotalCostPlusTax() {
        
        totalCostPlusTax = (getTotalCost()+ getSalesTax(getTotalCost()));
        
        return totalCostPlusTax;
    }   
    
}
