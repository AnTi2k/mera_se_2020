package com.mera.training.task04;

import java.util.Random;

public class Task0401 {
    private static final String[] fruitNames = {"Apple", "Orange", "Pineapple"};

    private static Fruit getRandomFruit() {
        Fruit fruit;
        switch (new Random().nextInt(fruitNames.length))
        {
            case 0:
                fruit = new Apple();
                break;
            case 1:
                fruit = new  Orange();
                break;
            case 2:
                fruit = new Pineapple();
                break;
            default:
                fruit = new Orange();
        }
        return fruit;
    }

     public static void main(String[] args) {

        final int fruitNumber = 4;
        Fruit[] fruit = new Fruit[fruitNumber];
        for (int i = 0; i < fruitNumber; ++i) {
            int randomFruit = new Random().nextInt(fruit.length);
            switch (randomFruit) {
                case 0:
                    fruit[i] = new Apple();
                    break;
                case 1:
                    fruit[i] = new Orange();
                    break;
                case 2:
                    fruit[i] = new Pineapple();
                    break;
                default:
                    fruit[i] = new Orange();
            }
            System.out.println(fruit[i].toString());
         }
         System.out.println("Random fruit: " + getRandomFruit());
    }
}
