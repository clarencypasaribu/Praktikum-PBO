 /* Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method dalam class titik
 * Pembuat : Clarency Christy Pasaribu / 24060123130113
 * Tanggal : Senin, 21 Februari 2025
 */

public class Titik{
    double absis;
    double ordinat;
    static int count = 0;

    //konstruktor membuat titik
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
    }

    //membuat titik (0,0)
    Titik(){
        this(0,0);
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }
    void setAbsis(double x){
        absis = x;
    }

    void setOrdinat(double y){
        ordinat = y;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat +")");
    }

    int getKuadran() {
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
    double getJarakPusat() {
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    //mengembalikan nilai jarak antara titik akar(((absis-absis)^2) + ((ordinat-ordinat)^2))
    double getJarak(Titik T){
        return Math.sqrt(Math.pow(this.absis - T.absis, 2) + Math.pow(this.ordinat - T.ordinat, 2));
    }

    //merefleksikan Titik terhadap x(mengubah ordinat)
    void setRefelksiX() {
        this.ordinat = this.ordinat * (-1);
    }

    //merefleksikan Titik terhadap y(mengubah absis)
    void setRefelksiY() {
        this.absis = this.absis * (-1);
    }

    //mengembalikan Titik baru yang sudah direfleksikan terhadap x
    Titik getRefleksiX() {
            /* T = new Titik();
            T.setOrdinat((ordinat*(-1)));
            T.setAbsis(absis);
            return T;
            */

        return new Titik(this.absis, -this.ordinat);
    }

    //mengembalikan Titik baru yang sudah direfleksikan terhadap x
    Titik getRefleksiY() {
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