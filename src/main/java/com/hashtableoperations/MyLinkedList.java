package com.hashtableoperations;

public class MyLinkedList<K> {

    public INode<K> tail;
    public INode<K> head;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void append(INode<K> newNode) {
        if(this.head == null)
            this.head = newNode;
        if (this.tail == null)
            this.tail = newNode;
        else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public INode<K> search(K key) {
        INode<K> tempNode = this.head;
        while (tempNode != null && tempNode.getNext() != null){
            if (tempNode.getKey().equals(key))
                return tempNode;
            tempNode = tempNode.getNext();
        }
        return null;
    }

    public void printMyNodes(){
        System.out.println("My nodes are " + head);
    }

    @Override
    public String toString() {
        return "MyLinkedListNodes{" + head + '}';
    }
}

