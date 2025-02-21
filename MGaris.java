 /* Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method dalam class garis
 * Pembuat : Clarency Christy Pasaribu / 24060123130113
 * Tanggal : Senin, 21 Februari 2025
 */

public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(3,4);
        Titik T2 = new Titik(5,6);
        Garis G1 = new Garis(T1, T2); 
        Garis G2 = G1; 
        G1.printT1T2(); 
        // mengubah Titik T1 pada garis menjadi (1,2)
        G1.setT1Garis(new Titik(1, 2)); 
        G1.printT1T2(); 
        // mengubah titik T2 garis dengan titik T2 yang telah dibuat di atas
        G1.setT2Garis(T2); 
        G1.printT1T2();
        // menampilkan panjang garis G1
        System.out.println("Panjang garis :" + G1.getPanjangGaris()); 
        // menampilkan gradien garis G1
        System.out.println("Gradien garis :" + G1.getGradien()); 
        // menampilkan titik tengah garis G1
        System.out.println("Titik tengah garis :" + G1.getTitikTengah()); 
        // apakah garis G1 & G2 sejajar
        System.out.println("Apakah sejajar? : " + G1.isSejajar(G2)); 
        // apakah garis G1 & G2 saling tegak lurus
        System.out.println("Apakah saling Tegak Lurus? : " + G1.isTegakLurus(G2));
        // menampilkan rumus persamaan y = mx + c
        G1.printRumus(); // menampilkan rumus persamaan y = mx + c
    }
}
