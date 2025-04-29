public class Main {
    public static void main(String[] args) {
        System.out.println("===== Kucing =====");
        Anabul kucing1 = new Kucing("Milo");
        kucing1.gerak();
        kucing1.bersuara();

        System.out.println("\n===== Anjing =====");
        Anabul anjing1 = new Anjing("Dora");
        anjing1.gerak();
        anjing1.bersuara();

        System.out.println("\n===== Burung =====");
        Anabul burung1 = new Burung("Nino");
        burung1.gerak();
        burung1.bersuara();
    }
}
