class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    public static void main(String[] args) {
        Node head = new Node(70);

        //add 30
        Node newNode1 = new Node(30);
        newNode1.next = head;
        head = newNode1;

        //add 56
        Node newNode2 = new Node(56);
        newNode2.next = head;
        head = newNode2;


        while (head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }


    }
}
