
import java.time.LocalDate;

public class MainPegawai {
    public static void main(String[] args){
        System.out.println("\n===== Informasi Dosen Tetap =====\n");
        DosenTetap DTetap1 = new DosenTetap("001", "NI001", "Dito", LocalDate.of(1990, 5, 6),   LocalDate.of(2015,07,18), 5000000, "Informatika" );
        DTetap1.printInfo();
        System.out.println("\n===== Informasi Dosen Tamu =====\n");
        DosenTamu DTamu1 = new DosenTamu("002", "12345", "Felis", LocalDate.of(1990, 05, 22), LocalDate.of(2020, 07, 03), 4500000, "Statistika", 10, LocalDate.of(2025, 10, 07));
        DTamu1.printInfo();
        System.out.println("\n===== Informasi Tenaga Didik =====\n");
        Tendik Tendik1 = new Tendik("003", "Eliza", LocalDate.of(1999, 07, 16), LocalDate.of(2018,9,03), 2500000, "Kemahasiswaan");
        Tendik1.printInfo();

    }
}
