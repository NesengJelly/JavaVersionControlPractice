// Versi awal: Menggunakan akses langsung (tanpa Getter/Setter) dan tanpa enkapsulasi
// Logika Library bisa digabungkan ke Main untuk kesederhanaan.

class Book {
    public String title;
    public String author;
    public int stock;
    public double price;

    private static final double DISCOUNT_RATE = 0.1;

    // Logika diskon tetap ada, karena ini adalah fungsi inti class
    public double calculateDiscount() {
        return price - (price * DISCOUNT_RATE);
    }

    // Method untuk menampilkan info
    public void displayInfo() {
        System.out.println("judul: " + title);
        System.out.println("Author: " + author);
        System.out.println("Stock: " + stock);
        System.out.println("Price after discount: " + calculateDiscount());
    }
}


public class Main {
    public static void main(String[] args) {
        // Objek Book
        Book book = new Book();

        // Mengakses dan mengubah properti secara langsung
        book.title = "Pemrograman Java";
        book.author = "Milan N";
        book.stock = 10;
        book.price = 120000;

        // Simulasi Library (disimpan sebagai variabel lokal sederhana)
        String libraryLocation = "UMM Library";

        System.out.println("Library location: " + libraryLocation);

        // Memanggil method dari objek Book
        book.displayInfo();
    }
}