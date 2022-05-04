package dsa;

public class LinkedList {
    Node head;

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data)
    {

        Node new_node = new Node(data);
        new_node.next = null;

        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }

        return list;
    }

    public static void printList(LinkedList list)
    {
        Node currNode = list.head;
        System.out.print("LinkedList: ");

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
}

package com.nfletcher;

public class Node {

    private String data;
    private Node next;

    public Node(String d, Node n)
    {
        data = d;
        next = n;
    }
    public String getData()
    {
        return data;
    }
    public Node getNext()
    {
        return next;
    }
    public void setNext(Node n)
    {
        next = n;
    }
    public void setData(String d)
    {
        data = d;
    }
    public String toString()
    {
        return data + "-->";
    }
}
