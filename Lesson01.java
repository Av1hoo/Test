package com.company;

public class Lesson01 {

    // naive GCD, no error handling
    public static int naiveGCD(int m, int n){
        int i = m;
        while(!(m%i==0 & n%i==0)){
            i--;
        }
        return i;
    }

    // Euclidus algorithm
    public static int euclidus(int m, int n){
        int r = m%n;
        while (r!=0){
            m = n;
            n = r;
            r = m%n;
        }
        return n;
    }

    //Knuth rules for algorithm
    public static void knuth(){
        System.out.println("Knuth rules for algorithm:");
        String rules = "Finiteness\n" + "Definiteness\n" + "Input\n" +
                "Output\n" + "Effectiveness";
        String[] lines = rules.split("\\r?\\n");
        int i = 1;
        for(String line:lines){
            System.out.println(i+". "+line);
            i++;
        }
    }
}
