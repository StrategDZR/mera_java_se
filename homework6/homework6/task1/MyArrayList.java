package homework6.task1;

public class MyArrayList<T> {

    private static final int MAX_COUNT = 10;
    private int count = 0;
    private Object[] storage;

    public MyArrayList() {
        storage = (T[]) new Object[MAX_COUNT];
    }

    public Object[] getStorage() {
        return storage;
    }

    void add(T t) {
        if (count > MAX_COUNT - 1) {
            throw new MyArrayStoreException();
        } else {
            storage[count] = t;
            count++;
        }
    }

    boolean remove(T t) {
        boolean flag = false;
        for (int i = 0; i < storage.length; i++) {
            if (t.equals(storage[i])) {
                storage[i] = null;
                flag = true;
            }
        }
        return flag;
    }

    int size(){
        return storage.length;
    }

    T[] toArray(){return (T[]) storage;}

    T get(int i){return (T) storage[i];}

}
