package pr11;

public class Student {
    private static long[] iDNumber;

    public Student(int size) {
        iDNumber = new long[size];
    }

    public void add_value(long value) {
        for (int i = 0; i < iDNumber.length; i++) {
            if (iDNumber[i] == 0) {
                iDNumber[i] = value;
                break;
            }
        }
    }

    public void del_to_index(int index) {
        if (index < iDNumber.length) {
            iDNumber[index] = 0;
            for (int i = index; i < iDNumber.length - 1; i++) {
                iDNumber[i] = iDNumber[i + 1];

            }
            iDNumber[iDNumber.length - 1] = 0;
        } else {
            System.out.println("[ERROR] Size array is slow");
        }
    }

    public void sort() {
        int n = iDNumber.length;

        for (int i = 1; i < n; ++i) {
            long key = iDNumber[i];
            int j = i - 1;
            while (j >= 0 && iDNumber[j] > key) {
                iDNumber[j + 1] = iDNumber[j];
                j = j - 1;
            }
            iDNumber[j + 1] = key;
        }
    }

    public String toString() {
        StringBuilder text = new StringBuilder();
        for (long i : iDNumber) {
            text.append(i);
            text.append(' ');
        }
        return text.toString();
    }
}

