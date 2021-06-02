package com.company;

public class Main {

    public static void main(String[] args){

        Human me = new Human("Jakub","Zejer");
        me.car = new Car("Audi","A6",2015,200000.0);
        me.pet = new Animal("Dog",40.0,"Denali");
        me.getNumber();
        me.setNumber(1000);
        me.setCar(me.car);
        System.out.println(me.getCar());







    }
}
