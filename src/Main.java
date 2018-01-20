import ThirdTask.MyCollection;
import ThirdTask.MyVector;

import java.util.Random;
import java.util.Vector;

public class Main {
    public static void main(String args[]){
        MyCollection c = new MyVector();
        Vector<Integer> v = new Vector<>();
        c.add(1059);
        v.add(1059);

        Random rnd = new Random(589);

        for (int i = 1; i <= 10; ++i) {
            c.add(rnd.nextInt(512));
        }

        rnd = new Random(589);
        for (int i = 1; i <= 10; ++i) {
            v.add(rnd.nextInt(512));
        }

        System.out.println(c.toString());
        System.out.println(v.toString());
    }

}
