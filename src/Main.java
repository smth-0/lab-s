import ThirdTask.MyCollection;
import ThirdTask.MyVector;

import java.util.Random;
import java.util.Vector;

public class Main {
    public static void main(String args[]){
        MyCollection c = new MyVector();
        Vector<Integer> v = new Vector<>();

        c.add(1059);
        c.add(258);

        c.set(0, 1);
        c.set(1, 2);

//        v.add(1059);
//
//        Random rnd = new Random(589);
//
//        for (int i = 1; i <= 10; ++i) {
//            c.add(rnd.nextInt(512));
//        }
//
//        rnd = new Random(589);
//        for (int i = 1; i <= 10; ++i) {
//            v.add(rnd.nextInt(512));
//        }
//
        System.out.println(c.toString());
//
//        c.add(2,10);
//        c.clear();
//        c.remove(5);
//        c.removeAll(1);
//        c.removeAt(5);
//        c.reverse();
//        System.out.println(v.toString());
    }

}
