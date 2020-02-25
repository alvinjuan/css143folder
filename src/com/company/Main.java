package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        // variables
        int myIntegerVariable;
        myIntegerVariable = 10;

        // self increment
        myIntegerVariable++;
        System.out.printf("%d", myIntegerVariable);

        // array
        int myArray[];
        myArray = new int[myIntegerVariable];
        for (int i=0; i<myIntegerVariable; i++) {
            myArray[i] = i*2;
        }

        // if statement
        if (myIntegerVariable>10) {
            System.out.println("myIntegerVariable larger than 10");
        } else {
            System.out.println("myIntegerVariable smaller or equal to 10");
        }

        // loop
        for (int i=0; i<myIntegerVariable; i++) {
            System.out.printf("myArray[%d] = %d\n", i, myArray[i]);
        }
    }
}
