package com.company;

import java.util.Comparator;

public class BinarySearchTree<T> extends BinaryTree<T>{

    private Comparator<T> treeComparator;

    // This constructor builds an empty tree
    public BinarySearchTree(Comparator<T> myComparator){
        super();
        this.treeComparator = myComparator;
    }

    public void insert(T toInsert) {
        if(toInsert == null)
            throw new NullPointerException();
        if (isEmpty())
            root = new BinarySearchNode<T>(toInsert, treeComparator);
        else
            root.insert(toInsert);
    }

    public Comparator<T> getComparator() {
        return treeComparator;
    }

    public void remove(T toRemove) {
        if(toRemove == null)
            throw new IllegalArgumentException();
        if(!isEmpty())
            root = root.remove(toRemove);
    }



}
