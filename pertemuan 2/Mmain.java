 /* Nama File : Mmain.java
 * Deskripsi : Berisi main untuk Mahasiswa
 * Pembuat : Clarency Christy Pasaribu / 24060123130113
 * Tanggal : Senin, 28 Februari 2025
 */


public class Mmain {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("D0001", "Dr. Andi", "Informatika");
        Dosen dosen2 = new Dosen("D0002", "Dr. Lamhot", "Akuntansi");
        Dosen dosen3 = new Dosen("D0003", "Dr. Imanta", "Statistika");

        MataKuliah matkul1 = new MataKuliah("MK001", "Pemograman Lanjutan", 3);
        MataKuliah matkul2 = new MataKuliah("MK002", "Statistika", 3);
        MataKuliah matkul3 = new MataKuliah("MK003", "IOT", 2);
        MataKuliah matkul4 = new MataKuliah("MK004", "Matematika 1", 2);

        Kendaraan kendaraan1 = new Kendaraan("H1234XY", "Mobil");
        Kendaraan kendaraan2 = new Kendaraan("H5678AD", "Motor");
        Kendaraan kendaraan3 = new Kendaraan("H5612HF", "Motor");

        Mahasiswa mhs1 = new Mahasiswa("1234567","Clarency", "Informatika");
        Mahasiswa mhs2 = new Mahasiswa("1230984","Madeline", "Akuntansi");
        Mahasiswa mhs3 = new Mahasiswa("1232961","Yolanda", "Statistika");

        mhs1.setDosenWali(dosen1);
        mhs1.setKendaraan(kendaraan1);
        mhs1.addMatKul(matkul1);
        mhs1.addMatKul(matkul3);
        mhs1.addMatKul(matkul4);
        mhs1.printDetailMhs();

        mhs2.setDosenWali(dosen2);
        mhs2.setKendaraan(kendaraan2);
        mhs2.addMatKul(matkul2);
        mhs2.addMatKul(matkul4);
        mhs2.printDetailMhs();

        mhs3.setDosenWali(dosen3);
        mhs3.setKendaraan(kendaraan3);
        mhs3.addMatKul(matkul2);
        mhs3.addMatKul(matkul4);
        mhs3.printDetailMhs();
    }
}
