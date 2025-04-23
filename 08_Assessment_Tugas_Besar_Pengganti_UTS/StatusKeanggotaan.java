public class StatusKeanggotaan {
    private MembershipTier tingkat;
    private int poinLoyalitas;
    private boolean statusAktif;

    public StatusKeanggotaan(MembershipTier tingkat) {
        this(tingkat, 0, true);
    }

    public StatusKeanggotaan(MembershipTier tingkat, int poinLoyalitas, boolean statusAktif) {
        this.tingkat = tingkat;
        this.poinLoyalitas = poinLoyalitas;
        this.statusAktif = statusAktif;
    }

    public boolean layakUpgrade() {
        return tingkat == MembershipTier.DASAR && poinLoyalitas > 100;
    }

    // Getter and setter methods
    public MembershipTier getTingkat() { return tingkat; }
    public int getPoinLoyalitas() { return poinLoyalitas; }
    public boolean isStatusAktif() { return statusAktif; }
    public void tambahPoin(int poin) { poinLoyalitas += poin; }
}