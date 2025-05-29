import org.example.LinkedList;
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
}