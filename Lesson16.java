package com.company;

import java.util.Iterator;

public class Lesson16 {

    //We now have the interface Set
    //Lets implements the class SetAsDynamicArray
    public static class SetAsDynamicArray<T> implements Set<T> {
        private List<T> elements;

        public SetAsDynamicArray() {
            elements = new DynamicArray<>();
        }

        public Iterator<T> iterator() {
            return elements.iterator();
        }

        public boolean add(T element) {
            if(element == null)
                throw new IllegalArgumentException();
            if (! contains(element)){
                elements.add(element);
                return true;
            }
            return false;
        }

        public int size() {
            return elements.size();
        }

        public boolean contains(T element) {
            return elements.contains(element);
        }

        public boolean isEmpty() {
            return elements.isEmpty();
        }

        public boolean remove(T element) {
            return elements.remove(element);
        }

        public String toString() {
            String output = "Set: {";
            Iterator<T> iter = elements.iterator();
            while(iter.hasNext()){
                output = output + iter.next();
                if(iter.hasNext())
                    output = output + ", ";
            }
            output = output+"}";
            return output;
        }

        public boolean equals(Object other) {
            boolean isEqual = true;
            if (!(other instanceof Set<?>))
                isEqual = false;
            else {
                Set<?> otherSet = (Set<?>)other;
                if (size() != otherSet.size())
                    isEqual = false;
                else {
                    Iterator<T> iter = iterator();
                    while (iter.hasNext() & isEqual){
                        boolean found = false;
                        T next = iter.next();
                        Iterator<?> otherIter = ((Set<?>)other).iterator();
                        while(otherIter.hasNext() & !found){
                            if(next.equals(otherIter.next()))
                                found = true;
                        }
                        if(!found)
                            isEqual = false;
                    }
                }
            }
            return isEqual;
        }
    }

    public static class SetOperations {

        //A is subset of B
        public static <T> boolean subset(Set<T> setA, Set<T> setB) {
            boolean isSubset = true;
            Iterator<T> iterB = setB.iterator();
            while (iterB.hasNext() & isSubset){
                isSubset = setA.contains(iterB.next());
            }
            return isSubset;
        }

        //Returns A union B
        public static <T> Set<T> union(Set<T> setA, Set<T> setB) {
            Set<T> union = new SetAsDynamicArray<>();
            Iterator<T> iterA = setA.iterator();
            Iterator<T> iterB = setB.iterator();
            while (iterA.hasNext()){ // or use: for (T element: setA)
                union.add(iterA.next());
            }
            while (iterB.hasNext()){ // or use: for (T element: setB)
                union.add(iterB.next());
            }
            return union;
        }

        //Returns A intersection B
        public static <T> Set<T> intersection(Set<T> setA, Set<T> setB) {
            Set<T> intersection = new SetAsDynamicArray<>();
            Iterator<T> iterA = setA.iterator();
            while (iterA.hasNext()){ // // or use: for (T element: setA)
                T element = iterA.next();
                if (setB.contains(element))
                    intersection.add(element);
            }
            return intersection;
        }

        //Returns A subtraction B
        public static <T> Set<T> subtraction(Set<T> setA, Set<T> setB) {
            Set<T> subtraction = new SetAsDynamicArray<>();
            Iterator<T> iterSetA = setA.iterator();
            while (iterSetA.hasNext()){ // or use: for (T element: setA)
                T element = iterSetA.next();
                if (!setB.contains(element))
                    subtraction.add(element);
            }
            return subtraction;
        }

    }
}
