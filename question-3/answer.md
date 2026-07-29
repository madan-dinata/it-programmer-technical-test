# Question 3 - Konsep Dasar Pemrograman

## A. Perbedaan variabel, tipe data, dan konstanta

- **Variabel** digunakan untuk menyimpan data yang nilainya dapat berubah.

- **Tipe data** digunakan untuk menentukan jenis data yang disimpan, misalnya `string`, `number`, atau `boolean`.

- **Konstanta** digunakan untuk menyimpan data yang nilainya tidak dapat diubah setelah dideklarasikan.

Contoh sederhana pada TypeScript:

```ts
let employeeName: string = "Madan"
const department: string = "IT"
let nik: number = 700700
let isMarried: boolean = false
```

Catatan:

- `employeeName`, `nik`, dan `isMarried` adalah **variabel**.
- `department` adalah **konstanta** karena nilainya tidak dapat diubah setelah dideklarasikan.
- `string`, `number`, dan `boolean` merupakan **tipe data** yang digunakan pada variabel dan konstanta tersebut.

---

## B. Object Oriented Programming (OOP)

Object Oriented Programming (OOP) adalah konsep pemrograman yang menyusun program ke dalam object sehingga kode lebih mudah diatur, digunakan kembali, dan dikembangkan.

Empat pilar utama OOP yaitu:

1. **Encapsulation**
   Menyembunyikan data atau proses tertentu agar hanya bisa diakses melalui method yang disediakan.

2. **Inheritance**
   Memungkinkan sebuah class mewarisi property dan method dari class lain.

3. **Polymorphism**
   Memungkinkan method yang sama memiliki implementasi yang berbeda sesuai object yang digunakan.

4. **Abstraction**
   Menyembunyikan detail implementasi dan hanya menampilkan fungsi yang memang diperlukan.

---

## C. Perbedaan Array dan Object

Array digunakan untuk menyimpan kumpulan data berurutan dan diakses menggunakan index.

Contoh:

```ts
const employees = ["Madan", "Laura"]
```

Array lebih cocok digunakan ketika menyimpan banyak data dengan tipe yang sama.

---

Object digunakan untuk menyimpan data yang memiliki pasangan key dan value.

Contoh:

```ts
const employee = {
  name: "Madan",
  department: "IT",
  age: 25
}
```

Object lebih cocok digunakan ketika menyimpan informasi dari satu data yang memiliki beberapa properti.
