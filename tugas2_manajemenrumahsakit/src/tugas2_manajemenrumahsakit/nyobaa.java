package tugas2_manajemenrumahsakit;

public class nyobaa {

    // Class Untuk Pasien 
    static class Pasien { 
        private String nama;
        private String nomorRm;
        private String tanggalLahir;
        private String alamat;

        // Konstruktor
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
        private String nama;
        private String spesialisasi;
        private String nip;
        private String nomorTelepon;

        // Konstruktor
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
        private String nomorRM;
        private String tanggalPemeriksaan;
        private String diagnosa;
        private String tindakan;

        // Konstruktor
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
        private String namaRuang;
        private int kapasitas;
        private String jenis;
        private boolean tersedia;

        // Konstruktor
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
        Pasien pasien1 = new Pasien("Noor Shahla Qeysha Revarani", "20438", "23-05-2004", "Jl.Taruna Praja Raya No 1");
        
        // Membuat objek Pasien2
        Pasien pasien2 = new Pasien("Munira Hayati", "20437", "23-05-2003", "Jl.Taruna Praja Raya No 8");
        
        // Membuat objek dokter1
        Dokter dokter1 = new Dokter("Dr. Shahla Qeysha, Sp.JP", "Ahli Bedah Kardiotoraks", "230520041122", "085252452303");
        
        // Membuat objek rekammedis 1 
        RekamMedis rekamMedis1 = new RekamMedis(pasien1.getNomorRm(), "21-04-2025", "Sesak dan Muntah", "Diberikan Obat Metoclopramide Injeksi");
        
        // Membuat Objek Ruang Rawat 1 
        RuangRawat ruang1 = new RuangRawat("Ruang Paviliun Firdaus 402", 1, "VIP", true);
        
        // Menampilkan data pasien1
        System.out.println("=== Data Pasien 1 ===");
        System.out.println("Nama : " + pasien1.getNama());
        System.out.println("Nomor RM : " + pasien1.getNomorRm());
        System.out.println("Tanggal Lahir : " + pasien1.getTanggalLahir());
        System.out.println("Alamat : " + pasien1.getAlamat());
        
        // Menampilkan data dokter1
        System.out.println("\n=== Data Dokter ===");
        System.out.println("Nama : " + dokter1.getNama());
        System.out.println("Spesialisasi : " + dokter1.getSpesialisasi());
        System.out.println("NIP : " + dokter1.getNip());
        System.out.println("No Telepon : " + dokter1.getNomorTelepon());
        
        // Menampilkan data Rekam Medis 
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