// Kelas Pengusaha
class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha;
    private final int B = 5;

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + B;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }
}
