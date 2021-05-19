package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        int myValue = 1000;
        System.out.println(myValue);

        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Min Value =" + myMinValue);
        System.out.println("Integer Max Value =" + myMaxValue);
        System.out.println("Busted Min Value =" + (myMinValue - 1));
        System.out.println("Busted MAX value =" + (myMaxValue + 1));

        // next line error "int number is to long"
        // int myMaxIntTest = 21474836474
        // Int can also be written with underscores
        // int myMaxIntTest = 21_474_836_44;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value =" + myMinByteValue);
        System.out.println("Byte Max Value =" + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value =" + myMinShortValue);
        System.out.println("Short Max Value =" + myMaxShortValue);

        int myTotal = (myMinValue / 2);
        byte myNewBytevalue = (byte) (myMinByteValue / 2);
        //casting other types o value

        short myNewShortValue = (short) (myMaxShortValue / 2);

        //--------

        byte newByteValue = 100;
        short newShortValue = 32;
        int newIntValue = 234;
        long newLongValue = (50000L + (10L * (newByteValue + newIntValue + newShortValue)));
        System.out.print(newLongValue);

        //--------

        float myFloatMinValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println(myMaxFloatValue + "+" + myFloatMinValue);

        //--------

        double myMinDoubleMinValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println(myMaxDoubleValue + "+" + myMinDoubleMinValue);

    }
}
