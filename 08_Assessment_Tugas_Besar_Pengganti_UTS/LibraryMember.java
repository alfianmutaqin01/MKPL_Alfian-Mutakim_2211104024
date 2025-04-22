import java.util.Date;

public class LibraryMember {
    private MemberInfo info;
    private String kodeAnggota;
    private Date tanggalGabung;
    private boolean statusAktif;
    private MembershipTier tingkatKeanggotaan;
    private int jumlahBukuDipinjam;
    private int jumlahTerlambat;
    private int jumlahDenda;
    private int poinLoyalitas;
    private String kodeReferal;
    private boolean langgananBuletin;

    public LibraryMember(MemberInfo info, String kodeAnggota, Date tanggalGabung, boolean statusAktif,
                        MembershipTier tingkatKeanggotaan, int jumlahBukuDipinjam, int jumlahTerlambat,
                        int jumlahDenda, int poinLoyalitas, String kodeReferal, boolean langgananBuletin) {
        this.info = info;
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
        System.out.println("Nama         : " + info.getNamaLengkap());
        System.out.println("Jenis Kelamin: " + info.getJenisKelamin());
        System.out.println("Alamat       : " + info.getAlamat());
        System.out.println("Telepon      : " + info.getNomorTelepon());
        System.out.println("Email        : " + info.getEmail());
        System.out.println("Kode Anggota : " + kodeAnggota);
        System.out.println("Tanggal Gabung: " + tanggalGabung);
        System.out.println("Status Aktif : " + statusAktif);
        System.out.println("Tingkat      : " + tingkatKeanggotaan);
        System.out.println("Buku Dipinjam: " + jumlahBukuDipinjam);
        System.out.println("Terlambat    : " + jumlahTerlambat);
        System.out.println("Denda        : Rp " + jumlahDenda);
        System.out.println("Poin         : " + poinLoyalitas);
        System.out.println("Kode Referal : " + kodeReferal);
        System.out.println("Langganan Buletin: " + langgananBuletin);
        System.out.println("Skor Risiko  : " + MembershipService.hitungSkorRisiko(
            jumlahTerlambat, jumlahDenda, statusAktif, tingkatKeanggotaan, jumlahBukuDipinjam));
        System.out.println("Layak Upgrade?: " + MembershipService.periksaKelayakanUpgrade(tingkatKeanggotaan, poinLoyalitas));
        System.out.println("===========================");
    }

    // Getter dan Setter untuk atribut yang diperlukan
    public int getJumlahBukuDipinjam() { return jumlahBukuDipinjam; }
    public void setJumlahBukuDipinjam(int jumlah) { this.jumlahBukuDipinjam = jumlah; }
}