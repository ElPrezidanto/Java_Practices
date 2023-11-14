package pr18;

import pr16.Main;

public class MinMax<T> {
    private int[] arr;

    public MinMax(int size, int[] arr) {
        this.arr = arr;
    }

    public int Max() {
        int Max = -99999999;
        for (int j : arr) {
            if (Max < j) Max = j;
        }
        return Max;
    }

    public int Min() {
        int Min = 99999999;
        for (int j : arr) {
            if (Min > j) Min = j;
        }
        return Min;
    }
}
