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
        Node tmp=head;
        while (tmp==tail){
            if(tmp.getValue()==o){
                return true;
            }
            tmp=tmp.getNext();
        }
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
        Node tmp=head;
        int i=0;
        while (tmp==tail){
            if(tmp.getValue()==o){
                return i;
            }
            tmp=tmp.getNext();
            i++;
        }
        return -1;
    }

    @Override
    public void insertElementAt(int element, int index) {
        add(element,index);
    }

    @Override
    public boolean isEmpty() {
        if(head.getValue()==0||head.getNext()==null){
            return true;
        }
        return false;
    }

    @Override
    public void removeAt(int index) {
        Node tmp=head;
        for(int i=0;i<index;i++){
            tmp=tmp.getNext();
        }
        tmp=tmp.getNext().getNext();


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