package cobatugas3;

public class Cobatugas3 {

    // =======================
    // CLASS PASIEN
    // =======================
    static class Pasien {
        // Atribut private untuk menjaga keamanan data pasien
        private String nama;
        private String nomorRm;
        private String tanggalLahir;
        private String alamat;

        // Konstruktor: digunakan untuk langsung mengisi data saat objek dibuat
        public Pasien(String nama, String nomorRm, String tanggalLahir, String alamat) {
            this.nama = nama;
            this.nomorRm = nomorRm;
            this.tanggalLahir = tanggalLahir;
            this.alamat = alamat;
        }

        // Method getter (accessor) untuk mengambil nilai atribut
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

        // Method setter (mutator) untuk mengubah nilai atribut
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
    }

    // =======================
    // CLASS DOKTER
    // =======================
    static class Dokter {
        private String nama;
        private String spesialisasi;
        private String nip;
        private String nomorTelepon;

        public Dokter(String nama, String spesialisasi, String nip, String nomorTelepon) {
            this.nama = nama;
            this.spesialisasi = spesialisasi;
            this.nip = nip;
            this.nomorTelepon = nomorTelepon;
        }

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
    }

    // =======================
    // CLASS REKAM MEDIS
    // =======================
    static class RekamMedis {
        private String nomorRM;
        private String tanggalPemeriksaan;
        private String diagnosa;
        private String tindakan;

        public RekamMedis(String nomorRM, String tanggalPemeriksaan, String diagnosa, String tindakan) {
            this.nomorRM = nomorRM;
            this.tanggalPemeriksaan = tanggalPemeriksaan;
            this.diagnosa = diagnosa;
            this.tindakan = tindakan;
        }

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
    }

    // =======================
    // CLASS RUANG RAWAT
    // =======================
    static class RuangRawat {
        private String namaRuang;
        private int kapasitas;
        private String jenis;
        private boolean tersedia;

        public RuangRawat(String namaRuang, int kapasitas, String jenis, boolean tersedia) {
            this.namaRuang = namaRuang;
            this.kapasitas = kapasitas;
            this.jenis = jenis;
            this.tersedia = tersedia;
        }

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
    }

    // =======================
    // METHOD UTAMA
    // =======================
    public static void main(String[] args) {
        // Membuat objek Pasien menggunakan konstruktor
        Pasien pasien1 = new Pasien("Noor Shahla Qeysha Revarani", "20438", "23-05-2004", "Jl.Taruna Praja Raya No 1");
        Pasien pasien2 = new Pasien("Munira Hayati", "20437", "23-05-2003", "Jl.Taruna Praja Raya No 8");

        // Membuat objek Dokter
        Dokter dokter1 = new Dokter("Dr. Shahla Qeysha, Sp.JP", "Ahli Bedah Kardiotoraks", "230520041122", "085252452303");

        // Membuat objek Rekam Medis dengan data dari pasien1
        RekamMedis rekamMedis1 = new RekamMedis(pasien1.getNomorRm(), "21-04-2025", "Sesak dan Muntah", "Diberikan Obat Metoclopramide Injeksi");

        // Membuat objek Ruang Rawat
        RuangRawat ruang1 = new RuangRawat("Ruang Paviliun Firdaus 402", 1, "VIP", true);

        // Menampilkan Data Pasien
        System.out.println("=== Data Pasien 1 ===");
        System.out.println("Nama : " + pasien1.getNama());
        System.out.println("Nomor RM : " + pasien1.getNomorRm());
        System.out.println("Tanggal Lahir : " + pasien1.getTanggalLahir());
        System.out.println("Alamat : " + pasien1.getAlamat());

        // Menampilkan Data Dokter
        System.out.println("\n=== Data Dokter ===");
        System.out.println("Nama : " + dokter1.getNama());
        System.out.println("Spesialisasi : " + dokter1.getSpesialisasi());
        System.out.println("NIP : " + dokter1.getNip());
        System.out.println("No Telepon : " + dokter1.getNomorTelepon());

        // Menampilkan Data Rekam Medis
        System.out.println("\n=== Data Rekam Medis ===");
        System.out.println("Nomor RM Pasien : " + rekamMedis1.getNomorRM());
        System.out.println("Tanggal Pemeriksaan : " + rekamMedis1.getTanggalPemeriksaan());
        System.out.println("Diagnosa : " + rekamMedis1.getDiagnosa());
        System.out.println("Tindakan : " + rekamMedis1.getTindakan());

        // Menampilkan Data Ruang Rawat
        System.out.println("\n=== Data Ruang Rawat ===");
        System.out.println("Nama Ruang : " + ruang1.getNamaRuang());
        System.out.println("Jenis : " + ruang1.getJenis());
        System.out.println("Kapasitas : " + ruang1.getKapasitas());
        System.out.println("Tersedia : " + (ruang1.isTersedia() ? "Ya" : "Tidak"));
    }
}