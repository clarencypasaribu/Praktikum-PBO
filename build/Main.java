public class Main {
    public static void main(String[] args) {
        Fakultas fak1 = new Fakultas("Teknik", 7000000, 5000000);
        Mahasiswa mhs1 = new Mahasiswa("Reyno", "reyno@gmail.com", "12345", 3, fak1);
        Dosen dosen1 = new Dosen("Prof.Dito", "dito@gmail.com", "11098", 10, fak1);
        Tendik tendik1 = new Tendik("Nina", "nina@gmail.com", "10098", 8);

        Fakultas fak2 = new Fakultas("FSM", 5000000, 8000000);
        Mahasiswa mhs2 = new Mahasiswa("Felis", "rfelis@gmail.com", "12367", 5, fak2);
        Dosen dosen2 = new Dosen("dr.Puji", "puji@gmail.com", "11065", 15, fak2);
        Tendik tendik2 = new Tendik("Sella", "sella@gmail.com", "10024", 3);

        System.out.println("----------------Fakultas----------------");
        System.out.println("Fakultas 1 : ");
        fak1.printInfo();
        System.out.println("\nFakultas 2 : ");
        fak2.printInfo();
        System.out.println("\n----------------Mahasiswa----------------");
        System.out.println("Mahasiswa 1 : ");
        mhs1.printInfo();
        System.out.println("\nMahasiswa 2 : ");
        mhs2.printInfo();
        System.out.println("\n----------------Dosen----------------");
        System.out.println("Dosen 1 : ");
        dosen1.printInfo();
        System.out.println("\nDosen 2 : ");
        dosen2.printInfo();
        System.out.println("\n----------------Tendik----------------");
        System.out.println("Tendik 1 : ");
        tendik1.printInfo();
        System.out.println("\nTendik 2 : ");
        tendik2.printInfo();

        System.out.println("\n----------------Counter----------------");
        System.out.println("Total Mahasiswa: " + Mahasiswa.getCount());
        System.out.println("Total Karyawan: " + Karyawan.getCount());
        System.out.println("Total Dosen: " + Dosen.getCount());
        System.out.println("Total Tendik: " + Tendik.getCount());
    }
}