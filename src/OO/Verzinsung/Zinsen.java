package OO.Verzinsung;

public class Zinsen{
    public static double getZinsen(double kapital, double zinssatz, int laufzeit){
        for(int i = 0; i < laufzeit; i++){
            kapital = kapital * (1 + zinssatz);
        }
        return kapital;
    }

    public static double getZinsenRekursiv(double kapital, double zinssatz, int laufzeit){
        if(laufzeit == 0) {
            return kapital;
        }
        return getZinsenRekursiv(kapital * (1 + zinssatz), zinssatz, laufzeit - 1);
    }
}