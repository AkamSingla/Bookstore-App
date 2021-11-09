/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab4;
import java.util.ArrayList;
/**
 *
 * @author ECBME
 */
public class FoodCategory extends FoodComponent {
    
    private ArrayList<FoodComponent> FoodComp;
    private String nameCat;
    private double price;
    
    
    public void setName(String n){
        n = nameCat;
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    public FoodCategory(String n){
        super(n);
        FoodComp = new ArrayList<FoodComponent>();
        
    }
    
    @Override
    public double getPrice(){
        double sum = 0;
        
        for(FoodComponent n : FoodComp){
            sum += n.getPrice();
        }
        return sum;
    }
    
    @Override
    public void print(int level){
        for(int i = 0; i < level ; i++){
            System.out.print("\t");
        }
        
        System.out.println("Food Category: (" + name + ", " + getPrice() + ") contains: ");
        
        for(FoodComponent n : FoodComp){
            n.print(level + 1);
        }
    }
    
    public void add(FoodComponent fc){
        FoodComp.add(fc);
    }
    
    public void remove(FoodComponent fc){
        FoodComp.remove(fc);
    }
}
