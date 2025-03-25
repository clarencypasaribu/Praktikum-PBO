import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;


public class Pegawai{
    private String NIP;
    private String nama;
    private LocalDate tgl_lahir;
    private LocalDate TMT;
    private double gaji_pokok;

    public Pegawai(){
    }

    public Pegawai(String NIP, String nama, LocalDate tgl_lahir, LocalDate TMT, double gaji_pokok){
        this.NIP = NIP;
        this.nama = nama;
        this.tgl_lahir = tgl_lahir;
        this.TMT = TMT;
        this.gaji_pokok = gaji_pokok;
    }

    public String getNIP(){
        return NIP;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public LocalDate getTgl_Lahir(){
        return tgl_lahir;
    }

    public void setTgl_Lahir(LocalDate tgl_lahir){
        this.tgl_lahir = tgl_lahir;
    }

    public LocalDate getTMT(){
        return TMT;
    }

    public void setTMT(LocalDate TMT){
        this.TMT = TMT;
    }

    public double getGaji_Pokok(){
        return gaji_pokok;
    }

    public void setGaji_Pokok(int gaji_pokok){
        this.gaji_pokok = gaji_pokok;
    }

    public String getFormat(LocalDate date) {
        return date.getDayOfMonth() + " " + date.getMonth().getDisplayName(TextStyle.FULL, Locale.of("id", "ID")) + " " + date.getYear();
    }

    public void printInfo() {
        System.out.println("NIP                     : " + NIP);
        System.out.println("Nama                    : " + nama);
        System.out.println("Tanggal Lahir           : " + getFormat(tgl_lahir));
        System.out.println("TMT                     : " + getFormat(TMT));
        System.out.println("Gaji Pokok              : Rp " + gaji_pokok);
    }
}
