class Persegi extends BangunDatar implements IResize {
    private double sisi;
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public void zoomIn() {
        sisi *= 1.1;
    }
    
    @Override
    public void zoomOut() {
        sisi *= 0.9;
    }
    
    @Override
    public void zoom(int percent) {
        sisi += sisi * percent / 100.0;
    }
    
    @Override
    public void showUkuran() {
        System.out.println("Persegi: " + sisi);
    }
}
