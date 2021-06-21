package modul4;


interface SegiEmpat{
    double luas();
    double keliling();
}

class Persegi implements SegiEmpat{
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }
    public Persegi(){
    
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double luas(){
        sisi = getSisi();
        return sisi*sisi;
    }
    
    @Override
    public double keliling(){
        sisi = getSisi();
        return 4*sisi;
    }
}

class Kubus extends Persegi{
    private int Tinggi;


    public Kubus(int Tinggi, int sisi) {
        super(sisi);
        this.Tinggi = Tinggi;
    }

    public Kubus(int Tinggi) {
        this.Tinggi = Tinggi;
    }
    
    public Kubus(){
    
    }

    public int getTinggi() {
        return Tinggi;
    }

    public void setTinggi(int Tinggi) {
        this.Tinggi = Tinggi;
    }
    
    public double getVolume(){
        Tinggi = getTinggi();
        sisi = getSisi();
        return sisi*sisi*sisi;
    }
}

class PersegiPanjang implements SegiEmpat{
    int Panjang;
    int Lebar;

    public PersegiPanjang(int Panjang, int Lebar) {
        this.Panjang = Panjang;
        this.Lebar = Lebar;
    }
    public PersegiPanjang(){
    
    }

    public int getPanjang() {
        return Panjang;
    }

    public void setPanjang(int Panjang) {
        this.Panjang = Panjang;
    }

    public int getLebar() {
        return Lebar;
    }

    public void setLebar(int Lebar) {
        this.Lebar = Lebar;
    }
    
    @Override
    public double luas(){
        Lebar = getLebar();
        Panjang = getPanjang();
        return Panjang*Lebar;
    }
    @Override
    public double keliling(){
        Lebar = getLebar();
        Panjang = getPanjang();
        return 2*(Panjang+Lebar);
    }
}

class balok extends PersegiPanjang{
    private int tinggi;

    public balok(int tinggi, int Panjang, int Lebar) {
        super(Panjang, Lebar);
        this.tinggi = tinggi;
    }
    
    public balok (){
    
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public double getVolume(){
       Panjang = getPanjang();
       Lebar = getLebar();
       tinggi = getTinggi();
       return Panjang*Lebar*tinggi;
       
    }
}
public class Interface {
    public static void main(String[] args) {
        Persegi pg = new Persegi();
        pg.setSisi(4);
        pg.luas();
        pg.keliling();
        
        
        Kubus kb = new Kubus();
        kb.setTinggi(8);
        kb.setSisi(4);
        kb.getVolume();
        
        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(10);
        pp.setLebar(5);
        pp.luas();
        pp.keliling();
        
        balok bk = new balok();
        bk.setPanjang(10);
        bk.setLebar(5);
        bk.setTinggi(10);
        bk.getVolume();
        
        System.out.println("sisi : "+pg.getSisi());
        System.out.println("luas persegi : "+pg.luas());
        System.out.println("keliling persegi : "+pg.keliling());
        System.out.println("volume kubus : "+kb.getVolume());
        System.out.println("panjang : "+pp.getPanjang());
        System.out.println("lebar :  "+pp.getLebar());
        System.out.println("luas persegi panjang : "+pp.luas());
        System.out.println("keliling persegi panjang : "+pp.keliling());
        System.out.println("tinggi : "+bk.getTinggi());
        System.out.println("volume balok : "+bk.getVolume());
        
    }
}
