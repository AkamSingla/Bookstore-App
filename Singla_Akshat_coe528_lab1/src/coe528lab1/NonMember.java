/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528lab1;

/**
 *
 * @author ECBME
 */
public class NonMember extends Passenger {
    /**
     *
     * @param name
     * @param age
     */
    public NonMember(String name, int age){
        super(name, age);
    }

    /**
     *
     * @param nonMember
     */
    public NonMember(NonMember nonMember){ super(nonMember); }
    /**
     *
     * @param p
     * @return
     */
    public double applyDiscount(double p){
        if(this.getAge() > 65)
            return p * .90;
        else
            return p;
    }
}
