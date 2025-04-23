public class RiwayatPeminjaman {
    private int jumlahBukuDipinjam;
    private int jumlahTerlambat;
    private int totalDenda;

    public RiwayatPeminjaman() {
        this(0, 0, 0);
    }

    public RiwayatPeminjaman(int jumlahBukuDipinjam, int jumlahTerlambat, int totalDenda) {
        this.jumlahBukuDipinjam = jumlahBukuDipinjam;
        this.jumlahTerlambat = jumlahTerlambat;
        this.totalDenda = totalDenda;
    }

    public void catatPeminjaman() {
        jumlahBukuDipinjam++;
    }

    public void catatKeterlambatan(int jumlahDenda) {
        jumlahTerlambat++;
        totalDenda += jumlahDenda;
    }

    // Getter
    public int getJumlahBukuDipinjam() { return jumlahBukuDipinjam; }
    public int getJumlahTerlambat() { return jumlahTerlambat; }
    public int getTotalDenda() { return totalDenda; }
}