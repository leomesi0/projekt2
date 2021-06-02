package com.company;

import java.time.LocalTime;
import java.util.Timer;

public class Human {
    public String name;
    public String lastname;
    public Double salary;

    public  Human(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    public double getNumber(){
        System.out.println(salary);
        System.out.println(LocalTime.now());
        return salary;
    }
    public void setNumber(double salary){
        if (salary<=0)
            System.out.println("Brak wynagrodzenia");
        else{
            this.salary = salary;
            System.out.println("Nowe dane zostały wysłane do systemu księgowego");
            System.out.println("Konieczne jest odebranie aneksu do umowy od p.Hanny Kowalskiej z kadr");
            System.out.println("ZUS i US wiedzą o zmianie wypłaty i wszelkie ukrywanie dochodu nie ma sensu");

        }
    }
}
