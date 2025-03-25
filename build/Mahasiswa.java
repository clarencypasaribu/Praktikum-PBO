public class Mahasiswa extends CivitasAkademika{
    //Atribut
    private static int count = 0;
    private String NIM;
    private int semester;
    private Fakultas fakultas;

    //Method
    public Mahasiswa(String nama, String email, String NIM, int semester, Fakultas fakultas) {
        super(nama, email);
        this.NIM = NIM;
        this.semester = semester;
        this.fakultas = fakultas;
        count++;
    }

    public static int getCount(){
        return count;
    }
    public String getNIM(){
        return NIM;
    }
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    public int getSemester(){
        return semester;
    }
    public void setSemester(int semester){
        this.semester = semester;
    }
    public Fakultas getFakultas(){
        return fakultas;
    }
    public void setFakultas(Fakultas fakultas){
        this.fakultas = fakultas;}
    
    public double hitungUKT() {
        return fakultas.getBiaya_UKT() * Math.pow(0.95, semester - 1);
    }

    @Override
    public void printInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Email : " + getEmail());
        System.out.println("NIM: " + NIM);
        System.out.println("Semester : " + semester);
        System.out.println("Fakultas : " + fakultas.getNama());
        System.out.println("UKT : " + hitungUKT());
    }
}
