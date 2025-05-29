package org.example;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    Node head;
    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node current = head;
        while (current.next!=null){
            current = current.next;
        }
        current.next =newNode;
    }

    public boolean search(int key){
        Node c = head;
        while (c!=null){
            if (c.data==key){
                return true;
            }
            c=c.next;
        }
        return false;
    }


    public static void main(String[] args) {

        Node head = new Node(56);
        head.next = new Node(30);
        head.next.next = new Node(70);

        head = pop(head);

        head = popLast(head);

        while (head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }

    }

    private static Node popLast(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
        return head;
    }


    private static Node pop(Node head) {
        if (head==null){
            return null;
        }

        return head.next;
    }
}

