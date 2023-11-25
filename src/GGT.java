public class GGT {
    static int n = 0;
    static int a = 0;
    static int b = 0;
    public static void main(String[] args) {
        //a = 544;
        //b = 391;
        a = 60;
        b = 150;
        //a = 500;
        //b = 1;
        System.out.println(getGGTSteinischIt(a,b));
        //System.out.println(n);
        n=0;
        System.out.println(getGGTSteinischRec(a,b));
        //System.out.println(n);
        System.out.println(getGGTEuklIt(a,b));
        System.out.println(getGGTEuklRec(a,b));
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

    public static int getGGTSteinischIt(int a, int b){
        n++;
        while(a!=b){
            if(a%2!=0 && b%2!=0){
                n++;
                if(a>b){
                    a = (a-b)/2;
                }else b=(b-a)/2;
            }
            while(a%2==0){
                n++;
                a/=2;
            }
            while(b%2==0){
                n++;
                b/=2;
            }

        }
        return a*2;
    }

    public static int getGGTSteinischRec(int a, int b){
        n++;
        if(a==b){
            return a*2;
        }
        if(a%2==0){
            return getGGTSteinischRec(a/2, b);
        }
        if(b%2==0){
            return getGGTSteinischRec(a,b/2);
        }
        if(a>b){
            return getGGTSteinischRec((a-b)/2, b);
        }
        return getGGTSteinischRec((b-a)/2, a);
    }

    public static int getGGTEuklIt(int a, int b){
        while(b!=0){
            int h= a%b;
            a = b;
            b = h;
        }
        return a;
    }

    public static int getGGTEuklRec(int a, int b){
        if(b==0){
            return a;
        }
        return getGGTEuklIt(b, a%b);
    }
}
