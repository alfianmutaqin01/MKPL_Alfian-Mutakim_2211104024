import java.util.Date;

public class LibraryMember {
    private final InfoAnggota info;
    private final String kodeAnggota;
    private final Date tanggalGabung;
    private final StatusKeanggotaan statusKeanggotaan;
    private final RiwayatPeminjaman riwayatPeminjaman;
    private final Langganan langganan;

    public LibraryMember(InfoAnggota info, String kodeAnggota, Date tanggalGabung) {
        this(info, kodeAnggota, tanggalGabung, 
             new StatusKeanggotaan(TingkatKeanggotaan.DASAR), 
             new RiwayatPeminjaman(), 
             new Langganan());
    }

    public LibraryMember(InfoAnggota info, String kodeAnggota, Date tanggalGabung,
                        StatusKeanggotaan statusKeanggotaan, 
                        RiwayatPeminjaman riwayatPeminjaman,
                        Langganan langganan) {
        this.info = info;
        this.kodeAnggota = kodeAnggota;
        this.tanggalGabung = tanggalGabung;
        this.statusKeanggotaan = statusKeanggotaan;
        this.riwayatPeminjaman = riwayatPeminjaman;
        this.langganan = langganan;
    }

    public void cetakProfil() {
        PencetakProfil.cetak(this);
    }

    public boolean layakUpgrade() {
        return statusKeanggotaan.layakUpgrade();
    }

    public double hitungSkorRisiko() {
        return KalkulatorRisiko.hitung(this);
    }

    // Getter
    public InfoAnggota getInfo() { return info; }
    public String getKodeAnggota() { return kodeAnggota; }
    public Date getTanggalGabung() { return tanggalGabung; }
    public StatusKeanggotaan getStatusKeanggotaan() { return statusKeanggotaan; }
    public RiwayatPeminjaman getRiwayatPeminjaman() { return riwayatPeminjaman; }
    public Langganan getLangganan() { return langganan; }
}