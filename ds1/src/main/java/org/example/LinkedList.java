package org.example;

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
    public boolean insert(int key, Node newNode) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                newNode.next = current.next;
                current.next = newNode;
                return true;
            }
            current = current.next;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        return sb.toString();
    }

}

