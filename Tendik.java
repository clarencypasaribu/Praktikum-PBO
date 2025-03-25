public class Tendik extends Karyawan{
    //Atribut
    private static int count = 0;
    private static final double GAJI_POKOK = 4000000;

    //Method
    public Tendik(String nama, String email, String NIP, int masa_kerja) {
        super(nama, email, NIP, masa_kerja);
        count++;
    }

    public static int getCount() {
        return count; }
    
    public double hitungGaji() {
        return GAJI_POKOK + (getMasaKerja() * 0.01 * GAJI_POKOK);
    }

    @Override
    public void printInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Email : " + getEmail());
        System.out.println("NIP: " + getNIP());
        System.out.println("Masa Kerja : " + getMasaKerja());
        System.out.println("Gaji : " + hitungGaji());
    }
}
