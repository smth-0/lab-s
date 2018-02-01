package ThirdTask;

public class MyLinkedList extends MyCollection {
    Node head= new Node(), tail= new Node();

    public void add(int value) {

        if(head.value==0){
            head.value=value;
            head.next=tail;
        }
        else{
            add(value,size());

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
        head= new Node();
        tail= new Node();
    }

    @Override
    public boolean contains(int o) {
        Node tmp=head;

        if(head.next==null)return false;

        while (tmp!=tail){
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
            if(tmp.getNext()!=null) {
                tmp = tmp.getNext();
            }else {
                return 0;
            }
        }
        return tmp.getValue();
    }

    @Override
    public int indexOf(int o) {
        Node tmp=head;
        int i=0;
        while (tmp!=tail){
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
        if (head.next==null) {
            return true;
        } else if (head.getValue() == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void removeAt(int index) {
//        Node tmp=head;
//        for(int i=0;i<index;i++){
//            tmp=tmp.getNext();
//        }
//        tmp=tmp.getNext().getNext();


    }

    @Override
    public void remove(int element) {
        Node tmp=head;
        boolean trgr=false;
        for(int i=0;i!=size();i++){
            if(tmp.getValue()==element&&!trgr){
                trgr=true;
                removeAt(i);
            }
        }
    }

    @Override
    public void removeAll(int element) {
        Node tmp=head;

        for(int i=0;i!=size();i++){
            if(tmp.getValue()==element){
                removeAt(i);
            }
        }

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
        Node tmp=head;
        int i;
        for(i=0;;i++){
            if(tmp.getNext()!=null) {
                tmp = tmp.getNext();
            }else return 0;
            if(tmp==tail)break;
        }
        return i;
    }

    @Override
    public void sort() {

    }

    @Override
    public int[] toArray() {
        int[] array=new int[size()+1];
        Node tmp=head;
        for(int i=0;i<size();i++){
            array[i]=tmp.getValue();
            tmp=tmp.getNext();
        }
        return array;
    }

    @Override
    public void mergeSort() {

    }

    @Override
    public String toString() {
        Node tmp=head;
        String str=new String();
        str+="[";
        for(int i=0;i<=size();i++){
            str+=tmp.value;
            tmp=tmp.getNext();

            if(i!=size())str+=", ";
        }
        return str+"]";
    }

    public void swap(int position1, int position2){
        Node tmp=get(position1);
    }
}