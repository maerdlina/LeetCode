public class Main {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] newArray;

        if(original.length != m * n) newArray = new int[0][0];
        else {
            newArray = new int[m][n];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    newArray[i][j] = original[i*n + j];
                }
            }
        }

        return newArray;
    }
    public static void main(String[] args) {
        int m = 5;
        int n = 1;
        int[] array = new int[m];
        for(int i = 0; i < m; i++)
            array[i] = i;
        int[][] twoDArray = construct2DArray(array,m,n);
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(twoDArray[i][j]);
            }
            System.out.println("");
        }

    }
}