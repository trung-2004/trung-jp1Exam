package exam;

public class BookDemo {
    public static void main(String[] args) {
        Author a1 = new Author("Russel", "Winderand");
        Book b1 = new Book("Developing Java Software", a1, 79.75);
        System.out.println(b1.toString());
    }
}
