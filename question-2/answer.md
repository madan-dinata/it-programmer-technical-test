# Question 2 - Dasar SQL

## A. Menampilkan seluruh karyawan dari departemen IT

```sql
SELECT *
FROM Karyawan
WHERE Departemen = 'IT';
```

## B. Menghitung rata-rata gaji per departemen

```sql
SELECT Departemen, AVG(Gaji) AS RataRataGaji
FROM Karyawan
GROUP BY Departemen;
```

## C. Perbedaan INNER JOIN dan LEFT JOIN

INNER JOIN digunakan untuk menampilkan data yang memiliki pasangan di kedua tabel

Contoh:

```sql
SELECT Nama, Departemen
FROM Karyawan
INNER JOIN Departemen
ON Karyawan.ID = Departemen.EmployeeID;
```

Hasil:

```text
Madan    IT
```

Jika ada karyawan yang tidak memiliki data departemen, maka data tersebut tidak di tampilkan

---

LEFT JOIN digunakan untuk menampilkan seluruh data dari tabel sebelah kiri meskipun tidak memiliki pasangan pada tabel sebelah kanan.

Contoh:

```sql
SELECT Nama, Departemen
FROM Karyawan
LEFT JOIN Departemen
ON Karyawan.ID = Departemen.EmployeeID;
```

Hasil:

```text
Madan   IT
Laura   NULL
```

Jika ada karyawan yang tidak memiliki departemen, maka data tersebut tetap di tampilkan dengan nilai `NULL` pada kolom `Departemen`
