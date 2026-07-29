# Question 4 - Debugging & Problem Solving

## A. Bug pada kode

Ada kesalahan pada bagian perhitungan rata-rata.

```text
average = total / 0
```

sehingga proses perhitungan rata-rata tidak dapat dilakukan dengan benar.

---

## B. Cara memperbaiki

Karena perulangan dilakukan sebanyak 10 kali (1 sampai 10), maka rata-rata dibagi dengan jumlah data yaitu `10`.

```text
average = total / 10
```

Maka nilai rata-rata yang dihasilkan menjadi benar.

---

## C. Langkah-langkah ketika menemukan bug

1. Membaca pesan error yang muncul untuk mengetahui penyebab awal masalah.

2. Menelusuri bagian kode yang berkaitan dengan error tersebut.

3. Menggunakan debugging seperti `console.log()`, `dd()` untuk melihat nilai data saat program berjalan.

4. Setelah menemukan penyebabnya, saya memperbaiki kode tersebut lalu menjalankan kembali program untuk memastikan program sudah berjalan sesuai yang diharapkan.
