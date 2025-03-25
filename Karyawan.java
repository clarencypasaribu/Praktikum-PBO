public class Karyawan extends CivitasAkademika{
    //Atribut
    private static int count = 0;
    private  String NIP;
    private int masa_kerja;
    
    //Method
    public Karyawan(String nama, String email, String NIP, int masa_kerja) {
        super(nama, email);
        this.NIP = NIP;
        this.masa_kerja = masa_kerja;
        count++;
    }

    public static int getCount(){
        return count;
    }

    public String getNIP(){
        return NIP;
    }

    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public int getMasaKerja(){
        return masa_kerja;
    }

    public void setMasaKerja(int masa_kerja){
        this.masa_kerja = masa_kerja;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("Masa Kerja : " + masa_kerja);
    }
}



