package com.azure.polymorphisam;

public class SoundOfAnimalOverridingA {
    public static void soundsOfAnimal(){
        String name = "Dog";
        System.out.println(name +" "+"is barking");
    }
    public static void soundOfAnimal(String animalName){
        animalName = "Duck";
        System.out.println(animalName +" "+"sound is quack quack");
    }

    public static void main(String[] args) {
        soundsOfAnimal();
        soundOfAnimal("Duck");
    }
}
