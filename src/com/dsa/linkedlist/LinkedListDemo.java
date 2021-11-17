package com.dsa.linkedlist;

public class LinkedListDemo {
    public static void main(String a[]){
        NodeList list = new NodeList();
        list.add(new Node(1));
        list.add(new Node(2));
        list.add(new Node(3));
        list.add(new Node(4));
        list.add(new Node(5));

        list.display();
        System.out.println("After reversing the list.");
        list.reverse();
    }
}

class Node{
    int data;
    Node pre,next;

    public Node(int data){
        this.data = data;
    }
}

class NodeList{
    Node head,tail;
    int size;
    public NodeList(){

    }

    public boolean add(Node node){
        if (head == null){
            head = node;
            tail = node;
        }
        tail.next = node;
        node.pre = tail;
        tail = node;
        size++;
        return true;
    }

    public void display(){
        Node temp = head;
        for (int i=0;i<size;i++){
            if (temp != null){
                System.out.println((i+1)+" element is "+temp.data);
                temp = temp.next;
            }
        }

        System.out.println("Head is "+head.data+", Tail is "+tail.data);
    }

    public Node delete(){
        return null;
    }

    public Node reverse(){
        int tempSize = size;
        size = 0;
        Node tempNode = tail;
        head = null;
        for (int i=0;i<tempSize;i++){
            add(new Node(tempNode.data));
            tempNode = tempNode.pre;
        }
        display();
        return null;
    }
}


