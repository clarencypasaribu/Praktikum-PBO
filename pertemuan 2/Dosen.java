 /* Nama File : Dosen.java
 * Deskripsi : Berisi atribut dan method dalam class Dosen
 * Pembuat : Clarency Christy Pasaribu / 24060123130113
 * Tanggal : Senin, 28 Februari 2025
 */

public class Dosen {
    
    /*Atribut */
    private String NIP;
    private String nama;
    private String prodi;
    
    /*Method */

    public Dosen(){
        NIP = " ";
        nama = " ";
        prodi = " ";
    }

    public Dosen (String X, String Y, String Z){
        this.NIP = X;
        this.nama = Y;
        this.prodi = Z;
    }

    public String getNIP (){
        return NIP;
    }

    public String getNamaDosen(){
        return nama;
    }
    
    public String getProdiDosen(){
        return prodi;
    }

    public void setNIP(String X){
        NIP = X;
    }

    public void setNamaDosen(String Y){
        nama = Y;
    }

    public void setProdiDosen(String Z){
        prodi = Z;
    }

    public void printDosen() {
        System.out.println("Dosen: " + NIP + " - " + nama + " - " + prodi );
    }

}
