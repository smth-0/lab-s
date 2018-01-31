import ThirdTask.MyCollection;
import ThirdTask.MyLinkedList;
import ThirdTask.MyVector;

public class Main {
    public static void main(String args[]){
        MyCollection ll= new MyLinkedList();
        ll.add(1);
        //ll.clear();
        ll.add(2);
        ll.add(3);
        ll.add(4);

        System.out.println(ll.isEmpty());
        System.out.println(ll.contains(3));
        ll.add(2);
        ll.add(3);
        ll.add(4);
        //while (true){}
        //System.out.println(ll.isEmpty());
        //System.out.println(ll.toString());
        //System.out.println(ll.get(0));

    }
}
