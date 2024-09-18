public class Main {
    public static void show(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void rotate(int[][] matrix) {
        int length = matrix.length;

        int top = 0;
        int bottom = length - 1;

        while (top < bottom) {
            for (int col = 0; col < length; col++) {
                int temp = matrix[top][col];
                matrix[top][col] = matrix[bottom][col];
                matrix[bottom][col] = temp;
            }
            top++;
            bottom--;
        }
        for (int row = 0; row < length; row++) {
            for (int col = row + 1; col < length; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        show(matrix);
    }

    public static void main(String[] args) {
        int[][] matrix = new int[4][4];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                matrix[i][j] = i;
            }
        }
        show(matrix);
        System.out.println();
        rotate(matrix);
    }
}