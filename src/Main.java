import ThirdTask.MyCollection;
import ThirdTask.MyLinkedList;
import ThirdTask.MyVector;

public class Main {
    public static void main(String args[]){
        MyCollection ll= new MyLinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        //ll.clear();

        System.out.println(ll.indexOf(1));


    }
}
