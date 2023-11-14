package pr19;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

public class TypeToArray<T> {
    private ArrayList<T> list = new ArrayList<T>();

    public TypeToArray(T[] arr) {
        list = new ArrayList<T>();
        fillArray(arr);
    }

    private void fillArray(T[] arr) {
        list.addAll(Arrays.asList(arr));
    }

    public ArrayList<T> getArray() {
        return list;
    }

    public T getElemByIndex(int index) {
        if (index < list.size())
            return list.get(index);
        return null;
    }

    public void setList(T[] newlist) {
        list.clear();
        list.addAll(Arrays.asList(newlist));
    }

    public void print(int size) {
        int size_local = 0;
        for (T elem : getArray()) {
            System.out.println(elem.toString());
            size_local++;
            if (size <= size_local) {
                break;
            }
        }
    }
}
