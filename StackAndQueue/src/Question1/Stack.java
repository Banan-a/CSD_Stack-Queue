/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.EmptyStackException;

public class Stack {

    protected Node head;

    public Stack() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(int value) {
        head = new Node(value, head);
    }

    public void pushAll(int[] value) {
        for (int i = 0; i < value.length; i++) {
            this.push(value[i]);
        }
    }

    public void clear() {
        this.head = null;
    }

    public int top() throws EmptyStackException {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return head.value;
    }

    public int pop() throws EmptyStackException {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        int x = head.value;
        head = head.next;
        return x;
    }

    public void traversal() {
        if (this.isEmpty()) {
            return;
        }
        int x = this.pop();
        System.out.print(x + " ");
        this.traversal();
        this.push(x);
    }

    public void changeToBinary() {
        if (this.isEmpty()) {
            return;
        }
        int x = this.pop();
        System.out.println(x + " in binary is: " + Integer.toBinaryString(x));
        this.changeToBinary();
        this.push(x);
    }
}
