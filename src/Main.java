import ThirdTask.MyCollection;
import ThirdTask.MyVector;

public class Main {
    public static void main(String args[]){
        MyCollection c=new MyVector();
        System.out.println(c.toString());
        c.add(5);
        c.add(9);
        c.add(8);
        System.out.println(c.toString());
        c.add(0, 6);
        System.out.println(c.toString());
        c.reverse();
        System.out.println(c.toString());
        c.sort();
        System.out.println(c.toString());
        c.removeAt(1);
        System.out.println(c.toString());
    }
}
