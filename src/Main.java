class Book {
    private String title;
    private String author;
    private int stock;
    private double price;

    private static final double DISCOUNT_RATE = 0.1;
    public double calculateDiscount() {
        return price - (price * DISCOUNT_RATE);
    }
    // Getter & Setter
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // Display info (sekarang lebih rapi)
    public void displayInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Stock: " + getStock());
        System.out.println("Price after discount: " + calculateDiscount());
    }
}

class Library {
    private Book book;
    private String location;

    // Getter & Setter (Encapsulate Field)
    public Book getBook() { return book; }
    public void setBook(Book book) { this.book = book; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public void displayLibraryInfo() {
        System.out.println("Library location: " + getLocation());
        if (book != null) {
            book.displayInfo();
        }
    }
}

// 🚚 Move Method: pindahkan main() ke class Main
public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Pemrograman Java");
        book.setAuthor("Milan N");
        book.setStock(10);
        book.setPrice(120000);

        Library library = new Library();
        library.setBook(book);
        library.setLocation("UMM Library");

        library.displayLibraryInfo();
    }
}
