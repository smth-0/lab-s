import ThirdTask.MyCollection;
import ThirdTask.MyVector;

public class Main {
    public static void main(String args[]){
        MyCollection v = new MyVector();


        v.add(1);
        v.add(5);
        v.add(4);
        v.add(9);
        v.add(2);

        v.mergeSort();
    }
}
