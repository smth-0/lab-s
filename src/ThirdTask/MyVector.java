package ThirdTask;

public class MyVector extends MyCollection {

    private int[] array;

    MyVector() {

    }

    MyVector(int[] a) {
        this.array = a;
    }


    @Override
    public void add(int element) {
        /
    }

    @Override
    public void add(int index, int element) {
        /
    }

    @Override
    public void clear() {
        /
    }

    @Override
    public boolean contains(int o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == o) {
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
        /
    }

    @Override
    public boolean isEmpty() {
        if (array.length == 0) {
            return true;
        } else return false;
    }

    @Override
    public void removeAt(int index) {
        /
    }

    @Override
    public void remove(int element) {
        /
    }

    @Override
    public void removeAll(int element) {
        /
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
        return array.toString();
    }
}
