package com.bridgelabz.linkedlist;

public class Linkedlist<T>{
    node<T> head;
    node<T> tail;
    public void push(T data) {
        node<T> newnode=new node<T>(data);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else {
            newnode.next = head;
            head = newnode;
        }
    }


    public void display() {
        node<T> temp=head;
        while(temp!=null){
            System.out.print("-->"+temp.data);
            temp=temp.next;

        }
    }

    public void add(T data) {
        node<T> newnode=new node<>(data);
        tail.next=newnode;
        tail=newnode;

    }
}
