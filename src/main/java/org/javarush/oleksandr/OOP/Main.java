package org.javarush.oleksandr.OOP;

public class Main {
    public static void main(String[] args) {

        Cat myCat = new Cat("Ruslan", 2);
        System.out.println(" ------ CAT 1 --------");

        System.out.println(myCat.getName());
        System.out.println(myCat.getAge());
        myCat.voice();

        Dog myDog = new Dog("Dog", 5);
        myDog.voice();
    }
}
