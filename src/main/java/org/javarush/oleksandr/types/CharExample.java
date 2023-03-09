package org.javarush.oleksandr.types;

public class CharExample {
    public static void main(String[] args) {

        char s0 = 'G';
        char s1 = 71;
        char s2 = 0x47;
        char s3 = (char) Byte.parseByte("01000111", 2);


        System.out.println(s0);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
