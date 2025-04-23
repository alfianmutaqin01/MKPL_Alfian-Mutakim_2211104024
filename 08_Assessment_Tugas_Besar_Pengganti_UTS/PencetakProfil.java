public class PencetakProfil {
    public static void cetak(LibraryMember anggota) {
        System.out.println("===== PROFIL ANGGOTA =====");
        cetakInfoDasar(anggota.getInfo());
        cetakStatusAnggota(anggota);
        System.out.println("=========================");
    }

    private static void cetakInfoDasar(InfoAnggota info) {
        System.out.println("Nama: " + info.getNamaLengkap());
        System.out.println("Alamat: " + info.getAlamat());
        System.out.println("Telp: " + info.getNomorTelepon());
    }

    private static void cetakStatusAnggota(LibraryMember anggota) {
        System.out.println("Tier: " + anggota.getStatusKeanggotaan().getTingkat());
        System.out.println("Poin: " + anggota.getStatusKeanggotaan().getPoinLoyalitas());
    }
}