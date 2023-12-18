package n23.n2;

import java.util.LinkedList;

public class LinkedQueue implements Queue {
    private final LinkedList<Object> queue;


    public LinkedQueue() {
        queue = new LinkedList<>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void enqueue(Object object) {
        queue.add(object);
    }

    public Object element() {
        return queue.get(0);
    }

    public Object dequeue() {
        if (isEmpty())
            throw new ArrayIndexOutOfBoundsException("Очередь пустая");

        return queue.pop();
    }
    public void clear() {
        queue.clear();
    }

    public void print() {
        for (Object o : queue) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        LinkedQueue queue1 = new LinkedQueue();

        queue1.enqueue(1);
        queue1.enqueue(2);
        queue1.enqueue(3);
        queue1.print();
        System.out.println(queue1.dequeue());
        queue1.print();
        queue1.clear();
        queue1.print();
    }
}
