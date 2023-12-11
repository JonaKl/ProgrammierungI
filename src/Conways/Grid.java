package Conways;

public class Grid {
    int height;
    int width;
    char[][] grid;
    public Grid(int height, int width){
        this.height = height;
        this.width = width;
        this.grid = new char[this.height][this.width];
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                grid[i][j] = ranState();
            }
        }
        this.printGrid();
    }
    public Grid(int height, int width, char[][] newGen){
        this.height = height;
        this.width = width;
        this.grid = newGen;
        this.printGrid();
    }

    private char ranState(){
        int i = (int)(Math.random()*2);
        return i==0?'-':'*';
    }

    public Grid nextGen(){
        char[][] newGrid = new char[height][width];
        for (int i = 0; i<this.height; i++){
            for (int j = 0; j<this.width; j++){
                int[] count = getCountNeighbours(i,j);
                char curr = grid[i][j];
                if(count[1]==3 || (count[1]==2 && getType(curr)==1)){ //Falls lebendig und 2 oder 3 Nachbarn am Leben oder falls 3 Nachbarn am Leben und Tod
                    newGrid[i][j] = '*'; //Setze auf lebendig
                } else { //Sonst (Falls lebendig und weniger als 2 oder mehr als 3 Nachbarn am Leben oder falls tot und nicht genau 3 lebende Nachbarn
                    newGrid[i][j] = '-'; //Setze auf tot
                }

                if(getType(curr)==1){
                    if(count[1]==2||count[1]==3){
                        newGrid[i][j] = '*';
                    } else {
                        newGrid[i][j] = '-';
                    }
                }else if(count[1]==3){
                    newGrid[i][j] = '*';
                }else{
                    newGrid[i][j] = '-';
                }
            }
        }
        return new Grid(height, width, newGrid);
    }

    private int[] getCountNeighbours(int indexY, int indexX){
        int[] count = new int[2];
        addToCount(indexY-1, indexX-1, count);
        addToCount(indexY-1, indexX, count);
        addToCount(indexY-1, indexX+1, count);
        addToCount(indexY, indexX-1, count);
        addToCount(indexY, indexX+1, count);
        addToCount(indexY+1, indexX-1, count);
        addToCount(indexY+1, indexX, count);
        addToCount(indexY+1, indexX+1, count);

        return count;
    }

    private void addToCount(int i, int j, int[] count){
        if(i<0){
            i = height+i;
        } else if (i>=height) {
            i = i-height;
        }
        if(j<0){
            j = width+j;
        } else if (j>=width) {
            j = j-width;
        }

        count[getType((this.grid[i][j]))]++;
    }

    private int getType(char c){
        return c=='-'?0:1;
    }


    public void printGrid(){
        for (char[] chars : this.grid) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }

}
