 /* Nama File : MataKuliah.java
 * Deskripsi : Berisi atribut dan method dalam class Matakuliah
 * Pembuat : Clarency Christy Pasaribu / 24060123130113
 * Tanggal : Senin, 28 Februari 2025
 */


public class MataKuliah {
    /*Atribut */
    private String idMatkul;
    private String nama;
    private int SKS;

    /*Method */
    public MataKuliah(){
        idMatkul = " ";
        nama = " ";
        SKS = 0;
    }

    public MataKuliah (String X, String Y, int Z){
        this.idMatkul = X;
        this.nama = Y;
        this.SKS = Z;
    }

    public String getIdMatkul (){
        return idMatkul;
    }

    public String getNamaMatkul(){
        return nama;
    }
    
    public int  getSKS(){
        return SKS;
    }

    public void setIdMatkul(String X){
        idMatkul = X;
    }

    public void setNamaMatkul(String Y){
        nama = Y;
    }

    public void setSKS(int Z){
        SKS = Z;
    }

    public void printMatKul() {
        System.out.println("Mata Kuliah: " + idMatkul + " - " + nama + " (" + SKS + ")");
    }
}
