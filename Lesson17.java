package com.company;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Lesson17 {

    public static class FibonacciIterator implements Iterator<Integer> {
        // Fields
        private int nextValue;
        private int previousValue;
        private int maxValue;
        // Constructor
        public FibonacciIterator(int maxValue) {
            nextValue = 1;
            previousValue = 0;
            this.maxValue = maxValue;
        }
        // Methods
        public boolean hasNext() {
            return nextValue <= maxValue & nextValue > 0;
        }
        public Integer next() {
            if (!hasNext()) {throw new NoSuchElementException();}
            int output = nextValue;
            nextValue = nextValue + previousValue;
            previousValue = output;
            return output;
        }
    }

    public static class SortAlgorithms {
        public static <T extends Comparable<T>> void insertionSort(T[] array) {
            for (int i = 1; i < array.length; i = i + 1)
                insert(array, i);
        }

        private static <T extends Comparable<T>> void insert(T[] array, int i){
            T value = array[i];
            while (i > 0 && array[i - 1].compareTo(value) > 0) {
                array[i] = array[i - 1];
                i = i - 1;
            }
            array[i] = value;
        }

        public static <T> void insertionSort(T[] array, Comparator<T> comp){
            for (int i = 1; i < array.length; i = i + 1)
                insert(array, i, comp);
        }

        private static <T> void insert(T[] array, int i, Comparator<T> comp){
            T value = array[i];
            while (i > 0 && comp.compare(array[i-1],value)> 0){
                array[i] = array[i - 1];
                i = i - 1;
            }
            array[i] = value;
        }

    }

    public static class Student{
        // Fields
        private String name;
        private double average;
        // Constructors
        public Student(String name, double average) {
            this.name = name;
            this.average = average;
        }
        // Methods
        public String getName(){return name;}
        public double getAverage(){return average;}
        public String toString() {
            return "("+name+", "+average+")";
        }
    }

    public static class StudentAverageComparator implements Comparator<Student> {

        public int compare(Student s1, Student s2) {
            int answer = (int) Math.signum(s1.getAverage() - s2.getAverage());
            if (answer == 0)
                answer = s1.getName().compareTo(s2.getName());
            return answer;
        }

    }

}
