public class KalkulatorRisiko {
    public static double hitung(LibraryMember anggota) {
        double skor = 0;
        skor += anggota.getRiwayatPeminjaman().getJumlahTerlambat() * 1.5;
        skor += anggota.getRiwayatPeminjaman().getTotalDenda() * 0.01;
        if (!anggota.getStatusKeanggotaan().isStatusAktif()) skor += 5;
        return skor;
    }
}