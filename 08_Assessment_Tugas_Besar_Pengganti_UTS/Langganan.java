public class Langganan {
    private boolean langgananBuletin;
    private KodeReferal kodeReferal;

    public Langganan() {
        this(false, null);
    }

    public Langganan(boolean langgananBuletin, KodeReferal kodeReferal) {
        this.langgananBuletin = langgananBuletin;
        this.kodeReferal = kodeReferal;
    }

    // Getter methods
    public boolean isLanggananBuletin() { return langgananBuletin; }
    public KodeReferal getKodeReferal() { return kodeReferal; }
}