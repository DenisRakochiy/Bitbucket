package HW_2_2;

import java.util.ArrayList;

/**
 * Created by denis on 04.06.2017.
 */

public class IntegerCollection extends ArrayList<Integer> {

    @Override
    public boolean add(Integer integer) {
        if (integer != null) {
            super.add(integer);
            for (int i = 0; i < super.size() - 1; i++) {
                int oldValue = super.get(i);
                int newValue = oldValue + integer;
                super.set(i, newValue);
            }
        }
        return true;
    }

    @Override
    public Integer remove(int index) {
        int removedValue = get(index);
        super.remove(index);
        for (int i = 0; i < super.size(); i++) {
            int newValue = get(i) - removedValue;
            super.set(i, newValue);
        }
        return index;

    }
    //In this collection, max value always be first value
    public int max() {
        return get(0);
    }

    //In this collection, min value always be last value
    public int min() {
        return get(size() - 1);
    }

    public double average() {
        double sum = 0;
        for (int i = 0; i < super.size(); i++) {
            sum += get(i);
        }
        return sum / size();
    }


}
