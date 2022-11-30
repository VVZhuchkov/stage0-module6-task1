package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal (String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String quantityPaws = "paw";
        if (numberOfPaws>1) {
            quantityPaws = "paws";
        }
        return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + quantityPaws + " and " + (hasFur? "a":"no") + " fur.";
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.getDescription());
        System.out.println();
        Animal animal = new Dog();
        System.out.println(animal.getDescription());
        System.out.println();
        Bird bird = new Bird();
        System.out.println(bird.getDescription());
        System.out.println();
        Animal animal2 = new Bird();
        System.out.println(animal2.getDescription());
    }
}
