public class MembershipService {
    public static double hitungSkorRisiko(int jumlahTerlambat, int jumlahDenda, boolean statusAktif, MembershipTier tingkatKeanggotaan, int jumlahBukuDipinjam) {
        double skor = 0;
        skor += jumlahTerlambat * 1.5;
        skor += jumlahDenda * 0.1;
        if (!statusAktif) skor += 5;
        if (tingkatKeanggotaan == MembershipTier.DASAR) skor += 2;
        if (jumlahBukuDipinjam > 50) skor -= 1.5;
        return skor;
    }

    public static boolean periksaKelayakanUpgrade(MembershipTier tingkatKeanggotaan, int poinLoyalitas) {
        return tingkatKeanggotaan == MembershipTier.DASAR && poinLoyalitas > 100;
    }
}