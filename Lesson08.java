package com.company;

public class Lesson08 {


    //Count how many char appear in string
    public static int countChar(String str, char c){
        int counter = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == c) //char is primitive, no need for equal
                counter++;
        }
        return counter;
    }

    //
    public static int toInt(String s){
        int base,first;
        int power = 1;
        int value = 0;
        if(s.charAt(0) != '0' | s.length() ==1){
            first=0; base=10;
        }
        else if (s.charAt(1) != 'x'){
            first=1; base=8;
        }
        else{
            first=2; base=16;
        }

        for(int i=s.length()-1;i>=first;i--){
            value +=  toInt(s.charAt(i)) * power;
            power *= base;
        }
        return value;
    }

    private static int toInt(char c) {
        if(c>='0' & c<='9') return c-'0';
        return c-'A'+10;
    }
}
