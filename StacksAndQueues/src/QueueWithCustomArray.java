public class QueueWithCustomArray<E> {
    Object[] arr = new Object[10];
    private int start = 0;
    private int end = 0;

    public void enqueue(E data) {
        arr[end] = data;
        end++;
        end %= arr.length; // go back around beginning.
        if (end == start) {
            Object[] arr2 = new Object[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
    }

    public E dequeue() {
        if (start == end) {
            return null; //error no elements in arr
        }

        E toReturn = (E) arr[start];
        start++;
        start %= arr.length;
        return toReturn;
    }

    public void printElements() {
        for (int i = start; i < end; i++) {
            System.out.println(arr[i]);
        }
    }
}
