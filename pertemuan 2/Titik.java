 /* Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method dalam class titik
 * Pembuat : Clarency Christy Pasaribu / 24060123130113
 * Tanggal : Senin, 21 Februari 2025
 */

public class Titik{
    private double absis;
    private double ordinat;
    private static int count = 0;

    //konstruktor membuat titik
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
    }

    //membuat titik (0,0)
    public Titik(){
        this(0,0);
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public void setAbsis(double x){
        absis = x;
    }

    public void setOrdinat(double y){
        ordinat = y;
    }

    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat +")");
    }

    public int getKuadran() {
            if (this.absis > 0 && this.ordinat > 0) {
                return 1;
            } else if (this.absis < 0 && this.ordinat > 0) {
                return 2;
            } else if (this.absis < 0 && this.ordinat < 0) {
                return 3;
            } else if (this.absis > 0 && this.ordinat < 0) {
                return 4;
            } else {
                return 0;
            }
        }

    //mengembalikan nilai jarak titik ke pusat(0,0)
    public double getJarakPusat() {
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    //mengembalikan nilai jarak antara titik akar(((absis-absis)^2) + ((ordinat-ordinat)^2))
    public double getJarak(Titik T){
        return Math.sqrt(Math.pow(this.absis - T.absis, 2) + Math.pow(this.ordinat - T.ordinat, 2));
    }

    //merefleksikan Titik terhadap x(mengubah ordinat)
    public void setRefelksiX() {
        this.ordinat = this.ordinat * (-1);
    }

    //merefleksikan Titik terhadap y(mengubah absis)
    public void setRefelksiY() {
        this.absis = this.absis * (-1);
    }

    //mengembalikan Titik baru yang sudah direfleksikan terhadap x
    public Titik getRefleksiX() {
            /* T = new Titik();
            T.setOrdinat((ordinat*(-1)));
            T.setAbsis(absis);
            return T;
            */

        return new Titik(this.absis, -this.ordinat);
    }

    //mengembalikan Titik baru yang sudah direfleksikan terhadap x
    public Titik getRefleksiY() {
            /* T = new Titik();
            T.setAbsis(absis*(-1));
            T.setOrdinat(ordinat);
            return T;
            */

        return new Titik(-this.absis, this.ordinat);
    }

    @Override
    public String toString() {
        return "(" + absis + ", " + ordinat + ")";
    }

}