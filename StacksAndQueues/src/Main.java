public class Main {

    public static void main(String[] args) {
        System.out.println("----Custom Stack---");
        StackWithCustomArray customStack = new StackWithCustomArray();
        customStack.push(1);
        customStack.push(2);
        customStack.push(3);
        for (int i = 0; i < customStack.size; i++) {
            System.out.println(customStack.get(i));
        }

        System.out.println();
        customStack.pop();
        for (int i = 0; i < customStack.size; i++) {
            System.out.println(customStack.get(i));
        }

        System.out.println();
        System.out.println("----Formal Stack---");
        Stack formalStack = new Stack();
        formalStack.push(1);
        formalStack.push(2);
        formalStack.push(3);
        for (int i = 0; i < formalStack.list.size(); i++) {
            System.out.println(formalStack.list.get(i));
        }

        System.out.println();
        formalStack.pop();
        for (int i = 0; i < formalStack.list.size(); i++) {
            System.out.println(formalStack.list.get(i));
        }

        System.out.println();
        System.out.println("----Formal Queue---");
        Queue formalQueue = new Queue();
        formalQueue.enqueue(1);
        formalQueue.enqueue(2);
        formalQueue.enqueue(3);
        for(int i = 0; i < formalQueue.list.size(); i++) {
            System.out.println(formalQueue.list.get(i));
        }

        System.out.println();
        formalQueue.dequeue();
        for(int i = 0; i < formalQueue.list.size(); i++) {
            System.out.println(formalQueue.list.get(i));
        }

        System.out.println();
        System.out.println("----Custom Queue---");
        QueueWithCustomArray customQueue = new QueueWithCustomArray();
        customQueue.enqueue(1);
        customQueue.enqueue(2);
        customQueue.enqueue(3);
        for(int i = 0; i < customQueue.arr.length; i++) {
            System.out.println(customQueue.arr[i]);
        }

        System.out.println();
        customQueue.dequeue();
        customQueue.printElements(); //must print elements directly to make use of start variable in the class.
    }
}
