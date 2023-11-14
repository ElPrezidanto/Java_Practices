package pr18;

public class Matrix {
    private int[][] arr;
    private int[][] arr2;
    private int[][] res;
    private int sX;
    private int sY;

    public Matrix(int size_x, int size_y) {
        arr = new int[size_x][size_y];
        sX = size_x;
        sY = size_y;
    }

    public int[][] getArr() {
        return arr;
    }

    public void setArr(int[][] arr) {
        this.arr = arr;
    }

    public boolean checkSize(int sx, int sy) {
        return sY == sx && sX == sy && sy > 0 && sx > 0;
    }

    public int[][] getRes(int[][] m, int mx, int my) {
        boolean f = checkSize(mx, my);
        if (f) {
            arr2 = m;
            res = new int[my][mx];
            int s = 0;
            for (int i = 0; i < my; i++) {
                for (int j = 0; j < my; j++)
                    res[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        return res;
    }
}