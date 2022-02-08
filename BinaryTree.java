package com.company;


public class BinaryTree<T> {

    protected BinaryNode<T> root;

    public BinaryTree(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(T element) {
        if (element == null)
            throw new IllegalArgumentException();

        if(isEmpty())
            root = new BinaryNode<T>(element);
        else
            root.insert(element);
    }

    public boolean contains(T element) {
        if (element == null)
            throw new IllegalArgumentException();

        if(isEmpty())
            return false;
        else
            return root.contains(element);
    }

    public int height(){
        if(isEmpty())
            return -1;
        else
            return root.height();
    }

    public int size(){
        if(isEmpty())
            return 0;
        else
            return root.size();
    }

    public void printInOrder() {
        if(!isEmpty())
            root.printInOrder();
    }

    public void printPreOrder() {
        if(!isEmpty())
            root.printPreOrder();
    }

    public void printPostOrder() {
        if(!isEmpty())
            root.printPostOrder();
    }

    public boolean equals(Object other){
        boolean isEqual = false;
        if(other instanceof BinaryTree<?>) {
            BinaryTree<?> otherTree = (BinaryTree<?>) other;
            if (isEmpty())
                isEqual = otherTree.isEmpty();
            else
                isEqual = root.equals(otherTree.root);
        }
        return isEqual;
    }


} //class BinaryTree
