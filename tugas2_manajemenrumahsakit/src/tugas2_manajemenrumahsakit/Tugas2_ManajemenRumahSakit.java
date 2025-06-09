package tugas2_manajemenrumahsakit;

public class Tugas2_ManajemenRumahSakit {
    
    // Class Untuk Pasien 
    static class Pasien { 
        String nama;
        String nomorRm;
        String tanggalLahir;
        String alamat;

        // Konstruktor kosong
        public Pasien() {
        }

        // Konstruktor lengkap
        public Pasien(String nama, String nomorRm, String tanggalLahir, String alamat) {
            this.nama = nama;
            this.nomorRm = nomorRm;
            this.tanggalLahir = tanggalLahir;
            this.alamat = alamat;
        }

        // Mutator (Setter)
        public void setNama(String nama) {
            this.nama = nama;
        }

        public void setNomorRm(String nomorRm) {
            this.nomorRm = nomorRm;
        }

        public void setTanggalLahir(String tanggalLahir) {
            this.tanggalLahir = tanggalLahir;
        }

        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }

        // Accessor (Getter)
        public String getNama() {
            return nama;
        }

        public String getNomorRm() {
            return nomorRm;
        }

        public String getTanggalLahir() {
            return tanggalLahir;
        }

        public String getAlamat() {
            return alamat;
        }
    }

    // Class Untuk Dokter
    static class Dokter { 
        String nama;
        String spesialisasi;
        String nip;
        String nomorTelepon;

        // Konstruktor kosong
        public Dokter() {
        }

        // Konstruktor lengkap
        public Dokter(String nama, String spesialisasi, String nip, String nomorTelepon) {
            this.nama = nama;
            this.spesialisasi = spesialisasi;
            this.nip = nip;
            this.nomorTelepon = nomorTelepon;
        }

        // Mutator (Setter)
        public void setNama(String nama) {
            this.nama = nama;
        }

        public void setSpesialisasi(String spesialisasi) {
            this.spesialisasi = spesialisasi;
        }

        public void setNip(String nip) {
            this.nip = nip;
        }

        public void setNomorTelepon(String nomorTelepon) {
            this.nomorTelepon = nomorTelepon;
        }

        // Accessor (Getter)
        public String getNama() {
            return nama;
        }

        public String getSpesialisasi() {
            return spesialisasi;
        }

        public String getNip() {
            return nip;
        }

        public String getNomorTelepon() {
            return nomorTelepon;
        }
    }

    // Class Untuk Rekam Medis
    static class RekamMedis {
        String nomorRM;
        String tanggalPemeriksaan;
        String diagnosa;
        String tindakan;

        // Konstruktor kosong
        public RekamMedis() {
        }

        // Konstruktor lengkap
        public RekamMedis(String nomorRM, String tanggalPemeriksaan, String diagnosa, String tindakan) {
            this.nomorRM = nomorRM;
            this.tanggalPemeriksaan = tanggalPemeriksaan;
            this.diagnosa = diagnosa;
            this.tindakan = tindakan;
        }

        // Mutator (Setter)
        public void setNomorRM(String nomorRM) {
            this.nomorRM = nomorRM;
        }

        public void setTanggalPemeriksaan(String tanggalPemeriksaan) {
            this.tanggalPemeriksaan = tanggalPemeriksaan;
        }

        public void setDiagnosa(String diagnosa) {
            this.diagnosa = diagnosa;
        }

        public void setTindakan(String tindakan) {
            this.tindakan = tindakan;
        }

        // Accessor (Getter)
        public String getNomorRM() {
            return nomorRM;
        }

        public String getTanggalPemeriksaan() {
            return tanggalPemeriksaan;
        }

        public String getDiagnosa() {
            return diagnosa;
        }

        public String getTindakan() {
            return tindakan;
        }
    }

    // Class Untuk Ruang Rawat 
    static class RuangRawat  {
        String namaRuang;
        int kapasitas;
        String jenis;
        boolean tersedia;

        // Konstruktor kosong
        public RuangRawat() {
        }

        // Konstruktor lengkap
        public RuangRawat(String namaRuang, int kapasitas, String jenis, boolean tersedia) {
            this.namaRuang = namaRuang;
            this.kapasitas = kapasitas;
            this.jenis = jenis;
            this.tersedia = tersedia;
        }

        // Mutator (Setter)
        public void setNamaRuang(String namaRuang) {
            this.namaRuang = namaRuang;
        }

        public void setKapasitas(int kapasitas) {
            this.kapasitas = kapasitas;
        }

        public void setJenis(String jenis) {
            this.jenis = jenis;
        }

        public void setTersedia(boolean tersedia) {
            this.tersedia = tersedia;
        }

        // Accessor (Getter)
        public String getNamaRuang() {
            return namaRuang;
        }

        public int getKapasitas() {
            return kapasitas;
        }

        public String getJenis() {
            return jenis;
        }

        public boolean isTersedia() {
            return tersedia;
        }
    }

    // Method Utama 
    public static void main(String[] args){
        // Membuat Objek Pasien1
        Pasien pasien1 = new Pasien();
        pasien1.nama = "Noor Shahla Qeysha Revarani";
        pasien1.nomorRm = "20438";
        pasien1.tanggalLahir = "23-05-2004";
        pasien1.alamat = "Jl.Taruna Praja Raya No 1 ";

        // Membuat objek Pasien2
        Pasien pasien2 = new Pasien();
        pasien2.nama = "Munira Hayati";
        pasien2.nomorRm = "20437";
        pasien2.tanggalLahir = "23-05-2003";
        pasien2.alamat = "Jl.Taruna Praja Raya No 8 ";

        // Membuat objek dokter1
        Dokter dokter1 = new Dokter();
        dokter1.nama = "Dr. Shahla Qeysha, Sp.JP";
        dokter1.spesialisasi = "Ahli Bedah Kardiotoraks";
        dokter1.nip = "230520041122";
        dokter1.nomorTelepon = "085252452303";

        // Membuat objek rekammedis 1 
        RekamMedis RekamMedis1 = new RekamMedis();
        RekamMedis1.nomorRM = pasien1.nomorRm;
        RekamMedis1.tanggalPemeriksaan = "21-04-2025";
        RekamMedis1.diagnosa = "Sesak dan Muntah";
        RekamMedis1.tindakan = "Diberikan Obat Metoclopramide Injeksi";

        // Membuat Objek Ruang Rawat 1 
        RuangRawat ruang1 = new RuangRawat();
        ruang1.namaRuang = "Ruang Paviliun Firdaus 402";
        ruang1.kapasitas = 1;
        ruang1.jenis = "VIP";
        ruang1.tersedia = true;

        // Menampilkan data pasien1
        System.out.println("=== Data Pasien 1 ===");
        System.out.println("Nama : " + pasien1.nama);
        System.out.println("Nomor RM : " + pasien1.nomorRm);
        System.out.println("Tanggal Lahir : " + pasien1.tanggalLahir);
        System.out.println("Alamat : " + pasien1.alamat);

        // Menampilkan data dokter1
        System.out.println("\n=== Data Dokter ===");
        System.out.println("Nama : " + dokter1.nama);
        System.out.println("Spesialisasi : " + dokter1.spesialisasi);
        System.out.println("NIP : " + dokter1.nip);
        System.out.println("No Telepon : " + dokter1.nomorTelepon);

        // Menampilkan data Rekam Medis 
        System.out.println("\n=== Data Rekam Medis ===");
        System.out.println("Nomor RM Pasien : " + RekamMedis1.nomorRM);
        System.out.println("Tanggal Pemeriksaan : " + RekamMedis1.tanggalPemeriksaan);
        System.out.println("Diagnosa : " + RekamMedis1.diagnosa);
        System.out.println("Tindakan : " + RekamMedis1.tindakan);

        // Menampilkan Data Ruang Rawat 
        System.out.println("\n=== Data Ruang Rawat ===");
        System.out.println("Nama Ruang : " + ruang1.namaRuang);
        System.out.println("Jenis : " + ruang1.jenis);
        System.out.println("Kapasitas : " + ruang1.kapasitas);
        System.out.println("Tersedia : " + (ruang1.tersedia ? "Ya" : "Tidak" ));
    }
}
