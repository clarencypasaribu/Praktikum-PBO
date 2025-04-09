// Kelas PNS
class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS;
    private final int A = 7;

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + A;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }
}
