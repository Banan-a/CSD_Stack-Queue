package Question2;

public class Main {

    public static void main(String[] args) {
        ArrayQueue t = new ArrayQueue(10);
        Object[] list = new Object[]{-1, 1, 2, 3, 4, 5, 6, 7};
        Object tmp = 6;
        Object a;
        System.out.println("\n1. Test isEmpty");
        t.clear();
        t.traverse();
        System.out.println("is empty : " + t.isEmpty());

        System.out.println("\n2. Test Clear");
        t.clear();
        t.addMany(list);
        t.clear();
        t.traverse();

        System.out.println("\n3. Test enQueue");
        t.clear();
        t.addMany(list);
        t.traverse();
        t.enqueue(tmp);
        t.traverse();

        System.out.println("\n4. Test deQueue");
        t.clear();
        t.addMany(list);
        t.traverse();
        System.out.println("Value return: " + t.dequeue());
        t.traverse();

        System.out.println("\n5. Test first");
        t.clear();
        t.addMany(list);
        t.traverse();
        a = t.first();
        System.out.println("First value: " + a);
        t.traverse();

        System.out.println("\n6. Test traverses");
        t.clear();
        t.addMany(list);
        t.traverse();

        System.out.println("\n7. Test convert to binary");
        t.clear();
        t.addMany(list);
        t.changeToBinary();
    }
}
