public class StatusKeanggotaan {
    private TingkatKeanggotaan tingkat;
    private int poinLoyalitas;
    private boolean statusAktif;

    public StatusKeanggotaan(TingkatKeanggotaan tingkat) {
        this(tingkat, 0, true);
    }

    public StatusKeanggotaan(TingkatKeanggotaan tingkat, int poinLoyalitas, boolean statusAktif) {
        this.tingkat = tingkat;
        this.poinLoyalitas = poinLoyalitas;
        this.statusAktif = statusAktif;
    }

    public boolean layakUpgrade() {
        return tingkat == TingkatKeanggotaan.DASAR && poinLoyalitas > 100;
    }

    public void upgradeTingkat() {
        if (layakUpgrade()) {
            this.tingkat = TingkatKeanggotaan.PREMIUM;
        }
    }

    // Getter dan Setter
    public TingkatKeanggotaan getTingkat() { return tingkat; }
    public int getPoinLoyalitas() { return poinLoyalitas; }
    public boolean isStatusAktif() { return statusAktif; }
    public void setStatusAktif(boolean statusAktif) { this.statusAktif = statusAktif; }
    public void tambahPoinLoyalitas(int poin) { poinLoyalitas += poin; }
}