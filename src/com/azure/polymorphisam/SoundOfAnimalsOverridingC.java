package com.azure.polymorphisam;

public class SoundOfAnimalsOverridingC extends SoundsOfAnimalsOverridingB {
    public static void soundsOfAnimals(String name,String name1){
        System.out.println("Cow sounds moo,moo");
        System.out.println("Lion is roaring");
    }
    public static void soundsOfAnimal(){
        System.out.println("Horse sounds neigh,neigh");
    }

    public static void main(String[] args) {
        soundsOfAnimals("Cow","Lion");
        soundsOfAnimal();
        soundOfAnimal("Duck");
    }
}
