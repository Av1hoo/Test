package com.company;

import java.util.Comparator;

public class BinarySearchNode<T> extends BinaryNode<T>{

    private Comparator<T> treeComparator;

    public BinarySearchNode(T data, Comparator<T> myComparator) {
        super(data);
        this.treeComparator = myComparator;
    }

    public T findMin(){
        BinaryNode<T> currNode = this;
        while (currNode.left != null){
            currNode = currNode.left;
        }
        return currNode.data;
    }

    public Comparator<T> getComparator(){
        return treeComparator;
    }

    public void insert(T toInsert) {
        if (treeComparator.compare(data, toInsert) > 0){
            if (left == null)
                left = new BinarySearchNode<T>(toInsert, treeComparator);
            else left.insert(toInsert);
        }
        else if (treeComparator.compare(data, toInsert) < 0){
            if (right == null)
                right = new BinarySearchNode<T>(toInsert, treeComparator);
            else right.insert(toInsert);
        }
    }

    public boolean contains(T element) {
        if (treeComparator.compare(data, element) == 0)
            return true;
        else if (treeComparator.compare(data, element) > 0){
            return (left != null && left.contains(element));
        }
        else
            return (right != null && right.contains(element));
    }

    public BinaryNode<T> remove(T toRemove){
        if (treeComparator.compare(data, toRemove) > 0){
            if (left != null)
                left = left.remove(toRemove);
        }
        else if (treeComparator.compare(data, toRemove) < 0){
            if (right != null)
                right = right.remove(toRemove);
        }
        else{ //need to remove the data in this node
            if (left == null | right == null){ // 0/1 children
                if (left == null) 	     // (base cases)
                    return right;
                else
                    return left;
            }
            else{ // this node has two children
                data = ((BinarySearchNode<T>) right).findMin();
                right = right.remove(data);
            }
        }
        return this;
    }


}

