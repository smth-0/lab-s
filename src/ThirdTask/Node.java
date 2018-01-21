package ThirdTask;

/**
 * Created in 21.01.18. package ${PACKAGE_NAME}.
 * in project lab-s.
 */
public class Node {
    Node next;
    int value;

    public Node getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", value=" + value +
                '}';
    }
}
