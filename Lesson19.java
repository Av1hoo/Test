package com.company;

import java.util.Comparator;

public class Lesson19 {
    public static class StringComparator implements Comparator<String> {
    public int compare(String obj1 , String obj2){
            return obj1.compareTo(obj2);
        }
    }
}

