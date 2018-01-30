package ThirdTask;

public class MyLinkedList extends MyCollection {
    Node head, tail;

    public void add(int value) {
        Node n = new Node(value);

        if (tail == null) tail = n;
        else {
            tail.next = n;
            tail = n;
        }
    }

    public void add(int value, int position){
        Node tmp=head;
        for(int i=0;i<position;i++){
            tmp=tmp.getNext();
        }

        Node n = new Node(value);
        n.next = tmp.next;
        tmp.next = n;
    }

    @Override
    public void clear() {
        head.next=null;
        tail.value= Integer.parseInt(null);
    }

    @Override
    public boolean contains(int o) {
        return false;
    }

    public int get(int position){
        Node tmp=head;
        for(int i=0;i<position;i++){
            tmp=tmp.getNext();
        }
        return tmp.getValue();
    }

    @Override
    public int indexOf(int o) {
        return 0;
    }

    @Override
    public void insertElementAt(int element, int index) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void removeAt(int index) {

    }

    @Override
    public void remove(int element) {

    }

    @Override
    public void removeAll(int element) {

    }

    @Override
    public void reverse() {

    }

    public void set(int value, int position){
        Node tmp=head;
        for(int i=0;i<position;i++){
            tmp=tmp.getNext();
        }
        tmp.setValue(value);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void sort() {

    }

    @Override
    public int[] toArray() {
        return new int[0];
    }

    @Override
    public void mergeSort() {

    }

    @Override
    public String toString() {
        return null;
    }

}