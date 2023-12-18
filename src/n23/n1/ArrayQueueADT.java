package n23.n1;

public abstract class ArrayQueueADT {
    private final Object[] queue;
    private int front, rear;
    private final int size;

    public ArrayQueueADT(int size) {
        this.size = size;
        queue = new Object[size];
        front = -1;
        rear = -1;
    }

    public static boolean isFull(ArrayQueueADT queue) {
        return (queue.front == (queue.rear + 1) % queue.size);
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.front == -1;
    }

    public static void enqueue(ArrayQueueADT queue, Object object) {
        if (isFull(queue)) {
            throw new ArrayIndexOutOfBoundsException("Очередь переполнена!");
        }
        if (isEmpty(queue)) queue.front = 0;
        queue.rear = (queue.rear + 1) % queue.size;
        queue.queue[queue.rear] = object;
    }

    public static Object element(ArrayQueueADT queue) {
        return queue.queue[queue.front];
    }

    public static Object dequeue(ArrayQueueADT queue) {
        if (isEmpty(queue))
            throw new ArrayIndexOutOfBoundsException("Очередь пустая");
        Object object = queue.queue[queue.front];
        queue.queue[queue.front] = null;
        if (queue.front == queue.rear) queue.front = queue.rear = -1;
        else queue.front = (queue.front + 1) % queue.size;
        return object;
    }
    public static void clear(ArrayQueueADT queue) {
        for (int i = 0; i < queue.size; i++)
            queue.queue[i] = null;
        queue.front = -1;
        queue.rear = -1;
    }

    public static void print(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
            System.out.println();
            return;
        }
        for (int i = queue.front; i != queue.rear; i = (i + 1) % queue.size) {
            System.out.print(queue.queue[i] + " ");
        }
        System.out.print(queue.queue[queue.rear] + " ");
        System.out.println();
    }
}
