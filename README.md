# Java Version Control Practice: Book and Library (OOP Basic)

Proyek ini adalah implementasi sederhana dari konsep Pemrograman Berorientasi Objek (OOP) di Java, menunjukkan penggunaan class, object, encapsulation (getter dan setter), serta interaksi antar class.

## 💡 Deskripsi Program

Program ini mensimulasikan dua entitas utama: **Buku** (`Book`) dan **Perpustakaan** (`Library`), untuk mempraktikkan konsep *Encapsulation* dan *Method Invocation*.

### Entitas Utama:

1.  **`Book`:** Mewakili sebuah buku dengan detail seperti judul, penulis, stok, dan harga.
2.  **`Library`:** Mewakili perpustakaan yang memiliki lokasi dan menyimpan satu objek `Book`.
3.  **`Main`:** Class utama untuk membuat objek, mengatur nilai (*setter*), dan menampilkan hasil.

## ⚙️ Fitur Kunci & Konsep OOP

Kode ini berfokus pada penerapan dua prinsip OOP utama:

### 1. Encapsulation (Enkapsulasi)

Semua properti (variabel) di dalam class `Book` dan `Library` dideklarasikan sebagai **`private`**. Akses dan modifikasi properti hanya bisa dilakukan melalui metode **`public`** (**Getter** dan **Setter**).

* **Contoh:** Properti `price` (harga) di `Book` tidak bisa diakses langsung, tetapi harus melalui `book.getPrice()` atau `book.setPrice()`.

### 2. Method Invocation & Logic

* **`calculateDiscount()`:** Method di class `Book` yang menghitung harga jual setelah diskon 10% ($10\%$ diskon adalah `0.1`).
  $$HargaDiskon = Harga Awal - (Harga Awal \times 0.1)$$
* **`displayInfo()`:** Method di class `Book` yang merapikan tampilan informasi buku, termasuk harga setelah diskon.
* **`displayLibraryInfo()`:** Method di class `Library` yang menampilkan lokasi perpustakaan dan kemudian memanggil `book.displayInfo()` untuk menampilkan detail buku yang tersimpan di dalamnya.

## 🚀 Panduan Penggunaan

Untuk menjalankan dan menguji program ini, ikuti langkah-langkah di bawah ini:

1.  **Kloning Repositori:**
    ```bash
    git clone <URL_repositori_Anda>
    ```
2.  **Kompilasi dan Eksekusi:**
    * Buka proyek di IntelliJ IDEA.
    * Pastikan `Main.java` berada di direktori sumber yang benar.
    * Jalankan class `Main` (klik ikon run/play di sebelah `public static void main`).

### Contoh Output yang Diharapkan: