public class ListNode<E> {

    private E data;
    private ListNode<E> next;

    public ListNode(E data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    public void setData(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public void setNext(ListNode ls) {
        next = ls;
    }

    public ListNode getNext() {
        return next;
    }
}
