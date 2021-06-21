package modul4;


abstract class BangunRuang{
    abstract double getLuasPermukaan();
    abstract double getVolume();
}

class Tabung extends BangunRuang{
    int r;
    int t;
    int lingkaran;


    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getLingkaran() {
        return lingkaran;
    }

    public void setLingkaran(int lingkaran) {
        this.lingkaran = lingkaran;
    }

    @Override
    double getLuasPermukaan(){
        r = getR();
        t = getT();
        return 2*(22/7)*r*(r+t);
    }
    @Override
    double getVolume(){
        r = getR();
        t = getT();
        lingkaran = (22/7)*r*r;
        return lingkaran*t;
    }
}

class Balok extends BangunRuang{
    int panjang;
    int lebar;
    int tinggi;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    double getLuasPermukaan(){
        panjang = getPanjang();
        lebar = getLebar();
        tinggi = getTinggi();
        return 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    }
    @Override
    double getVolume(){
        panjang = getPanjang();
        lebar = getLebar();
        tinggi = getTinggi();
        return panjang*lebar*tinggi;
    }
}
public class Abstract {
    public static void main (String[] args){
        Tabung tb = new Tabung();
        tb.setT(12);
        tb.setR(7);
        tb.getLuasPermukaan();
        tb.getVolume();
        
        Balok bk = new Balok();
        bk.setPanjang(15);
        bk.setLebar(5);
        bk.setTinggi(10);
        bk.getLuasPermukaan();
        bk.getVolume();
        
        System.out.println("tinggi : "+tb.getT());
        System.out.println("jari-jari : "+tb.getR());
        System.out.println("luas permukaan tabung : "+tb.getLuasPermukaan());
        System.out.println("volume tabung : "+tb.getVolume());
        System.out.println("panjang : "+bk.getPanjang());
        System.out.println("lebar :  "+bk.getLebar());
        System.out.println("tinggi : "+bk.getTinggi());
        System.out.println("luas permukaan balok : "+bk.getLuasPermukaan());
        System.out.println("volume balok : "+bk.getVolume());
    }
    
}
