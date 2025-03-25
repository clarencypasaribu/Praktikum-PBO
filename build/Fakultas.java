class Fakultas{
    //Atribut
    private String nama;
    private double biaya_UKT;
    private double gaji_pokok;

    //Method
    public Fakultas(String nama, double biaya_UKT, double gaji_pokok){
        this.nama = nama;
        this.biaya_UKT = biaya_UKT;
        this.gaji_pokok = gaji_pokok;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public double getBiaya_UKT(){
        return biaya_UKT;
    }

    public void setBiaya_UKT(double biaya_UKT){
        this.biaya_UKT = biaya_UKT;
    }

    public double getGaji_pokok(){
        return gaji_pokok;
    }

    public void setGaji_pokok(double gaji_pokok){
        this.gaji_pokok = gaji_pokok;
    }

    public void printInfo() {
        System.out.println("Fakultas: " + nama);
        System.out.println("Biaya UKT : " + biaya_UKT);
        System.out.println("Gaji Pokok : " + gaji_pokok);
    }

}