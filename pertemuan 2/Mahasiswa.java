 /* Nama File : Mahasiswa.java
 * Deskripsi : Berisi atribut dan method dalam class mahasiswa
 * Pembuat : Clarency Christy Pasaribu / 24060123130113
 * Tanggal : Senin, 28 Februari 2025
 */

import java.util.ArrayList;

public class Mahasiswa{

    /*Atribut */
    private String NIM;
    private String nama;
    private String prodi;
    ArrayList <MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /*Method */

    public Mahasiswa() {
        NIM = " ";
        nama = " ";
        prodi = " ";
        listMatkul = new ArrayList<>(); 
    }

    public Mahasiswa(String X, String Y, String Z) {
        this.NIM = X;
        this.nama = Y;
        this.prodi = Z;
        this.listMatkul = new ArrayList<>(); 
    }

    public String getNIM (){
        return NIM;
    }

    public String getNamaMhs(){
        return nama;
    }
    
    public String getProdiMhs(){
        return prodi;
    }

    public void setIdMatkul(String X){
        NIM = X;
    }

    public void setNamaMatkul(String Y){
        nama = Y;
    }

    public void setProdiMhs(String Z){
        prodi = Z;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah matkul) {
        if (listMatkul.size() < 50) {
            listMatkul.add(matkul); 
        } else {
            System.out.println("Maksimal 50 mata kuliah!");
        }
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah matkul : listMatkul) {
            totalSKS += matkul.getSKS();
        }
        return totalSKS;
    }

    public int getJumlahMatKul() {
        return listMatkul.size();
    }

    public void printMhs() {
        System.out.println("Mahasiswa: " + NIM + " - " + nama + " - " + prodi );
    }

    public void printDetailMhs() {
        printMhs();
        System.out.println("Jumlah Mata Kuliah: " + getJumlahMatKul());
        System.out.println("Total SKS: " + getJumlahSKS());
        System.out.println("Daftar Mata Kuliah:");
        for (MataKuliah matkul : listMatkul) {
            matkul.printMatKul();
        }
        if (dosenWali != null) {
            dosenWali.printDosen();
        }
        if (kendaraan != null) {
            kendaraan.printKendaraan();
        }
        System.out.println("------------------------------------------------");
    }
}