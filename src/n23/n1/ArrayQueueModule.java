package n23.n1;

public class ArrayQueueModule {
    private static Object[] queue;
    private static int front, rear;
    private static int size;
    public static void create(int size) {
        ArrayQueueModule.size = size;
        queue = new Object[size];
        front = -1;
        rear = -1;
    }
    public static boolean isFull() {
        return (front == (rear + 1) % size);
    }
    public static boolean isEmpty() {
        return front == -1;
    }
    public static void enqueue(Object object) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException("Очередь переполнена");
        }
        if (isEmpty()) front = 0;
        rear = (rear + 1) % size;
        queue[rear] = object;
    }
    public static Object element() {
        return queue[front];
    }
    public static Object dequeue() {
        if (isEmpty())
            throw new ArrayIndexOutOfBoundsException("Очередь пустая");

        Object object = queue[front];
        queue[front] = null;
        if (front == rear) front = rear = -1;
        else front = (front + 1) % size;
        return object;
    }

    public static void clear() {
        for (int i = 0; i < size; i++)
            queue[i] = null;
        front = -1;
        rear = -1;
    }

    public static void print() {
        if (isEmpty()) {
            System.out.println();
            return;
        }
        for (int i = front; i != rear; i = (i + 1) % size) {
            System.out.print(queue[i] + " ");
        }
        System.out.print(queue[rear] + " ");
        System.out.println();
    }
}
