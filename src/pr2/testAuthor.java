package pr2;

public class testAuthor {
    public static void main(String[] args) {
        author k1 = new author("Alex", "alex@mail.ru", 'm');
        char gender = k1.getGender();
        System.out.println(k1.toString());
    }
}
