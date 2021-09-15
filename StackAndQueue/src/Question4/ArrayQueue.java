package Question4;

public class ArrayQueue {

    protected int last, first, size;
    protected Object[] storage;

    public ArrayQueue() {
        this(10);
    }

    public ArrayQueue(int n) {
        size = n;
        storage = new Object[size];
        first = last = -1;
    }

    //isFull
    public boolean isFull() {
        return ((first == 0
                && last == size - 1) || first == last + 1);

    }

    //check empty
    public boolean isEmpty() {
        return first == -1;
    }

    //clear value
    public void clear() {
        first = last = -1;
    }

    //add new value to the end of list
    public void enqueue(Object x) {

        if (last == size - 1 || last == -1) {
            storage[0] = x;
            last = 0;
            if (first == -1) {
                first = 0;
            }
        } else {
            storage[++last] = x;
        }

    }

    //remove first value and return it's value, throw for empty
    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("list empty");
            return null;
        }
        Object tmp = storage[first];
        if (first == last) {
            last = first = -1;
        } else if (first == size - 1) {
            first = 0;
        } else {
            first++;
        }
        return tmp;
    }

    // return value of the first node, throw Exception for empty queue
    public Object first() {
        if (isEmpty()) {
            System.out.println("The list is empty");
            return null;
        }
        return storage[first];
    }

    //display all values
    public void traverse() {
        if (isEmpty()) {
            System.out.println("list empty");
            return;
        }
        for (int i = first; i <= last; i++) {
            System.out.print(storage[i] + " ");
        }
        System.out.println();
    }

    public void addMany(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            enqueue(array[i]);
        }
    }

}
