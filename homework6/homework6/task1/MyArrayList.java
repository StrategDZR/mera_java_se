package homework6.task1;

import java.util.Arrays;

public class MyArrayList<T> {

    private static final int MAX_COUNT = 10;
    private int count;
    private Object[] storage;

    public MyArrayList() {
        storage = new Object[MAX_COUNT];
        count = 0;
    }

    void add(T t) {
        if (count >= MAX_COUNT) {
            throw new MyArrayStoreException("Max count exceeded");
        } else {
            storage[count] = t;
            count++;
        }
    }

    boolean remove(T t) {
        boolean flag = false;
        for (int i = 0; i < count; ++i) {
            if (storage[i].equals(t)) {
                removeItem(i);
                flag = true;
                break;
            }
        }
        return flag;
    }

    private void removeItem(int index) {
        System.arraycopy(storage, index + 1, storage, index, count - index - 1);
        storage[--count] = null;
    }

    int size() {
        return count;
    }

    T[] toArray() {
        return (T[]) Arrays.copyOf(storage, count);
    }

    T get(int i) {
        return (T) storage[i];
    }
}