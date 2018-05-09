package pl.edu.ur.oopl9;


public class Samochod {
    
    private String marka;
    private String nazwa;
    private int pred;
    private int cena;

    public Samochod(String marka, String nazwa, int pred, int cena) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.pred = pred;
        this.cena = cena;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getPred() {
        return pred;
    }

    public void setPred(int pred) {
        this.pred = pred;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Samochod{" + "marka=" + marka + ", nazwa=" + nazwa + ", pred=" + pred + ", cena=" + cena + '}';
    }
    
    
    
}
