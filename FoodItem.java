/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author ECBME
 */
public class FoodItem extends FoodComponent {
   
    private double price;
    /*
    HERE WE'LL SEE IF I NEED THAT NAME METHOD BECAUSE I HAVE IT IN MY CONSTRUCTOR AS WELL
    
    @Override
    public void setName(String n){
        n = name;
    }
    */
    
    public FoodItem(String n, double p){
        super(n);
        price = p;
    }
    
   
    
    @Override
    public double getPrice(){
        
        return price;
    }
  
    @Override
    public void print(int level){
        
        for(int i = 0; i < level ; i++){
            System.out.print("\t");
        }
        
        System.out.println("Food Item: " + getName() + ", " + getPrice());
    }
    
}
