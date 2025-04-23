public class InfoAnggota {
    private final String namaLengkap;
    private final String alamat;
    private final String nomorTelepon;
    private final String email;
    private final JenisKelamin jenisKelamin;

    public InfoAnggota(String namaLengkap, String alamat, String nomorTelepon, 
                     String email, JenisKelamin jenisKelamin) {
        this.namaLengkap = namaLengkap;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
        this.jenisKelamin = jenisKelamin;
    }

    // Getter
    public String getNamaLengkap() { return namaLengkap; }
    public String getAlamat() { return alamat; }
    public String getNomorTelepon() { return nomorTelepon; }
    public String getEmail() { return email; }
    public JenisKelamin getJenisKelamin() { return jenisKelamin; }
}