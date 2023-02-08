package exam;

public class Book {
    private String title;
    private Author name;
    private double price;

    public Book(String title, Author name, double price) {
        this.title = title;
        this.name = name;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public Author getName() {
        return name;
    }

    public Book setName(Author name) {
        this.name = name;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Book setPrice(double price) {
        this.price = price;
        return this;
    }

    public String toString() {
        return "Book{" +
                "title= '" + title + '\'' +
                ", name= " + name +
                ", price= " + price +
                '}';
    }

}
