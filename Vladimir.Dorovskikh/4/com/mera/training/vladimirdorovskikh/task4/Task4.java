package com.mera.training.vladimirdorovskikh.task4;

import java.util.Random;

/**
 * 1. Фруктовая неоднозначность
 * Создать массив типа Fruit, заполнить его 4 разными случаными фруктами и вывести их на экран
 *
 *
 * 2. Фруктовая абстрактность
 * Создать класс AbstractFabric с одним абстрактным методом makeFruit(), который возвращает фрукт.
 * Создайте массив на 10 элементов и поместите туда 10 случайных фабрик одного из 4 описанных выше типов.
 * Создайте массив типа Fruit на 20 элементов и заполните его фруктами из всех  фабрик - по 2 фрукта от одной фабрики.
 */
public class Task4 {
    public static void main(String ... args)
    {
        Fruit.main();
        AbstractFabric.main();
    }
}
