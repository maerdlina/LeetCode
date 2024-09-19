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
        int length = matrix.length;
        int i = 0, j = 0, temp;
        int a = 0, b = length - 1;
        while (number < n * n) {
            // Заполнение верхней строки
            while (j < length && matrix[i][j] == 0) {
                matrix[i][j] = ++number;
                j++;
            }
            i++;
            j--;

            // Заполнение правого столбца
            while (i < length && matrix[i][j] == 0) {
                matrix[i][j] = ++number;
                i++;
            }
            i--;
            j--;

            // Заполнение нижней строки
            while (j >= 0 && matrix[i][j] == 0) {
                matrix[i][j] = ++number;
                j--;
            }
            i--;
            j++;

            // Заполнение левого столбца
            while (i >= 0 && matrix[i][j] == 0) {
                matrix[i][j] = ++number;
                i--;
            }
            i++;
            j++;
        }
        show(matrix);
        return matrix;
    }
    public static void main(String[] args) {
        System.out.println(generateMatrix(5));
    }
}