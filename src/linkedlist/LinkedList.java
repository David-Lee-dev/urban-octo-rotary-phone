package linkedlist;

public class LinkedList<T> {
    private LinkedListNode<T> head;
    private LinkedListNode<T> tail;
    public int size = 0;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(T data) {
        LinkedListNode<T> node = new LinkedListNode<T>(data);

        if (this.head == null && this.tail == null) this.head = node;
        else this.tail.next = node;

        this.tail = node;
        this.size++;
    }

    public void add(T data, int index) throws Exception {
        if (index > this.size || index < 1) throw new Exception("index error");

        LinkedListNode<T> node = new LinkedListNode<T>(data);

        if (index == 1) {
            node.next = this.head;
            this.head = node;
        } else if(index == this.size) {
            add(data);
            return;
        } else {
            LinkedListNode<T> target = this.head;

            int cnt = 1;
            while (cnt++ < index - 1) {
                target = target.next;
            }

            node.next = target.next;
            target.next = node;
        }

        this.size++;
    }

    public void remove() {
        if (this.head == this.tail) {
            this.head = null;
            this.tail = null;

            return;
        }

        LinkedListNode<T> target = this.head;
        while (target.next.next != null) target = target.next;

        target.next = null;
        this.size--;
    }

    public void remove(int index) throws Exception {
        if (index > size || index < 1) throw new Exception("index error");

        LinkedListNode<T> target = this.head;

        int cnt = 1;
        while (cnt++ < index - 1) {
            target = target.next;
        }

        target.next = target.next.next;
        this.size--;
    }

    public void print() {
        LinkedListNode<T> target = this.head;

        System.out.println("===print===");
        for (int i = 0; i < this.size; i++) {
            System.out.println(target.data);
            target = target.next;
        }
        System.out.println();
    }
}
