class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0):"jari jari tidak boleh bernilai 0";
        Lingkaran ling1 = new Lingkaran(jariJari);
        double kelilingLingkaran = ling1.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

//Program ini menggunakan asersi untuk memvalidasi input, 
//tetapi asersi dapat dinonaktifkan saat menjalankan program tanpa -ea
//Sehingga pembuatan objek dengan nilai jariJari = 0 yang menghasilkan keliling tidak valid
