public class Main {
    public static void main(String[] args) {
        Persegi p1 = new Persegi(5);
        Lingkaran l1 = new Lingkaran(14);
        System.out.println("----------------Persegi ----------------");
        p1.showUkuran();
        System.out.println("\nZoomIn:");
        p1.zoomIn();
        p1.showUkuran();
        System.out.println("\nZoomOut:");
        p1.zoomOut();
        p1.showUkuran();
        System.out.println("\nZoom 35%:");
        p1.zoom(35);
        p1.showUkuran();

        System.out.println("\n----------------Lingkaran----------------");
        l1.showUkuran();
        System.out.println("\nZoomIn:");
        l1.zoomIn();
        l1.showUkuran();
        System.out.println("\nZoomOut:");
        l1.zoomOut();
        l1.showUkuran();
        System.out.println("\nZoom 35%:");
        l1.zoom(35);
        l1.showUkuran();
    }
}

