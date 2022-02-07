package com.company;

import static com.company.Lesson01.*;
import static com.company.Lesson02.*;
import static com.company.Lesson03.*;
import static com.company.Lesson04.*;
import static com.company.Lesson05.*;
import static com.company.Lesson06.*;
import static com.company.Lesson07.*;
import static com.company.Lesson08.*;
import static com.company.Lesson09.*;
import static com.company.Lesson10.*;
import static com.company.Lesson11.*;
import static com.company.Lesson12.*;
import static com.company.Lesson13.*;
import static com.company.Lesson14.*;
import static com.company.Lesson15.*;
import static com.company.Lesson16.*;
import static com.company.Lesson17.*;
import static com.company.Lesson18.*;
import static com.company.Lesson19.*;
import static com.company.Lesson20.*;
import static com.company.Lesson21.*;
import static com.company.Lesson22.*;
import static com.company.Lesson23.*;
import static com.company.Lesson24.*;
import static com.company.Lesson25.*;

public class Main {

    public static void main(String[] args) {
//        //Lesson 1
//        Slesson(1);
//        System.out.println(naiveGCD(48,30));
//        System.out.println(euclidus(31,30));
//        knuth();
//        Elesson();
//
//        //Lesson 2
//        Slesson(2);
//        printPrimes(13);
//        System.out.println("5315 have " + digits(5315) + " digits.");
//        System.out.println("53 is prime?" + isPrime(53));
//        Elesson();
//
//        //Lesson 3
//        Slesson(3);
//        sizes();
//        orAnd();
//        Elesson();
//
//        // Lesson 4
//        Slesson(4);
//        int[] arr1 = {2,3,5,7};
//        int[] arr2 = {2,3,5};
//        int[] arr3 = {2,3,5,7};
//        System.out.println("arr1 equal to arr2? "+arraysEqual(arr1,arr2));
//        System.out.println("arr1 equal to arr3? "+arraysEqual(arr1,arr3));
//        int[] allprimes = allPrimes(43);
//        for(int num:allprimes)
//            System.out.println(num+" is PRIME!");
//
//        //Lesson 5
//        Slesson(5);
//        int[] arr1 = {2,5,8,0,2,5,3};
//        display(arr1);
//        System.out.println("The index of the minimum element is: "+minIndex(arr1));
//        System.out.println("Does arr1 sorted? " + isSorted(arr1));
//        int[] arr2 = {1,5,8,9,10};
//        display(arr2);
//        System.out.println("Does arr2 sorted? " + isSorted(arr2));
//        Elesson();
//
//        //Lesson 6
//        Slesson(6);
//        int[] arr1 = {2,7,8,0,2,5,3};
//        display(arr1);
//        System.out.println("Index of the number 3 is: "+ linearSearch(arr1,3));
//        System.out.println("Index of the number 7 is: "+ binarySearch(arr1,7));
//        selectionSort(arr1,0);
//        System.out.println("Selection sort");
//        display(arr1);
//        int[] arr2 = {-5,8,1112,7,8,0,2,5,3};
//        display(arr2);
//        System.out.println("Insertion sort");
//        insertionSort(arr2,arr2.length);
//        display(arr2);
//        Elesson();
//
//        //Lesson 7
//        Slesson(7);
//        System.out.println("Sets of 3 up to 5");
//        List<int[]> sets = generate(4,3);
//        for(int[] set:sets){
//            display(set);
//        }
//        System.out.println("Map of (4,7) - "+map(4,7));
//        System.out.println("Answer for 17 people, with and without 4 friends? "
//                +party(17,4));
//        System.out.println("Answer for 6 people, with and without 3 friends? "
//                +party(6,3));
//        Elesson();
//
//        //Lesson 8
//        Slesson(8);
//        String ganan = "Ganan gidel dagan bagan";
//        System.out.println("''"+ganan+"'' has " + countChar(ganan,'g') + " time the char 'g'.");
//        System.out.println("5532 to int: "+ toInt("5532"));
//        System.out.println("0xA2F7 to int: "+toInt("0xA2F7"));
//        System.out.println("034517 to int: "+toInt("034517"));
//        Elesson();
//
//        //Lesson 9
//        Slesson(9);
//        System.out.println("Factorial of 5: "+fact(5));
//        System.out.println("Perfect match of 6: "+perfectMatch(6));
//        System.out.println("Fibonacci of 10: "+fib(10));
//        System.out.println("Spiderman is like mr. fibi");
//        Elesson();
//
//        //Lesson 10
//        Slesson(10);
//        System.out.println("GCD of 55, 75: "+recGCD(55,75));
//        System.out.println("gnikrow si siht ,pey - "+reverse("gnikrow si siht ,pey"));
//        hanoi(3,'a','c','b');
//        System.out.println("Choose 2 out of 5: "+choose(5,2));
//        Elesson();
//
//        //Lesson 11
//        Slesson(11);
//        Record car = new Record("TeslaX","180K");
//        Record boat = new Record("BoatX","1.8M");
//        System.out.println(car);
//        car.setValue("173K");
//        boat.setKey("BoatX2.0");
//        System.out.println(car.getValue());
//        System.out.println(boat.toString());
//        System.out.println("Car vs Boat\n"+car.compareTo(boat));
//        Elesson();

        //Lesson 12
        Slesson(12);

        Elesson();


    }

    public static void Slesson(int num){
        String space = "------------------------------------";
        System.out.println(space+"\nLesson "+num+":\n----------");
    }
    public static void Elesson(){
        String space = "------------------------------------";
        System.out.println("\n"+space+"\n");
    }

    public static void display(int[] arr){
        System.out.print("[");
        int i;
        for(i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(arr[i]);
        System.out.print("]\n");
    }
}
