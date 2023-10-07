package pr9;

interface Priceable {
    int getPrice();
}

class Camera implements Priceable {
    private int price;

    Camera(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}

class Keyboard implements Priceable {
    private int price;

    Keyboard(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}

class main {
    public static void main(String[] args) {
        Camera c = new Camera(5000);
        Keyboard k = new Keyboard(6990);
        System.out.printf("Camera's price is %d\nKeyboard's price is %d\n", c.getPrice(), k.getPrice());
    }
}