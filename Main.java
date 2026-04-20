ppublic class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Budi";
        mahasiswa.umur = 20;
        mahasiswa.nim = "123456";
        mahasiswa.tampilkanInfo();
        mahasiswa.tampilkanNim();

        Dosen dosen = new Dosen();
        dosen.nama = "Dr. Ahmad";
        dosen.umur = 40;
        dosen.nidn = "654321";
        dosen.tampilkanInfo();
        dosen.tampilkanNidn();
    }
}
    }
}