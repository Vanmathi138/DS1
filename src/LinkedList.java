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
        Node head = new Node(56);
        head.next = new Node(30);
        head.next.next = new Node(70);

        while (head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }


    }
}
