package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    LinkedList list;
//    Node node = new Node();
    @BeforeEach
    void setUp() {
        list = new LinkedList();
    }

    @Test
    void isEmpty() {
        assertTrue(list.isEmpty());
    }

    @Test
    void size() {
        list.addToFront(new Node<>());
        assertTrue(list.size()==1);
    }

    @Test
    void addToFront() {
         Node node = new Node();
         node.setdata("one two three");
         list.addToFront(node);
         assertTrue(list.size()==1);
    }

    @Test
    void removeFirst() throws EmptyListException {
        Node newNode = new Node();
        newNode.setdata("Some");
        list.addToFront(newNode);
        assertNotNull(list.removeFirst());
    }
    @Test
    void removeFirstNotNull() throws EmptyListException {
        Node node2 = new Node();
        node2.setdata("Data");
        list.addToFront(node2);
        assertTrue(list.removeFirst()!=null);
    }

    @Test
    void throwEmptyListException() throws EmptyListException {
    assertThrows(EmptyListException.class, ()->{
        list.removeFirst();
        list.removeFirst();
    });
    }
}