public class Mahasiswa2Beraksi {
    public static void main(String[] args) {
        // Object 1: Data Anda Sendiri
        Mahasiswa2 mahasiswa1 = new Mahasiswa2();
        mahasiswa1.nama = "Ahmad"; // Ganti dengan nama Anda
        mahasiswa1.nim = "123456";  // Ganti dengan NIM Anda
        mahasiswa1.tampilkanNama();
        mahasiswa1.tampilkanNim();
        mahasiswa1.olahraga();

        System.out.println("-------------------------");

        // Object 2: Teman Pertama
        Mahasiswa2 mahasiswa2 = new Mahasiswa2();
        mahasiswa2.nama = "Budi";   // Ganti nama teman 1
        mahasiswa2.nim = "654321";  // Ganti NIM teman 1
        mahasiswa2.tampilkanNama();
        mahasiswa2.tampilkanNim();
        mahasiswa2.olahraga();

        System.out.println("-------------------------");

        // Object 3: Teman Kedua
        Mahasiswa2 mahasiswa3 = new Mahasiswa2();
        mahasiswa3.nama = "Citra";  // Ganti nama teman 2
        mahasiswa3.nim = "112233";  // Ganti NIM teman 2
        mahasiswa3.tampilkanNama();
        mahasiswa3.tampilkanNim();
        mahasiswa3.olahraga();
    }
}