import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai{
    private String Bidang;
    private static final int BUP = 55;

    public Tendik(){
    }

    public Tendik (String NIP, String nama, LocalDate tgl_lahir, LocalDate TMT, double gaji_pokok, String Bidang){
        super(NIP, nama, tgl_lahir, TMT, gaji_pokok);
        this.Bidang = Bidang;
    }

    public String getBidang(){
        return Bidang;
    }

    public void setBidang(String Bidang){
        this.Bidang = Bidang;
    }

    public int hitungMasaKerja() {
        return Period.between(getTMT(), LocalDate.now()).getYears();
    }

    public double hitungTunjangan() {
        return 0.01 * hitungMasaKerja() * getGaji_Pokok();
    }

    public LocalDate hitung_BUP() {
        return getTgl_Lahir().plusYears(BUP).plusMonths(1);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang                  : " + Bidang);
        System.out.println("Tunjangan               : Rp " + hitungTunjangan());
        System.out.println("BUP                     : " + hitung_BUP());
    }
}