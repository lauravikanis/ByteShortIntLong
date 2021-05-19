package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
    int myValue = 1000;

    int myMinValue = Integer.MIN_VALUE;
    int myMaxValue = Integer.MAX_VALUE;

    System.out.println("Integer Min Value =" + myMinValue);
    System.out.println("Integer Max Value =" + myMaxValue);

    System.out.println("Busted Min Value =" + (myMinValue -1 ));
    System.out.println("Busted MAX value =" + (myMaxValue + 1 ));

    // next line error "int number is to long"
    // int myMaxIntTest = 21474836474
        
    // Int can also be written with underscores
    // int myMaxIntTest = 21_474_836_44;

    }
}
