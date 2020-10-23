package homework6.task1;

import java.util.ArrayList;

public class MyArrayList<T> extends ArrayList<T>{

    private static final int MAX_COUNT = 10;
    private int count;

    @Override
    public boolean add(T t) {
        count++;
        if (count > MAX_COUNT) {
            throw new MyArrayStoreException();
        }
        return super.add(t);
    }
}
