package pr9;

interface Nameable {
    String getName();
}

class Human implements Nameable {
    private String name;

    Human(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Planet implements Nameable {
    private String name;

    Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class mains {
    public static void main(String[] args) {
        Human h = new Human("Anton");
        Planet p = new Planet("Mars");
        System.out.printf("Human's name is %s\nPlanet's name is %s\n", h.getName(), p.getName());
    }
}