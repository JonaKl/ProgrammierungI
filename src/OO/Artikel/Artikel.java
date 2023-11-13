package OO.Artikel;

public class Artikel {
    private int id;
    private double preis;

    public Artikel(int id, double preis) {
        this.id = id;
        this.preis = preis;
    }

    public int getId() {
        return id;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        if(preis>=0){
            this.preis = preis;
        }else throw new ArithmeticException("Der Preis muss größer oder gleich 0 sein.");
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "ID: " + this.id + ", Preis: " + this.preis;
    }
}
