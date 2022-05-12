package com.bridgelabz.linkedlist;

public class LinkedListmain {

    public static void main(String[] args) {
        Linkedlist linkedlist=new Linkedlist();
        linkedlist.push(70);
        linkedlist.push(30);
        linkedlist.push(56);
        linkedlist.display();
        System.out.println();
        System.out.println("====================");


        Linkedlist linkedlist1=new Linkedlist();
        linkedlist1.push(56);
        linkedlist1.add(30);
        linkedlist1.add(70);
        linkedlist1.display();
        System.out.println();
        System.out.println("====================");

        Linkedlist linkedlist2=new Linkedlist();
        linkedlist2.push(70);
        linkedlist2.push(56);
        linkedlist2.display();
        System.out.println();
        linkedlist2.insert(30);
        linkedlist2.display();
        System.out.println();
        System.out.println("====================");



        Linkedlist linkedlist3=new Linkedlist();
        linkedlist3.push(70);
        linkedlist3.push(30);
        linkedlist3.push(56);
        linkedlist3.display();
        Integer poppedElement= (Integer) linkedlist3.pop(70);
        System.out.println();
        System.out.println("The data removed is "+poppedElement);
        linkedlist3.display();
        System.out.println();
        System.out.println("====================");






    }

}
