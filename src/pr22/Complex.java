package pr22;

public class Complex {
    private int real;
    private int image;

    public Complex() {
    }

    ;

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    @Override
    public String toString() {
        return "\nComplex{" +
                "real=" + real +
                ", image=" + image +
                "}\n";
    }
}

