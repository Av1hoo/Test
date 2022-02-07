package com.company;

import static com.company.Lesson02.isPrime;

public class Lesson04 {

    // Compare 2 arrays
    public static boolean arraysEqual(int[] arr1, int[] arr2){
        boolean isEqual = arr1.length == arr2.length;
        for(int i=0; i<arr1.length & isEqual; i++){
            if(arr1[i] != arr2[i]) isEqual = false;
        }
        return isEqual;
    }

    // Array of all the primes, sortes them in an array
    public static int[] allPrimes(int num){
        int[] arr = new int[(int) (num/Math.log10(num))]; // max primes up to n
        int numOfPrimes = 0;

        for(int i=2; i<= num; i++){
            if(isPrime(i)){
                arr[numOfPrimes] = i;
                numOfPrimes++;
            }
        }
        int counter = 0;
        for(int prime:arr){
            if(prime != 0) counter++;
        }
        int[] cleanArr = new int[counter];
        System.arraycopy(arr, 0, cleanArr, 0, counter); // copy array from 0 up to counter index
        return cleanArr;
    }
}
