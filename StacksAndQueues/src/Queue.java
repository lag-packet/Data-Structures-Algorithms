import java.util.LinkedList;
import java.util.List;

public class Queue<E> {

    List<E> list = new LinkedList<>();

    public void enqueue(E data) {
        list.add(data);
    }

    public E dequeue() {
        return list.remove(0);
    }
}
