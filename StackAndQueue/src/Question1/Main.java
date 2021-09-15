package Question1;

public class Main {

    public static void main(String[] args) {
        int[] a = {5, 6, 7, 2, -1};
        int x;
        Stack s = new Stack();

        System.out.println("\n1. Test isEmpty");
        s.clear();
        s.traversal();
        System.out.println("is empty : " + s.isEmpty());

        System.out.println("\n2. Test clear");
        s.clear();
        s.pushAll(a);
        s.clear();
        s.traversal();

        System.out.println("\n3. Test push");
        s.clear();
        s.pushAll(a);
        s.traversal();

        System.out.println("\n4. Test pop()");
        s.clear();
        s.pushAll(a);
        x = s.pop();
        s.traversal();
        System.out.println("\nThe value to be popped out is: " + x);

        System.out.println("\n5. Test top()");
        s.clear();
        s.pushAll(a);
        x = s.top();
        s.traversal();
        System.out.println("\nThe value on the top is: " + x);

        System.out.println("6. Test traversal()");
        s.clear();
        s.pushAll(a);
        s.traversal();
        System.out.println();

        System.out.println("\n7. Test changeToBinary()");
        s.clear();
        s.pushAll(a);
        s.traversal();
        System.out.println("");
        s.changeToBinary();
    }
}
