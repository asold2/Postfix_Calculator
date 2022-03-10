package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class LinkedStackTest {
    private LinkedStack stack;
    @BeforeEach
    void setUp(){
        stack = new LinkedStack();
    }

    @Test
    void isEmpty() {
        assertTrue(stack.isEmpty());
    }
    @Test
    void isNotEmpty() {
        stack.push(new Node<>());
        assertTrue(!stack.isEmpty());
    }

    @Test
    void push() {
        stack.push(new Node<>());
        assertTrue(!stack.isEmpty());
    }

    @Test
    void pop() {
        assertNull(stack.pop());
    }
    @Test
    void popNotNull(){
        stack.push(new Node<>());
        assertNotNull(stack.pop());
    }


    }

