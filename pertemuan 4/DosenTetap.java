import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;

public class DosenTetap extends Dosen {
    private String NIDN;
    private static final int BUP = 65;

    public DosenTetap() {
    }

    public DosenTetap(String NIP, String NIDN, String nama, LocalDate tgl_lahir, LocalDate TMT, double gaji_pokok, String Fakultas) {
        super(NIP, nama, tgl_lahir, TMT, gaji_pokok, Fakultas);
        this.NIDN = NIDN;
    }

    public String getNIDN() {
        return NIDN;
    }

    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    public LocalDate hitungBUP() {
        return getTgl_Lahir().plusYears(BUP).plusMonths(1);
    }

    public String getMasaKerja() {
        Period period = Period.between(getTMT(), LocalDate.now());
        return period.getYears() + " tahun " + period.getMonths() + " bulan";
    }

    public double hitungTunjangan() {
        int masaKerja = Period.between(getTMT(), LocalDate.now()).getYears();
        return 0.02 * masaKerja * getGaji_Pokok();
    }

    public String getFormat(LocalDate date) {
        return date.getDayOfMonth() + " " + date.getMonth().getDisplayName(TextStyle.FULL, Locale.of("id", "ID")) + " " + date.getYear();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN                    : " + NIDN);
        System.out.println("Masa Kerja              : " + getMasaKerja());
        System.out.println("BUP                     : " + getFormat(hitungBUP()));
        System.out.println("Jabatan                 : Dosen tetap");
        System.out.println("Tunjangan               : " + this.hitungTunjangan());
    }
}
