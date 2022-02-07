package com.company;

public class Lesson05 {

    //Finds the index of the minimun number in array
    public static int minIndex(int[] arr){
        int minIndex = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i] < arr[minIndex]) minIndex = i;
        }
        return minIndex;
    }

    //Finds if array is sorted
    public static boolean isSorted(int[] arr){
        if(arr == null)
            throw new IllegalArgumentException ("input array is null");
        if(arr.length==1) return true;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }
}
