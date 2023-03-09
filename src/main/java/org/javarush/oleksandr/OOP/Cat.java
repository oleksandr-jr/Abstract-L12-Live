package org.javarush.oleksandr.OOP;

public class Cat extends Animal {
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
    }
}
