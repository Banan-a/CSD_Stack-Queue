package Question4;

import java.util.EmptyStackException;

public class Stack {

    protected Node head;

    public Stack() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(char value) {
        head = new Node(value, head);
    }

    public void pushAll(char[] value) {
        for (int i = 0; i < value.length; i++) {
            this.push(value[i]);
        }
    }

    public void clear() {
        this.head = null;
    }

    public char top() throws EmptyStackException {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return head.value;
    }

    public char pop() throws EmptyStackException {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        char x = head.value;
        head = head.next;
        return x;
    }

    public void traversal() {
        if (this.isEmpty()) {
            return;
        }
        char x = this.pop();
        System.out.print(x + " ");
        this.traversal();
        this.push(x);
    }

}
