package ThirdTask;

import java.util.*;

public class MyVector extends MyCollection {

    private int[] array = new int[0];

    public MyVector() {}

    MyVector(int[] a) {
        this.array = a;
    }


    @Override
    public void add(int element) {
        int tmp[]=new int[array.length+1];
        for(int i=0;i<array.length;i++){
            tmp[i]=array[i];
        }
        tmp[array.length]=element;
        array = new int[tmp.length];
        array = tmp;
    }

    @Override
    public void add(int index, int element) {
        int[] tmp = new int[array.length * 2];
        index--;
        for (int i = 0; i < index; i++) {
            tmp[i] = array[i];
        }
        tmp[index] = element;
        for (int i = index + 1; i < tmp.length; i++) {
            tmp[i] = array[i - 1];
        }
        array = tmp;
    }

    @Override
    public void clear() {
        array=new int[0];
    }

    @Override
    public boolean contains(int o) {
        for(int i=0;i<array.length;i++){
            if(array[i]==o){
                return true;
            }
        }
        return false;
    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public int indexOf(int o) {
return 1;
    }

    @Override
    public void insertElementAt(int element, int index) {
        add(index,element);
    }

    @Override
    public boolean isEmpty() {
        return array.length == 0;
    }

    @Override
    public void removeAt(int index) {
        array[index-1]= Integer.parseInt(null);
    }

    @Override
    public void remove(int element) {
        boolean trigger=false;
        int i=0;
        while (!trigger){
            if(array[i]==element){
                array[i]=0;
                trigger=true;
            }
            i++;
        }
    }

    @Override
    public void removeAll(int element) {
        for(int i=0;i<array.length;i++){
            if(array[i]==element){
                array[i]=0;
            }
        }
    }

    @Override
    public void reverse() {
        for (int i = 0; i < array.length / 2; i++) {
            int a = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = a;
        }
    }

    @Override
    public void set(int index, int element) {
        array[index] = element;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public void sort() {
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                if(array[i]>array[j]){
                    int c=array[i];
                    array[i]=array[j];
                    array[j]=c;
                }
            }
        }
    }

    @Override
    public int[] toArray() {
        return array;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
