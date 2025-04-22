import java.util.Date;

enum JenisKelamin {
    LAKI_LAKI, PEREMPUAN
}

enum TingkatKeanggotaan {
    DASAR, PREMIUM, ELITE
}

public class LibraryMember {

    private String namaLengkap;
    private String alamat;
    private String nomorTelepon;
    private String email;
    private JenisKelamin jenisKelamin;
    private String kodeAnggota;
    private Date tanggalGabung;
    private boolean statusAktif;
    private TingkatKeanggotaan tingkatKeanggotaan;
    private int jumlahBukuDipinjam;
    private int jumlahTerlambat;
    private int jumlahDenda;
    private int poinLoyalitas;
    private String kodeReferal;
    private boolean langgananBuletin;

    public LibraryMember(String namaLengkap, String alamat, String nomorTelepon, String email, JenisKelamin jenisKelamin,
                         String kodeAnggota, Date tanggalGabung, boolean statusAktif,
                         TingkatKeanggotaan tingkatKeanggotaan, int jumlahBukuDipinjam,
                         int jumlahTerlambat, int jumlahDenda, int poinLoyalitas,
                         String kodeReferal, boolean langgananBuletin) {

        this.namaLengkap = namaLengkap;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
        this.jenisKelamin = jenisKelamin;
        this.kodeAnggota = kodeAnggota;
        this.tanggalGabung = tanggalGabung;
        this.statusAktif = statusAktif;
        this.tingkatKeanggotaan = tingkatKeanggotaan;
        this.jumlahBukuDipinjam = jumlahBukuDipinjam;
        this.jumlahTerlambat = jumlahTerlambat;
        this.jumlahDenda = jumlahDenda;
        this.poinLoyalitas = poinLoyalitas;
        this.kodeReferal = kodeReferal;
        this.langgananBuletin = langgananBuletin;
    }

    public void cetakProfilLengkap() {
        System.out.println("===== PROFIL ANGGOTA =====");
        cetakInformasiDasar();
        cetakStatistikPeminjaman();
        cetakEvaluasi();
        System.out.println("===========================");
    }

    private void cetakInformasiDasar() {
        System.out.println("Nama         : " + namaLengkap);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Alamat       : " + alamat);
        System.out.println("Telepon      : " + nomorTelepon);
        System.out.println("Email        : " + email);
        System.out.println("Kode Anggota : " + kodeAnggota);
        System.out.println("Tanggal Gabung: " + tanggalGabung);
        System.out.println("Status Aktif : " + statusAktif);
        System.out.println("Tingkat      : " + tingkatKeanggotaan);
        System.out.println("Kode Referal : " + kodeReferal);
        System.out.println("Langganan Buletin: " + langgananBuletin);
    }

    private void cetakStatistikPeminjaman() {
        System.out.println("Buku Dipinjam: " + jumlahBukuDipinjam);
        System.out.println("Terlambat    : " + jumlahTerlambat);
        System.out.println("Denda        : Rp " + jumlahDenda);
        System.out.println("Poin         : " + poinLoyalitas);
    }

    private void cetakEvaluasi() {
        System.out.println("Skor Risiko  : " + hitungSkorRisiko());
        System.out.println("Layak Upgrade?: " + periksaKelayakanUpgrade());
    }

    public boolean periksaKelayakanUpgrade() {
        return tingkatKeanggotaan == TingkatKeanggotaan.DASAR && poinLoyalitas > 100;
    }

    public double hitungSkorRisiko() {
        double skor = 0;
        skor += jumlahTerlambat * 1.5;
        skor += jumlahDenda * 0.1;
        if (!statusAktif) skor += 5;
        if (tingkatKeanggotaan == TingkatKeanggotaan.DASAR) skor += 2;
        if (jumlahBukuDipinjam > 50) skor -= 1.5;
        return skor;
    }

    // Getters & Setters

    public int getJumlahBukuDipinjam() {
        return jumlahBukuDipinjam;
    }

    public void setJumlahBukuDipinjam(int b) {
        jumlahBukuDipinjam = b;
    }

    public int getJumlahTerlambat() {
        return jumlahTerlambat;
    }

    public void setJumlahTerlambat(int t) {
        jumlahTerlambat = t;
    }

    public int getJumlahDenda() {
        return jumlahDenda;
    }

    public void setJumlahDenda(int d) {
        jumlahDenda = d;
    }

    public TingkatKeanggotaan getTingkatKeanggotaan() {
        return tingkatKeanggotaan;
    }

    public void setTingkatKeanggotaan(TingkatKeanggotaan t) {
        tingkatKeanggotaan = t;
    }

    public String getKodeReferal() {
        return kodeReferal;
    }

    public void setKodeReferal(String k) {
        kodeReferal = k;
    }

    public boolean getLanggananBuletin() {
        return langgananBuletin;
    }

    public void setLanggananBuletin(boolean l) {
        langgananBuletin = l;
    }
}
