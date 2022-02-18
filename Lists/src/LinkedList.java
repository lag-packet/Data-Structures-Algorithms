public class LinkedList<E> {

    private ListNode<E> head;
    private int size;

    public int size() {
        return size;
    }

    public E get(int index) {
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.getNext();
        }
        return (E) curr.getData();
    }

    public void add(int index, E data) {
        if (index == 0) {
            head = new ListNode<E>(data, head);
        } else {
            ListNode<E> curr = head;
            for (int i = 1; i < index; i++) {
                curr = curr.getNext();
            }
            curr.setNext(new ListNode<E>(data, curr.getNext()));
        }
        size++;
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.getNext();
        } else {
            ListNode<E> curr = head;
            for (int i = 1; i < index; i++) {
                curr = curr.getNext();
            }
            curr.setNext(curr.getNext().getNext());
        }
        size--;
    }
}
