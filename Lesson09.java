package com.company;

public class Lesson09 {
    public static int fact(int n){
        int output;
        if(n==0) return 1;
        output = n*fact(n-1);
        return output;
    }

    public static int perfectMatch(int n){
        int output;
        if(n==0) return 1;
        output = (n-1)*perfectMatch(n-2);
        return output;
    }

    public static int fib(int n){
        if(n<2) return 1;
        return fib(n-1) + fib(n-2);
    }
}
