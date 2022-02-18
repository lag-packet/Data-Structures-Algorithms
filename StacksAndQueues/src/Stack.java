import java.util.ArrayList;
import java.util.List;

public class Stack <E>{
    List<E> list = new ArrayList<E>();

    public void push(E data) {
        list.add(data);
    }

    public E pop() {
        return list.remove(list.size() - 1);
    }
}
