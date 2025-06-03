import org.example.LinkedList;
import org.example.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class LinkedListTest {
    @Test
    public void testAddition() {
        Assertions.assertEquals(7, 4 + 3);
    }

    @Test
    public void search() {
        LinkedList list = new LinkedList();
        list.add(56);
        list.add(30);
        list.add(70);

        boolean result = list.search(30);
        Assertions.assertTrue(result);
    }
    @Test
    public void testInsertAfterKey() {
        LinkedList list = new LinkedList();
        list.add(56);
        list.add(30);
        list.add(70);

        Node node40 = new Node(40);
        boolean result = list.insert(30, node40);

        Assertions.assertTrue(result);
        Assertions.assertEquals("56 -> 30 -> 40 -> 70", list.toString());
    }
    @Test
    public void remove(){
        LinkedList list = new LinkedList();
        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);

        boolean result = list.removeElement(40);
        Assertions.assertTrue(result);
        int size=list.size();
        Assertions.assertEquals(3,size);
        Assertions.assertEquals("56 -> 30 -> 70", list.toString());
    }

}