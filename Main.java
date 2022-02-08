package com.company;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

import static com.company.Lesson01.*;
import static com.company.Lesson02.*;
import static com.company.Lesson03.*;
import static com.company.Lesson04.*;
import static com.company.Lesson05.*;
import static com.company.Lesson06.*;
import static com.company.Lesson07.*;
import static com.company.Lesson08.*;
import static com.company.Lesson09.*;
import static com.company.Lesson10.*;
import static com.company.Lesson11.*;
import static com.company.Lesson12.*;
import static com.company.Lesson13.*;
import static com.company.Lesson14.*;
import static com.company.Lesson15.*;
import static com.company.Lesson16.*;
import static com.company.Lesson17.*;
import static com.company.Lesson18.*;
import static com.company.Lesson19.*;
import static com.company.Lesson20.*;
import static com.company.Lesson21.*;
import static com.company.Lesson22.*;
import static com.company.Lesson23.*;
import static com.company.Lesson24.*;
import static com.company.Lesson25.*;
import static com.company.Lesson16.SetOperations.*;
import static com.company.Lesson17.SortAlgorithms.*;
import static com.company.Lesson17.StudentAverageComparator.*;

public class Main {

    public static void main(String[] args) {
//        //Lesson 1
//        Slesson(1);
//        System.out.println(naiveGCD(48,30));
//        System.out.println(euclidus(31,30));
//        knuth();
//        Elesson();
//
//        //Lesson 2
//        Slesson(2);
//        printPrimes(13);
//        System.out.println("5315 have " + digits(5315) + " digits.");
//        System.out.println("53 is prime?" + isPrime(53));
//        Elesson();
//
//        //Lesson 3
//        Slesson(3);
//        sizes();
//        orAnd();
//        Elesson();
//
//        // Lesson 4
//        Slesson(4);
//        int[] arr1 = {2,3,5,7};
//        int[] arr2 = {2,3,5};
//        int[] arr3 = {2,3,5,7};
//        System.out.println("arr1 equal to arr2? "+arraysEqual(arr1,arr2));
//        System.out.println("arr1 equal to arr3? "+arraysEqual(arr1,arr3));
//        int[] allprimes = allPrimes(43);
//        for(int num:allprimes)
//            System.out.println(num+" is PRIME!");
//
//        //Lesson 5
//        Slesson(5);
//        int[] arr1 = {2,5,8,0,2,5,3};
//        display(arr1);
//        System.out.println("The index of the minimum element is: "+minIndex(arr1));
//        System.out.println("Does arr1 sorted? " + isSorted(arr1));
//        int[] arr2 = {1,5,8,9,10};
//        display(arr2);
//        System.out.println("Does arr2 sorted? " + isSorted(arr2));
//        Elesson();
//
//        //Lesson 6
//        Slesson(6);
//        int[] arr1 = {2,7,8,0,2,5,3};
//        display(arr1);
//        System.out.println("Index of the number 3 is: "+ linearSearch(arr1,3));
//        System.out.println("Index of the number 7 is: "+ binarySearch(arr1,7));
//        selectionSort(arr1,0);
//        System.out.println("Selection sort");
//        display(arr1);
//        int[] arr2 = {-5,8,1112,7,8,0,2,5,3};
//        display(arr2);
//        System.out.println("Insertion sort");
//        insertionSort(arr2,arr2.length);
//        display(arr2);
//        Elesson();
//
//        //Lesson 7
//        Slesson(7);
//        System.out.println("Sets of 3 up to 5");
//        List<int[]> sets = generate(4,3);
//        for(int[] set:sets){
//            display(set);
//        }
//        System.out.println("Map of (4,7) - "+map(4,7));
//        System.out.println("Answer for 17 people, with and without 4 friends? "
//                +party(17,4));
//        System.out.println("Answer for 6 people, with and without 3 friends? "
//                +party(6,3));
//        Elesson();
//
//        //Lesson 8
//        Slesson(8);
//        String ganan = "Ganan gidel dagan bagan";
//        System.out.println("''"+ganan+"'' has " + countChar(ganan,'g') + " time the char 'g'.");
//        System.out.println("5532 to int: "+ toInt("5532"));
//        System.out.println("0xA2F7 to int: "+toInt("0xA2F7"));
//        System.out.println("034517 to int: "+toInt("034517"));
//        Elesson();
//
//        //Lesson 9
//        Slesson(9);
//        System.out.println("Factorial of 5: "+fact(5));
//        System.out.println("Perfect match of 6: "+perfectMatch(6));
//        System.out.println("Fibonacci of 10: "+fib(10));
//        System.out.println("Spiderman is like mr. fibi");
//        Elesson();
//
//        //Lesson 10
//        Slesson(10);
//        System.out.println("GCD of 55, 75: "+recGCD(55,75));
//        System.out.println("gnikrow si siht ,pey - "+reverse("gnikrow si siht ,pey"));
//        hanoi(3,'a','c','b');
//        System.out.println("Choose 2 out of 5: "+choose(5,2));
//        Elesson();
//
//        //Lesson 11
//        Slesson(11);
//        Record car = new Record("TeslaX","180K");
//        Record boat = new Record("BoatX","1.8M");
//        System.out.println(car);
//        car.setValue("173K");
//        boat.setKey("BoatX2.0");
//        System.out.println(car.getValue());
//        System.out.println(boat.toString());
//        System.out.println("Car vs Boat\n"+car.compareTo(boat));
//        Elesson();

//        //Lesson 12
//        Slesson(12);
//        //Using our implemention of Link
//        List<Integer> myList = new DynamicArray<Integer>();
//        //We can set the array initial size
//        List<Integer> myListWithSize = new DynamicArray<Integer>(5);
//        myList.add(12);
//        myList.add(13);
//        myList.add(14);
//        myListWithSize.add(12);
//        myListWithSize.add(14);
//        myListWithSize.add(1,13);
//        System.out.println(myList+"\n"+myListWithSize);
//        System.out.println("Comapre the 2 dymanic arrays: "+myList.equals(myListWithSize));
//        System.out.println("All the primes up to 31:\n"+primesDynamicArray(31));
//        Elesson();

//        //Lesson 13
//        Slesson(13);
//        PhoneNumber someNumber = new PhoneNumber("0544444435");
//        // we have 2 classes named record, we need to tell which one we using
//        Lesson13.Record<PhoneNumber> john = new Lesson13.Record<PhoneNumber>("John", someNumber);
//        System.out.println(john);
//        System.out.println(john instanceof Lesson13.Record);
//        System.out.println(john instanceof List);
//        System.out.println(john instanceof Object);
//
//        ContactPerson dana = new ContactPerson("dana",new PhoneNumber("0501122334"),"Co-worker");
//        System.out.println(dana);
//        Elesson();

//        //Lesson 14
//        Slesson(14);
//        Lesson14.DynamicIntegerArray lst = new Lesson14.DynamicIntegerArray();
//        lst.add(100);lst.add(90);lst.add(77);lst.add(85);lst.add(91);
//        System.out.println(lst);
//        System.out.println(lst.sum()+"/"+lst.size()+"="+lst.avg());
//        Elesson();

//        //Lesson 15
//        Slesson(15);
//        LinkedList<String> lessons = new LinkedList<>();
//        String first = "1th lesson";
//        lessons.addFirst(first);
//        for(int i=2; i<26;i++){
//            lessons.add(i+"th lesson");
//        }
//        System.out.println(lessons);
//        System.out.println(lessons.get(6)+"->"+lessons.get(7));
//
//        System.out.println("MISTER FIBI!");
//        Link<String> fib1 = new Link<>("0");
//        LinkedListIterator<String> iterlink = new LinkedListIterator<String>(fib1);
//        Link<String> fib2 = new Link<>(String.valueOf(fib(1)));
//        Link<String> fib3 = new Link<>(String.valueOf(fib(2)));
//        Link<String> fib4 = new Link<>(String.valueOf(fib(3)));
//        Link<String> fib5 = new Link<>(String.valueOf(fib(4)));
//        Link<String> fib6 = new Link<>(String.valueOf(fib(5)));
//        fib1.setNext(fib2);fib2.setNext(fib3);fib3.setNext(fib4);fib4.setNext(fib5);fib5.setNext(fib6);
//        while(iterlink.hasNext()){
//            System.out.println(iterlink.next());
//        }
//        Elesson();

//        //Lesson 16
//        Slesson(16);
//        System.out.println("for(<T> element: iterableObject)");
//        Set<Double> N = new SetAsDynamicArray<Double>();
//        for(double i=0; i<11;i++){
//            N.add(i); //autoboxing
//        }
//        Set<Double> Q = new SetAsDynamicArray<Double>();
//        for(double i=0;i<11;i=i+0.5)
//            Q.add(i);
//        System.out.println(N+"\n"+Q);
//        System.out.println("Uninon"+union(N,Q));
//        System.out.println("Intersection"+intersection(N,Q));
//        Iterator<Double> sub = subtraction(Q,N).iterator();
//        System.out.println("Q-N:");
//        while(sub.hasNext()){
//            System.out.println(sub.next());
//        }
//        Elesson();

//        //Lesson 17
//        Slesson(17);
//        System.out.println("FIBIIIIII using iterator");
//        FibonacciIterator fibi = new FibonacciIterator(15);
//        for(int i=0;i<7;i++){
//            System.out.println(fibi.next());
//        }
//        System.out.println("Comparable - 'aa' vs 'ab' or '234' vs '243'\n Let's sort an array of ints with it");
//        Integer[] simpleArrayAtLast = {2,6,-1,3,3213,1};
//        Iterator<Integer> arrBefore = Arrays.stream(simpleArrayAtLast).iterator();
//        while(arrBefore.hasNext())
//            System.out.print(arrBefore.next()+" ");
//        insertionSort(simpleArrayAtLast);
//        System.out.println("\nAnd...");
//        Iterator<Integer> arrAfter = Arrays.stream(simpleArrayAtLast).iterator();
//        while(arrAfter.hasNext())
//            System.out.print(arrAfter.next()+" ");
//        System.out.println("\n\nCompartor - Student1 vs Student2, WE need to decide what to comapre.");
//        System.out.println("Let's comapre student by their average.");
//        Student student1 = new Student("Miki",85);
//        Student student2 = new Student("Ahuva", 41);
//        Student student3 = new Student("Tuplin", 99);
//        System.out.println("Comapre our students grades:");
//        Comparator<Student> avg = new StudentAverageComparator();
//        Student[] lst = {student1,student2,student3};
//        insertionSort(lst,avg);
//        for(Student st:lst)
//            System.out.println(st);
//        Elesson();

        //Lesson 18
        Slesson(18);
        Elesson();

    }

    public static void Slesson(int num){
        String space = "------------------------------------";
        System.out.println(space+"\nLesson "+num+":\n----------");
    }
    public static void Elesson(){
        String space = "------------------------------------";
        System.out.println("\n"+space+"\n");
    }

    public static void display(int[] arr){
        System.out.print("[");
        int i;
        for(i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print(arr[i]);
        System.out.print("]\n");
    }
}
