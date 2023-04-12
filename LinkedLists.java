package com.lbridgelabz.linkedList;

public class LinkedLists {
    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else if (head.next == null) {
            head.next = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            if(current.next != null)
                System.out.print(current.data + "->");
            else
                System.out.println(current.data + "\n");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        LinkedLists link = new LinkedLists();
        link.append(56);
        link.display();
        link.append(30);
        link.display();
        link.append(76);
        link.display();
    }
}
