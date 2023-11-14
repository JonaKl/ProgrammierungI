public class GGT {
    static int n = 0;
    public static void main(String[] args) {
        System.out.println(getGGTWithEdgeCases(123123,12384));
        System.out.println(n);
    }

    public static int getGGTWithEdgeCases(int a, int b){
        if(a<0||b<0){
            throw new IllegalArgumentException("Die Zahlen dürfen nicht kleiner als 0 sein.");
        }
        if(a==b){
            return a;
        }
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        return getGGT(a,b);
    }
    public static int getGGT(int a, int b){
        int c = Math.max(a,b) - Math.min(a,b);
        n++;
        if (Math.min(a,b)!=c){
            c=getGGT(Math.min(a,b), c);
        }
        return c;
    }

}
