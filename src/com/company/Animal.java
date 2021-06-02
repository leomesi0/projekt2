package com.company;

import java.io.File;

public class Animal {
    final public String species;
    public Double weight;
    public String name;
    public File pic;

    public Animal (String species, Double weight, String name) {
        this.species = species;
        this.weight = weight;
        this.name = name;
    }
    void feed(){
        if(weight>0){
            weight += 1;
            System.out.println("Thanks");
            System.out.println("Weight is"+weight);
        }
    else{
        System.out.println("Food wont make me alive");
        }
    }
    void takeForWalk(){
        if (weight>=0){
            weight -=1.5;
            System.out.println("Thanks for walk, my weight is"+weight);
            if(weight<=0){
                System.out.println("I am too thin");
            }
        }
        else{
            System.out.println("I am dead");
        }
    }
}