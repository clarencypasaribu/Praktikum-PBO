import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Locale;

public class DosenTamu extends Dosen{
    private String NIDK;
    private int masaKontrak;
    private LocalDate AkhirKontrak;

    public DosenTamu(){
    }

    public DosenTamu(String NIP, String NIDK, String nama, LocalDate tgl_lahir, LocalDate TMT, double gaji_pokok, String Fakultas, int masaKontrak, LocalDate AkhirKontrak){
        super(NIP, nama, tgl_lahir, TMT, gaji_pokok, Fakultas);
        this.NIDK = NIDK;
        this.masaKontrak = masaKontrak;
        this.AkhirKontrak = AkhirKontrak;
    }

    public String getNIDK(){
        return NIDK;
    }

    public void setNIDK(String NIDK){
        this.NIDK = NIDK;
    }

    public LocalDate getAkhirKontrak(){
        return AkhirKontrak;
    }

    public void setAkhirKontrak(LocalDate AkhirKontrak) {
        this.AkhirKontrak = AkhirKontrak;
    }

    public int hitungmasaKontrak() {
        LocalDate today = LocalDate.now();
        Period selisih = Period.between(today, AkhirKontrak);
        return selisih.getMonths() + (selisih.getYears() * 12); // Konversi tahun ke bulan
    }

    public double hitungTunjangan() {
        return 0.025 * getGaji_Pokok(); // 2.5% dari gaji pokok
    }
    
    public String getFormat(LocalDate date) {
        return date.getDayOfMonth() + " " +
               date.getMonth().getDisplayName(TextStyle.FULL, new Locale("id", "ID")) + " " +
               date.getYear();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK                    : " + NIDK);
        System.out.println("Jabatan                 : Dosen Tamu");
        System.out.println("Masa Kontrak Berakhir   : " + getFormat(AkhirKontrak));
        System.out.println("Sisa Masa Kontrak       : " + hitungmasaKontrak() + " bulan");
        System.out.println("Tunjangan               : " + this.hitungTunjangan());
    }
}