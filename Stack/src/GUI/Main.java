/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.Stack;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        int[] a = {5, 6, 7, 2, -1};
        int x;
        Stack s = new Stack();
        
        System.out.println("1. Test traversal()");
        s.clear();
        s.pushAll(a);
        s.traversal();
        System.out.println();
        
        System.out.println("\n2. Test pop()"); 
        s.clear();
        s.pushAll(a);
        x = s.pop();
        s.traversal();
        System.out.println("\nThe value to be popped out is: " + x);
        
        System.out.println("\n3. Test top()"); 
        s.clear();
        s.pushAll(a);
        x = s.top();
        s.traversal();
        System.out.println("\nThe value on the top is: " + x);
        
        System.out.println("\n4. Test changeToBinary()");
        s.clear();
        s.pushAll(a);
        s.traversal();
        System.out.println("");
        s.changeToBinary();
    }
}
