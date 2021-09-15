package Question5;

public class Main {

    public static void main(String[] args) {
        Object[] a = {1, "C", 2.5, 3, "E"};
        Object x;
        Stack s = new Stack();

        ArrayQueue t = new ArrayQueue(10);
        Object[] list = new Object[]{"A", 2, "C", 5, "E", 1.5f, "F", "O"};
        Object tmp = "H";
        Object b;

        System.out.println("\n1. Test stack isEmpty");
        s.clear();
        s.traversal();
        System.out.println("is empty : " + s.isEmpty());

        System.out.println("\n2. Test stack clear");
        s.clear();
        s.pushAll(a);
        s.clear();
        s.traversal();

        System.out.println("\n3. Test stack push");
        s.clear();
        s.pushAll(a);
        s.traversal();

        System.out.println("\n4. Test stack pop()");
        s.clear();
        s.pushAll(a);
        x = s.pop();
        s.traversal();
        System.out.println("\nThe value to be popped out is: " + x);

        System.out.println("\n5. Test stack top()");
        s.clear();
        s.pushAll(a);
        x = s.top();
        s.traversal();
        System.out.println("\nThe value on the top is: " + x);

        System.out.println("\n6. Test stack traversal()");
        s.clear();
        s.pushAll(a);
        s.traversal();
        System.out.println();

        System.out.println("\n7. Test queue isEmpty");
        t.clear();
        t.traverse();
        System.out.println("is empty : " + t.isEmpty());

        System.out.println("\n8. Test queue clear");
        t.clear();
        t.addMany(list);
        t.clear();
        t.traverse();

        System.out.println("\n9. Test enQueue");
        t.clear();
        t.addMany(list);
        t.traverse();
        t.enqueue(tmp);
        t.traverse();

        System.out.println("\n10. Test deQueue");
        t.clear();
        t.addMany(list);
        t.traverse();
        System.out.println("Value return: " + t.dequeue());
        t.traverse();

        System.out.println("\n11. Test queue first");
        t.clear();
        t.addMany(list);
        t.traverse();
        b = t.first();
        System.out.println("First value: " + b);
        t.traverse();

        System.out.println("\n12. Test queue traverses");
        t.clear();
        t.addMany(list);
        t.traverse();
    }
}
