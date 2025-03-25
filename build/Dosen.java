public class Dosen extends Karyawan{
    //Atribut
    private static int count = 0;
    private Fakultas fakultas;

    //Method
    public Dosen(String nama, String email, String NIP, int masa_kerja, Fakultas fakultas) {
        super(nama, email, NIP, masa_kerja);
        this.fakultas = fakultas;
        count++;
    }

    public static int getCount(){
        return count;
    }
    public Fakultas getFakultas(){
        return fakultas;
    }
    public void setFakultas(Fakultas fakultas){
        this.fakultas = fakultas;
    }

    public double hitungGaji() {
        return fakultas.getGaji_pokok() + (getMasaKerja() * 0.01 * fakultas.getGaji_pokok());
    }

    @Override
    public void printInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Email : " + getEmail());
        System.out.println("NIP: " + getNIP());
        System.out.println("Masa Kerja : " + getMasaKerja());
        System.out.println("Fakultas : " + fakultas.getNama());
        System.out.println("Gaji : " + hitungGaji());
    }
}
