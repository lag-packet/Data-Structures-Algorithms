public class StackWithCustomArray<E> {
    Object[] arr = new Object[10];
    int size = 0;

    public void push(Object data) {
        if (size == arr.length) {
            Object[] arr2 = new Object[arr.length * 2];
            for (int i = 0; i < size; i++) {
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        arr[size] = data;
        size++;
    }

    public Object pop() {
        size--;
        return arr[size];
    }

    public E get(int index) {
        return (E) arr[index];
    }
}
