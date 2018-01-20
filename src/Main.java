import ThirdTask.MyCollection;
import ThirdTask.MyVector;

import java.util.Vector;

public class Main {
    public static void main(String args[]){
        MyCollection c=new MyVector();
        c.add(5);
        c.add(1,6);
        c.reverse();
        c.sort();
        System.out.println(c.toString());


    }

}
