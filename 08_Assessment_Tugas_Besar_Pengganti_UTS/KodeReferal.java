public class KodeReferal {
    private final String kode;

    public KodeReferal(String kode) {
        if (!isValid(kode)) {
            throw new IllegalArgumentException("Kode referal tidak valid");
        }
        this.kode = kode;
    }

    private boolean isValid(String kode) {
        return kode != null && kode.matches("[A-Z0-9]{6}");
    }

    public String getKode() {
        return kode;
    }
}