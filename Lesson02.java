package com.company;

import java.util.Scanner;

import static com.company.Lesson01.euclidus;

public class Lesson02 {

    // Using Scanner to get an input from the user
    public static int GCD(){
        Scanner myScanner = new Scanner(System.in);
        int m = myScanner.nextInt();
        int n = myScanner.nextInt();
        return euclidus(m,n);
    }

    // return the number of the digits from a given input
    public static int digits(int num){
        int counter = 1;
        while(num>=10){
            num = num/10;
            counter++;
        }
        return counter;
    }

    //
    public static boolean isPrime(int n){
        boolean isPrime = true;
        int p = 2; // smallest divisor
        // while(p < n & isPrime){ // <- too slow, go through all the numbers
        while(p*p <= n & isPrime){
            if(n%p == 0) isPrime = false;
            else p++;
        }
        return isPrime;
    }

    // Prints all the primes up to numbers, start with 2
    public static void printPrimes(int num){
        int n = 2;
        while(n<=num){
            boolean isPrime = true;
            int p = 2;
            while(p*p <= n & isPrime){
                if(n%p == 0) isPrime = false;
                p++;
            }
            if(isPrime) System.out.println(n+ " is prime.");
            n++;
        }
    }
}
