package com.azure.polymorphisam;

public class SoundsOfAnimalsOverridingB extends SoundOfAnimalOverridingA {
    public static void soundsOfAnimal(){
        System.out.println("Cat sounds meow,meow");
    }

    public static void main(String[] args) {
        soundsOfAnimal();
        soundsOfAnimal();               // overridding method from soundofanimaloverriding
        soundOfAnimal("Duck");

    }
}
