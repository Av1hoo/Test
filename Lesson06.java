package com.company;

public class Lesson06 {

    //Search in array one by one until found/end of array
    public static int linearSearch(int[] arr, int element){
        if (arr == null)
            throw new IllegalArgumentException();
        int index = -1;
        for(int i = 0; i<arr.length & index<0;i++){
            if (arr[i] == element) index = i;
        }
        return index;
    }

    //Search in sorted array,
    // check the middle index and split the array - depend if bigger or smaller
    public static int binarySearch(int[] arr, int num){
        if (arr == null)
            throw new IllegalArgumentException();
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == num) return mid;
            if(arr[mid] > num) {
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return -1;
    }


    //Swap 2 elements in the array
    public static void swapArr(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    //Sort given array,
    // each time find the smallest element and bring it to array[iterationNum-1]
    public static void selectionSort(int[] arr, int n){
        if (arr == null)
            throw new IllegalArgumentException();
        if(n >= arr.length) return;
        int low = n;
        for(int i = n+1; i<arr.length;i++){
            if(arr[i] < arr[low]){
                low = i;
            }
        }
        swapArr(arr,n,low);
        selectionSort(arr, n+1);
    }

    //Sort given array,
    //Each iteration find the currect index of the element
    public static void insertionSort(int[] arr, int len){
        if (arr == null)
            throw new IllegalArgumentException();
        if(len<2)return;
        insertionSort(arr,len-1);

        int last = arr[len-1];
        int j = len-2;

        while(j>=0 && arr[j] > last){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }
}
