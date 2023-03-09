package org.javarush.oleksandr.types;

public class ShrinkTypes {
    public static void main(String[] args) {

        int bigNumber = 938;

        byte smallNumber = (byte) bigNumber;

        StringBuilder bigNumberBinary = new StringBuilder(String.format("%32s", Integer.toBinaryString(bigNumber)).replace(" ", "0"));
        StringBuilder smallNumberBinary = new StringBuilder(String.format("%32s", Integer.toBinaryString(smallNumber)).replace(" ", "0"));

        for (int i = 0; i < bigNumberBinary.length(); i+=11) {
            bigNumberBinary.insert(i, " | ");
            smallNumberBinary.insert(i, " | ");
        }

        System.out.println(bigNumber);
        System.out.println(smallNumber);

        System.out.println(bigNumberBinary);
        System.out.println(smallNumberBinary);
    }
}
