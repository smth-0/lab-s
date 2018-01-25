package ThirdTask;

public class MyLinkedList {
    Node head, tail;

    public void add(int value) {
        Node n = new Node(value);

        if (tail == null) tail = n;
        else {
            tail.next = n;
            tail = n;
        }
    }

}