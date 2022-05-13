package com.bridgelabz.linkedlist;

public class Linkedlist<T> {
    node<T> head;
    node<T> tail;

    public void push(T data) {
        node<T> newnode = new node<T>(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }


    public void display() {
        node<T> temp = head;
        while (temp != null) {
            System.out.print("->" + temp.data);
            temp = temp.next;

        }
    }

    public void add(T data) {
        node<T> newnode = new node<>(data);
        tail.next = newnode;
        tail = newnode;

    }

    public void insert(T data) {
        node<T> newNode = new node<>(data);
        head.next = newNode;
        newNode.next = tail;
        System.out.println("Number to be added between 70 and 56 is" + data);
    }

    public T pop(T data) {
        node<T> newNode = new node<>(data);
        node<T> poppedNode = head;
        T element = poppedNode.data;
        node<T> nextNode = poppedNode.next;
        poppedNode.next = null;
        poppedNode.data = null;
        head = nextNode;
        return element;
    }

    public T poplast(T data) {
        node<T> newNode = new node<>(data);
        node<T> poppedNode = tail;
        T element = poppedNode.data;
        node<T> previousNode = head.next;
        poppedNode.data = null;
        poppedNode.next = null;
        tail = previousNode;
        tail.next = null;
        return element;
    }

    public boolean search(T searchData) {
        node<T> newNode = new node<>(searchData);
        node<T> temp = head;
        T searchedData=null;
        while (temp != null) {
            if (temp.data == newNode.data) {
                searchedData=temp.data;
                System.out.println("searched data is "+searchData);
                return true;
            }
            temp = temp.next;
        }
       return false;
    }

    public void insertAfter(T searchData,T insertData) {
        node<T> insertNode=new node<>(insertData);
        node<T> searchedNode=new node<>(searchData);
        node<T> temp=head;
        while(temp!=null){
            if(temp.data==searchData){
                searchedNode=temp;
                insertNode.next=searchedNode.next;
                searchedNode.next=insertNode;
                break;
            }
            temp=temp.next;
        }
    }
}
