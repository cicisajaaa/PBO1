package tugas4_pbo1;

public class Tugas4_PBO1 {
    
    // Class Untuk Pasien 
    static class Pasien { 
        private String nama;
        private String nomorRm;
        private String tanggalLahir;
        private String alamat;

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

    // Class Untuk Staf Medis (Superclass)
    static class StafMedis {
        protected String nama;
        protected String nip;
        protected String nomorTelepon;

        public StafMedis(String nama, String nip, String nomorTelepon) {
            this.nama = nama;
            this.nip = nip;
            this.nomorTelepon = nomorTelepon;
        }

        public void tindakan() {
            System.out.println("Staf medis melakukan tindakan.");
        }
    }

    // Class Untuk Dokter (Subclass dari Staf Medis)
    static class Dokter extends StafMedis { 
        private String spesialisasi;

        public Dokter(String nama, String nip, String nomorTelepon, String spesialisasi) {
            super(nama, nip, nomorTelepon);
            this.spesialisasi = spesialisasi;
        }

        @Override
        public void tindakan() {
            System.out.println("Dokter " + nama + " melakukan tindakan medis.");
        }

        public String getSpesialisasi() {
            return spesialisasi;
        }
    }

    // Class Untuk Perawat (Subclass dari Staf Medis)
    static class Perawat extends StafMedis {
        public Perawat(String nama, String nip, String nomorTelepon) {
            super(nama, nip, nomorTelepon);
        }

        @Override
        public void tindakan() {
            System.out.println("Perawat " + nama + " memberikan perawatan.");
        }
    }

    // Class Untuk Rekam Medis
    static class RekamMedis {
        private String nomorRM;
        private String tanggalPemeriksaan;
        private String diagnosa;
        private String tindakan;

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
        private String namaRuang;
        private int kapasitas;
        private String jenis;
        private boolean tersedia;

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
        Pasien pasien1 = new Pasien("Noor Shahla Qeysha Revarani", "20438", "23-05-2004", "Jl.Taruna Praja Raya No 1");

        // Membuat objek dokter1
        Dokter dokter1 = new Dokter("Dr. Shahla Qeysha, Sp.JP", "230520041122", "085252452303", "Ahli Bedah Kardiotoraks");

        // Membuat objek perawat1
        Perawat perawat1 = new Perawat("Cici Paramida", "11222333445", "085252452304");

        // Menampilkan data pasien1
        System.out.println("=== Data Pasien 1 ===");
        System.out.println("Nama : " + pasien1.getNama());
        System.out.println("Nomor RM : " + pasien1.getNomorRm());
        System.out.println("Tanggal Lahir : " + pasien1.getTanggalLahir());
        System.out.println("Alamat : " + pasien1.getAlamat());

        // Menampilkan data dokter1
        System.out.println("\n=== Data Dokter ===");
        System.out.println("Nama : " + dokter1.nama);
        System.out.println("Spesialisasi : " + dokter1.getSpesialisasi());
        System.out.println("NIP : " + dokter1.nip);
        System.out.println("No Telepon : " + dokter1.nomorTelepon);
        dokter1.tindakan(); // Demonstrasi polymorfisme

        // Menampilkan data perawat1
        System.out.println("\n=== Data Perawat ===");
        System.out.println("Nama : " + perawat1.nama);
        System.out.println("NIP : " + perawat1.nip);
        System.out.println("No Telepon : " + perawat1.nomorTelepon);
        perawat1.tindakan(); // Demonstrasi polymorfisme
    }
}