package ThirdTask;

import java.util.Arrays;

public class MyVector extends MyCollection {

    private int[] array = new int[1];

    public MyVector() {}

    MyVector(int[] a) {
        this.array = a;
    }


    @Override
    public void add(int element) {


    }

    @Override
    public void add(int index, int element) {

    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(int o) {

    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public int indexOf(int o) {

    }

    @Override
    public void insertElementAt(int element, int index) {

    }

    @Override
    public boolean isEmpty() {
        return array.length == 0;
    }

    @Override
    public void removeAt(int index) {

    }

    @Override
    public void remove(int element) {

    }

    @Override
    public void removeAll(int element) {

    }

    @Override
    public void reverse() {

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
