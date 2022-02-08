package com.company;

import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class Lesson12 {

    public interface ListExample<T>{
        public int size();

        //Appends the specified element to the end of this list
        public void add(T element);

        //Inserts the specified element at the specified position in this list
        public void add( int index , T element);

        //Replaces the element at the specified position in this list with the specified element.
        public T set( int index , T element);

        //Returns the element at the specified position in this list.
        public T get( int index);

        //Removes the first occurrence of the specified element from this list, if it is present
         public boolean remove(T element);

        //Returns true if this list contains the specified element.
         public boolean contains(T element);

        //Returns true if this list contains no elements.
         public boolean isEmpty();
    }

    //List(interface), DynamicArray, DynamicArrayIterator - additional files

    //Prime up to, using dynamic array
    public static List<Integer> primesDynamicArray (int n){
        List<Integer> primes = new DynamicArray<Integer>();
        if(n<2) return primes;
        else primes.add(2);
        for(int num=3; num<=n; num=num+2){ // prime is not even
            boolean isPrime = true;

            for(int i=0; i<primes.size() && primes.get(i)*primes.get(i)<= num & isPrime;i++){
                if(num%primes.get(i) == 0)
                    isPrime = false;
            }
            if(isPrime) primes.add(num);
        }
        return primes;
    }
}
