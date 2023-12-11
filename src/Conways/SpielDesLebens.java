package Conways;

public class SpielDesLebens {
    public static void main(String[] args) throws InterruptedException {
        int height = 15;
        int width = 1000;
        int n = 30;
        Grid currentGen = new Grid(height,width);
        for(int i = 0; i<n; i++){
            currentGen = currentGen.nextGen();
            System.out.println();
            Thread.sleep(2000);
        }
    }
}
