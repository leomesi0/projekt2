package com.company;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("pies",40.0,"Denali");
        dog.feed();

        Phone iPhone = new Phone("Apple","7",4.5,"IOS");
        Human me = new Human("Jakub","Zejer");
        me.car = new Car("Audi","A6",2015,200000);
        me.pet = new Animal("Dog",40.0,"Denali");
        me.getNumber();
        me.setNumber(1000);
        me.setCar(me.car);
        System.out.println(me.getCar());

        Human Ja = new Human("Jakub","Zejer");

        Car myCar = new Car("A6","Audi",2012,30000);
        Car myfriendCar = new Car("Fabia","Skoda",2018,20000);
        Car myfatherCar = new Car ( "XE","Jaguar",2019,170000);
        System.out.println(myCar);
        System.out.println(myfriendCar);
        System.out.println(myfatherCar);

        Ja.getNumber();
        Ja.setNumber(1000);
        Ja.getNumber();
    }
}
