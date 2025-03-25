 /* Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method dalam class titik
 * Pembuat : Clarency Christy Pasaribu / 24060123130113
 * Tanggal : Senin, 21 Februari 2025
 */

 public class Mtitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); 
        Titik T2 = new Titik(); 
        // mengubah absis T1 menjadi 5
        T1.setAbsis(5); 
        // mengubah ordinat menjadi 2
        T1.setOrdinat(2); 
        T1.printTitik(); 
        // menggeser T1 sejauh (!,3)
        T1.geser(1, 3); 
        T1.printTitik(); 
        // menampilkan koordinat T2 ke layar
        T2.printTitik(); 
        // mengeset absis T1 menjadi 8 dan ordinat 7
        T1.setAbsis(8); 
        T1.setOrdinat(7); 
        T2.printTitik(); 
        // menampilkan titik T1 berada kuadran berapa
        System.out.println("kuadran: " + T1.getKuadran()); 
        // menampilkan jarak titik T1 dengan pusat(0,0)
        System.out.println("Jarak ke pusat: " + T1.getJarakPusat()); 
        // menampilkan jarak titik T1 dengan T2
        System.out.println("Jarak dari T1: " + T1.getJarak(T2)); 
        // merefleksikan titik pada sumbu x
        T1.setRefelksiX(); 
        T1.printTitik(); 
        // merefleksikan titik pada sumbu y
        T1.setRefelksiY(); 
        T1.printTitik(); 
        // menampilkan titik T1 berada kuadran berapa
        System.out.println("kuadran: " + T1.getKuadran()); // menampilkan titik T1 berada kuadran berapa
        // membuat titik baru yang diisi dengan T1 yang direfleksikan pada sumbu X
        Titik reflekX = T1.getRefleksiX(); 
        reflekX.printTitik(); 
        // membuat titik baru yang diisi dengan T1 yang direfleksikan pada sumbu y
        Titik reflekY = T1.getRefleksiY(); 
        reflekY.printTitik(); 
    }
}
