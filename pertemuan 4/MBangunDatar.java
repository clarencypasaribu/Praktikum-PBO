public class MBangunDatar {
    public static void main(String[] args){
        Persegi p1 = new Persegi(4, "biru", "hitam");
        Lingkaran l1 = new Lingkaran(5, "merah", "kuning");

        p1.printInfo();
        System.out.println("Keliing persegi : "+ p1.getKeliling());
        System.out.println("Luas persegi : " + p1.getLuas());
        System.out.println("Diagonal persegi : " + p1.getDiagonal());

        System.out.println("----------------------------------------------");
        
        l1.printInfo();
        System.out.println("Sisi : "+ l1.getJari());
        System.out.println("Keliing persegi : "+ l1.getKeliling());
        System.out.println("Luas persegi : " + l1.getLuas());
    }
}
