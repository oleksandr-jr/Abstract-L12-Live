package org.javarush.oleksandr.types;

import static java.lang.Double.NaN;

/**
 * Hello world!
 *
 */
public class App 
{

    static int number;
    public static void main( String[] args ) {
        Double infinity = 1.0 / 0.0;
        Double minusInfinity = -1.0 / 0.0;

        System.out.println(infinity);

        System.out.println(infinity + infinity);
        System.out.println(infinity + 1);
        System.out.println(infinity * 2);

        System.out.println(infinity - 2);

        System.out.println(infinity / 2);

        System.out.println(infinity / 0);


        System.out.println(infinity - infinity);
        System.out.println(infinity % 2);
        System.out.println(infinity / infinity);
        System.out.println(infinity / infinity);

        Double nanValue = infinity / infinity;

        System.out.println("Value = " + nanValue);

        System.out.println(Double.isNaN(nanValue));
        System.out.println(Double.isInfinite(infinity));

        System.out.println(nanValue == NaN);

        System.out.println(Long.toBinaryString(Double.doubleToRawLongBits(infinity)));
        System.out.println(Long.toBinaryString(Double.doubleToRawLongBits(minusInfinity)));
        System.out.println(Long.toBinaryString(Double.doubleToRawLongBits(nanValue)));
    }
}
