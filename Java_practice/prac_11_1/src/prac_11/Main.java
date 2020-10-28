package prac_11;

public class Main {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue();
        ArrayQueueADT arrayQueueADT = new ArrayQueueADT();
        ArrayQueueModule arrayQueueModule = new ArrayQueueModule();
        LinkedQueue linkedQueue = new LinkedQueue();

        ArrayQueueTest.fill(arrayQueue);
        ArrayQueueTest.empty_test(arrayQueue);
        ArrayQueueTest.clear(arrayQueue);
        ArrayQueueTest.empty_test(arrayQueue);

        ArrayQueueADTTest.fill(arrayQueueADT);
        ArrayQueueADTTest.empty_test(arrayQueueADT);
        ArrayQueueADTTest.clear(arrayQueueADT);
        ArrayQueueADTTest.empty_test(arrayQueueADT);

        ArrayQueueModuleTest.fill(arrayQueueModule);
        ArrayQueueModuleTest.empty_test(arrayQueueModule);
        ArrayQueueModuleTest.clear(arrayQueueModule);
        ArrayQueueModuleTest.empty_test(arrayQueueModule);

        LinkedQueueTest.fill(linkedQueue);
        LinkedQueueTest.empty_test(linkedQueue);
        LinkedQueueTest.clear(linkedQueue);
        LinkedQueueTest.empty_test(linkedQueue);



    }
}
