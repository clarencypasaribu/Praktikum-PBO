import java.time.LocalDate;

public class Dosen extends Pegawai{
    private String Fakultas;

    public Dosen(){
    }

    public Dosen(String NIP, String nama, LocalDate tgl_lahir, LocalDate TMT, double gaji_pokok, String Fakultas) {
        super(NIP, nama, tgl_lahir, TMT, gaji_pokok);
        this.Fakultas = Fakultas;
    }

    // Getter Setter
    public String getFakultas() { 
        return Fakultas; 
    }
    public void setFakultas(String Fakultas) { 
        this.Fakultas = Fakultas; 
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas                : " + Fakultas);
    }
}
