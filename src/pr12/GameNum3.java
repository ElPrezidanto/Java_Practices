package pr12;

// 2 and 4 numbers from Queue and DoubleList
public class GameNum3 {
    private String[] names;
    private int round;
    private DequeList coloda1 = new DequeList();
    private DequeList coloda2 = new DequeList();

    private int StrToInt(char temp) {
        if (temp == '0') return 0;
        if (temp == '1') return 1;
        if (temp == '2') return 2;
        if (temp == '3') return 3;
        if (temp == '4') return 4;
        if (temp == '5') return 5;
        if (temp == '6') return 6;
        if (temp == '7') return 7;
        if (temp == '8') return 8;
        if (temp == '9') return 9;
        return -1;
    }

    public GameNum3(String name1, String name2, String data) {
        names = new String[2];
        names[0] = name1;
        names[1] = name2;
        boolean f = false;
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == ' ') {
                f = true;
                continue;
            }
            if (f) coloda2.add(StrToInt(data.charAt(i)));
            if (!f) coloda1.add(StrToInt(data.charAt(i)));
        }
    }

    public void start() {
        System.out.println("Start game");
        System.out.println(getNames()[0] + " " + getColoda1());
        System.out.println(getNames()[1] + " " + getColoda2());
        setRound(0);
        int val1, val2, temp;
        while (!getColoda1().isEmpty() && !getColoda2().isEmpty() && getRound() < 106) {
            setRound(getRound() + 1);
            val1 = getColoda1().element();
            val2 = getColoda2().element();
            if (val1 == -1 || val2 == -1) {
                System.out.println("Error");
                break;
            } else if (val1 == 0 && val2 == 9) {
                coloda1.add(val2);
                temp = val1;
                coloda1.removeIndex(0);
                coloda1.add(temp);
                coloda2.removeIndex(0);
            } else if (val2 == 0 && val1 == 9) {
                coloda2.add(val1);
                temp = val2;
                coloda2.removeIndex(0);
                coloda2.add(temp);
                coloda1.removeIndex(0);
            } else if (val1 > val2) {
                coloda1.add(val2);
                temp = val1;
                coloda1.removeIndex(0);
                coloda1.add(temp);
                coloda2.removeIndex(0);
            } else if (val1 < val2) {
                coloda2.add(val1);
                temp = val2;
                coloda2.removeIndex(0);
                coloda2.add(temp);
                coloda1.removeIndex(0);
            } else break;
        }
        if (getColoda2().isEmpty()) System.out.println("Winner is" + getNames()[0] + ": " + getRound() + " Rounds");
        if (getColoda1().isEmpty()) System.out.println("Winner is" + getNames()[1] + ": " + getRound() + " Rounds");
        if (getRound() == 106) System.out.println("draw");
    }

    public int getRound() {
        return round;
    }

    public DequeList getColoda1() {
        return coloda1;
    }

    public DequeList getColoda2() {
        return coloda2;
    }

    public String[] getNames() {
        return names;
    }

    public void setRound(int round) {
        this.round = round;
    }
}