package n23.n1;


public class Main {
    public static void main(String[] args) {

        ArrayQueueModule.create(3);

        ArrayQueueModule.enqueue(100);
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.enqueue(3);;
        ArrayQueueModule.print();
        System.out.println(ArrayQueueModule.dequeue());
        ArrayQueueModule.print();
        ArrayQueueModule.clear();
        ArrayQueueModule.print();
        ArrayQueueADT queueADT = new ArrayQueueADT(3) {};

        ArrayQueueADT.enqueue(queueADT, 1);
        ArrayQueueADT.enqueue(queueADT, 2);
        ArrayQueueADT.enqueue(queueADT, 3);
        ArrayQueueADT.print(queueADT);

        System.out.println(ArrayQueueADT.dequeue(queueADT));
        ArrayQueueADT.print(queueADT);

        ArrayQueueADT.clear(queueADT);
        ArrayQueueADT.print(queueADT);

        ArrayQueue queue = new ArrayQueue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.print();
        System.out.println(queue.dequeue());
        queue.print();
        queue.clear();
        queue.print();
    }
}
