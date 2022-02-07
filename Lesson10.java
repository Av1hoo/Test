package com.company;

public class Lesson10 {

    public static int recGCD(int m, int n){
        if(m%n==0)
             return n;
        return recGCD(n, m%n);
    }

    public static String reverse(String s) {
        if(s.length() == 0) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void hanoi(int n, char source, char dest, char xt){
        System.out.println(n+" "+source+", "+dest+", "+xt);
        if(n>0){
            hanoi(n-1,source,xt,dest);
            System.out.println(source+"->"+dest);
            hanoi(n-1,xt,dest,source);
        }
    }

    public static int choose(int n, int k){
        int output;
        if(n<k) return 0;
        else if(k==0 | n==k) return 1;
        return choose(n-1,k) + choose(n-1,k-1);
    }
}
