public class CobaArray2{
    public static void main(String[] args){
        int[][] data = new int[3][2];
        data[0] = new int[2];
        data[0][0] = 1;
        data[0][1] = 2;

        data[1] = new int[2];
        data[1][0] = 1;
        data[1][1] = 2;

        data[2] = new int[2];
        data[2][0] = 3;
        data[2][1] = 4;

        for(int x = 0; x<3; x++){
            for(int y=0; y<2; y++){
                System.out.println("[coba] index ke -["+x+"]["+y+"] berisi : "+data[x][y]);
            }
        }
    }
}