//Don't solve
public class Main {
    public static void show(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int number = 0;
        int lenght = matrix.length;
        int i = 0, j = 0, temp;

        while(j < lenght - 1){
            matrix[i][j] = ++number;
            j++;
        }
        while(i < lenght - 1){
            matrix[i][j] = ++number;
            i++;
        }
        while(j > 0){
            matrix[i][j] = ++number;
            j--;
        }
        while(i > 0){
            matrix[i][j] = ++number;
            i--;
        }
        i++;
        j++;
        show(matrix);
        return matrix;
    }
    public static void main(String[] args) {
        System.out.println(generateMatrix(4));
    }
}