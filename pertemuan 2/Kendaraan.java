 /* Nama File : Kendaraan.java
 * Deskripsi : Berisi atribut dan method dalam class Kendaraan
 * Pembuat : Clarency Christy Pasaribu / 24060123130113
 * Tanggal : Senin, 28 Februari 2025
 */


public class Kendaraan {
    /*Atribut */
    private String noPlat;
    private String jenis;
    
    /*Method */

    public Kendaraan(){
        noPlat = " ";
        jenis = " ";
    }

    public Kendaraan (String X, String Y){
        this.noPlat = X;
        this.jenis = Y;
    }

    public String getNoPlat (){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    public void setNoPlat(String X){
        noPlat = X;
    }

    public void setJenis(String Y){
        jenis = Y;
    }

    public void printKendaraan() {
        System.out.println("Kendaraan: " + noPlat + " - " + jenis );
    }
}
