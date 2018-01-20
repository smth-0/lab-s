package ThirdTask;

import java.util.Arrays;

public class MyVector extends MyCollection {

    private int[] array;

    MyVector() {

    }

    MyVector(int[] a) {
        this.array = a;
    }


    @Override
    public void add(int element) {
        int tmp[] = new int[0];
        for(int i=0;i<array.length;i++){
            tmp[i]=array[i];
            array[i]=0;
        }
        tmp[tmp.length]=element;
        System.arraycopy(tmp, 0, array, 0, tmp.length);
    }

    @Override
    public void add(int index, int element) {
        int tmp[] = new int[0];
        int i;

        for(i=0;i<index;i++){
            tmp[i]=array[i];
            array[i]=0;
        }
        tmp[index]=element;
        i++;
        for(;i<array.length+1;i++){
            tmp[i]=array[i-1];
            array[i-1]=0;
        }
        for(i=0;i<array.length+1;i++){
            array[i]=tmp[i];
        }
    }

    @Override
    public void clear() {
        for(int i=0;i<array.length+1;i++){
            array[i]=0;
        }
    }

    @Override
    public boolean contains(int o) {
        for (int anArray : array) {
            if (anArray == o) {
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
        for (int i = 0; i < array.length; i++) {
            if (array[i] == o) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void insertElementAt(int element, int index) {
        //
    }

    @Override
    public boolean isEmpty() {
        return array.length == 0;
    }

    @Override
    public void removeAt(int index) {
        int tmp[] = new int[0];
        int i;
        for(i=0;i<index;i++){
            tmp[i]=array[i];
            array[i]=0;
        }
        tmp[index]=0;
        i++;
        for(;i<array.length+1;i++){
            tmp[i]=array[i-1];
            array[i-1]=0;
        }
        for(i=0;i<array.length+1;i++){
            array[i]=tmp[i];
        }
    }

    @Override
    public void remove(int element) {
        int tmp[] = new int[0];
        int i;
        boolean trigger=false;
        for(i=0;i<array.length;i++){
            if(array[i]==element&& !trigger) {
                trigger=true;
            }else {
                tmp[i]=array[i];
            }
            array[i]=0;
        }
        for(i=0;i<array.length+1;i++){
            array[i]=tmp[i];
        }
    }

    @Override
    public void removeAll(int element) {
        int tmp[] = new int[0];
        int i;
        int pos=0;
        for(i=0;i<array.length;i++){
            if(array[i]!=element) {
                tmp[pos]=array[i];
                pos++;
            }

        }
        for(i=0;i<tmp.length;i++){
            array[i]=tmp[i];
        }
    }

    @Override
    public void reverse() {
        for (int i = 0; i < array.length / 2 + 1; i++) {
            int a = array[i];
            array[i] = array[array.length - i];
            array[array.length - i] = a;
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
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
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
