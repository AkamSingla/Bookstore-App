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
public abstract class Passenger {
    private String name;
    private int age;

    /**
     *
     * @param name
     * @param age
     */
    public Passenger(String name, int age){
        this.name = name;
        this.age = age;
    }

    /**
     *
     * @param passenger
     */
    public Passenger(Passenger passenger){
        this.age = passenger.getAge();
        this.name = passenger.getName();
    }

    /**
     *
     * @param p
     * @return
     */
    public abstract double applyDiscount(double p);

    /**
     *
     * @param name
     */
    public void setName(String name){ this.name = name; }

    /**
     *
     * @param age
     */
    public void setAge(int age){ this.age = age; }

    /**
     *
     * @return
     */
    public String getName(){ return name; }

    /**
     *
     * @return
     */
    public int getAge(){ return age; }
}

