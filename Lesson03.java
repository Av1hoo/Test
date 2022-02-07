package com.company;

public class Lesson03 {

    // Sizes of different types in java
    public static void sizes(){
        System.out.println("Size of byte: " + (Byte.SIZE/8) + " bytes.");
        System.out.println("Size of short: " + (Short.SIZE/8) + " bytes.");
        System.out.println("Size of int: " + (Integer.SIZE/8) + " bytes.");
        System.out.println("Size of long: " + (Long.SIZE/8) + " bytes.");
        System.out.println("Size of char: " + (Character.SIZE/8) + " bytes.");
        System.out.println("Size of float: " + (Float.SIZE/8) + " bytes.");
        System.out.println("Size of double: " + (Double.SIZE/8) + " bytes.");
    }

    // or and
    public static void orAnd(){
        System.out.println("me | you - check me or you");
        System.out.println("me & you - check me and you");
        System.out.println("me || you - check me and then check or you");
        System.out.println("me && you - check me and then check and you");
    }
}
