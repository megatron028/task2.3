package com.company;

import java.util.Arrays;

//Создать класс Зоопарк (поля Тигр, Лев, Жираф) Создать классы Тигр, Лев, Жираф с полями кличка, возраст и методами Есть() Пить() Спать() Скучать()
//        В главном классе создать по одному Тигру, Льву и Жирафу и поместить их в Зоопарк используя сеттеры класса Зоопарк.
//        Вывести на экран содержимое зоопарка, переопределив метод toString() для класса Зоопарк
public class Main {

    public static void main(String[] args) {
	Giraffe giraffe = new Giraffe();
	giraffe.setAge(11);
	giraffe.setName("abc");

    Tiger tiger = new Tiger();
    tiger.setAge(10);
    tiger.setName("King");

    Lion lion = new Lion();
    lion.setAge(2);
    lion.setName("Big");

    Zoopark zoopark = new Zoopark();
    zoopark.setGiraffe(giraffe);
    zoopark.setLion(lion);
    zoopark.setTiger(tiger);

        System.out.println(zoopark.toString());
    }
}
