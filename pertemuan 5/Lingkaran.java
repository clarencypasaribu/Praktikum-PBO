class Lingkaran extends BangunDatar implements IResize {
    private double radius;
    
    public Lingkaran(double radius) {
        this.radius = radius;
    }
    
    @Override
    public void zoomIn() {
        radius *= 1.1;
    }
    
    @Override
    public void zoomOut() {
        radius *= 0.9;
    }
    
    @Override
    public void zoom(int percent) {
        radius += radius * percent / 100.0;
    }
    
    @Override
    public void showUkuran() {
        System.out.println("Lingkaran: " + radius);
    }
}

