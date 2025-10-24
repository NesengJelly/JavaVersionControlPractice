# Java Project Refactoring Practice: Book and Library

Proyek ini mendemonstrasikan proses *refactoring* (perbaikan struktur kode) dari implementasi Java yang sederhana menjadi implementasi yang lebih sesuai dengan prinsip **Pemrograman Berorientasi Objek (OOP)**, khususnya **Encapsulation** dan **Object Composition**.

---

## 🔄 Analisis Refactoring (Perubahan)

Perubahan ini dilakukan untuk meningkatkan kualitas, modularitas, dan keterbacaan kode, serta memastikan penerapan prinsip OOP yang benar.

### 1. Perbandingan Implementasi Class

| Prinsip | Implementasi Awal (Versi Sekarang) | Implementasi Akhir (Setelah Refactoring) | Manfaat |
| :--- | :--- | :--- | :--- |
| **Encapsulation** | Properti di `class Book` bersifat **`public`**. Akses dan perubahan nilai dilakukan secara **langsung** (e.g., `book.title = "..."`). | Properti `private` + metode **Getter & Setter** (`getTitle()`, `setTitle()`). | **Proteksi Data:** Mencegah perubahan data yang tidak terduga dan memungkinkan penambahan validasi di masa depan. |
| **Object Composition** | Logika "perpustakaan" (lokasi) ditangani sebagai variabel sederhana di dalam `class Main`. | Dibuat **`class Library`** terpisah yang menampung objek `Book` dan `location`. | **Modularitas:** Memisahkan tanggung jawab (Sistem Perpustakaan vs. Objek Buku), membuat kode lebih terstruktur dan mudah diuji. |
| **Keterbacaan `Main`** | `Main` menangani inisialisasi buku dan beberapa logika output sederhana. | `Main` hanya berfungsi sebagai *entry point* yang fokus pada pembuatan objek dan memanggil metode utama (`library.displayLibraryInfo()`). | **Clean Code:** Membuat class utama lebih ringkas dan fokus pada alur eksekusi aplikasi. |

---

## 🚀 Panduan Penggunaan

Kode ini dapat dijalankan langsung di IntelliJ IDEA.

### 1. Persiapan

Pastikan Anda telah mengkloning repositori ini dan membuka proyeknya di IntelliJ IDEA.

### 2. Eksekusi

Jalankan `public static void main` yang berada di `class Main`.

### Contoh Output Program (Setelah Perubahan):