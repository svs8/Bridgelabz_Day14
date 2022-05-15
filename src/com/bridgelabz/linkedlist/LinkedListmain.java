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
        Integer poppedElement= (Integer) linkedlist3.pop(56);
        System.out.println();
        System.out.println("The data removed is "+poppedElement);
        linkedlist3.display();
        System.out.println();
        System.out.println("====================");


        Linkedlist linkedlist4=new Linkedlist();
        linkedlist4.push(70);
        linkedlist4.push(30);
        linkedlist4.push(56);
        linkedlist4.display();
        linkedlist4.poplast(70);
        System.out.println();
        linkedlist4.display();
        System.out.println();
        System.out.println("====================");

        Linkedlist linkedlist5=new Linkedlist();
        linkedlist5.push(70);
        linkedlist5.push(30);
        linkedlist5.push(56);
        linkedlist5.display();
        System.out.println();
        if(linkedlist5.search(30)) {
            System.out.println("And the Data is found");
        }
        else System.out.println("Searched Data not found");
        System.out.println();
        System.out.println("====================");

        Linkedlist linkedlist6=new Linkedlist();
        linkedlist6.push(70);
        linkedlist6.push(30);
        linkedlist6.push(56);
        System.out.println("Before adding an node");
        linkedlist6.display();
        System.out.println();
       linkedlist6.insertAfter(30,40);
        System.out.println("After adding the node");
        System.out.println();
        linkedlist6.display();
        System.out.println();
        System.out.println("====================");

        Linkedlist linkedlist7=new Linkedlist();
        linkedlist7.push(70);
        linkedlist7.push(40);
        linkedlist7.push(30);
        linkedlist7.push(56);
        System.out.println("Before deleting the node");
        linkedlist7.display();
        System.out.println();
        linkedlist7.searchanddelete(40);
        System.out.println("After deleting the node");
        System.out.println();
        Integer size=linkedlist7.size();
        System.out.println("Size of the linked list is: "+size);
        System.out.println();
        linkedlist7.display();
        System.out.println();
        System.out.println("====================");




    }

}
