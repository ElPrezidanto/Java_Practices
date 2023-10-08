package pr11;

public class Comparator {
    private String name;
    private double stud_bal;

    public double getBal() {
        return stud_bal;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Student: " + getName() + ": " + getBal();
    }

    public Comparator(String n, double b) {
        name = n;
        stud_bal = b;
    }

    public int compareTo(Comparator otherStudent) {
        if (stud_bal < otherStudent.stud_bal) {
            return 1;
        } else if (stud_bal > otherStudent.stud_bal) {
            return -1;
        } else {
            return 0;
        }
    }
}
