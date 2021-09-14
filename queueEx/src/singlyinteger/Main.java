package singlyinteger;

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

        System.out.println("\n2. Test enQueue");
        t.clear();
        t.addMany(list);
        t.traverse();
        t.enqueue(tmp);
        t.traverse();

        System.out.println("\n3. Test deQueue");
        t.clear();
        t.addMany(list);
        t.traverse();
        t.dequeue();
        t.traverse();

        System.out.println("\n4. Test first");
        t.clear();
        t.addMany(list);
        t.traverse();
        a = t.first();
        System.out.println(a);

        System.out.println("\n4. Test traverses");
        t.clear();
        t.addMany(list);
        t.traverse();

        System.out.println("\n5. Test convert to binary");
        t.clear();
        t.addMany(list);
        t.changeToBinary();
    }
}
