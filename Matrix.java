public class Matrix {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {0, 0, 0, 0, 0, 0},
            {0, 10, 0, 0, 0, 0},
            {0, 0, 0, 0, 17, 23},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 11, 0, 0},
            {0, 0, 0, 0, 6, 0},
        };

        int rows_num = matrix1.length;
        int columns_num = matrix1[0].length;
        int[] first_row = {rows_num, columns_num, 0};

        System.out.println("|"+first_row[0] + " " + first_row[1] +" " + first_row[2]+"|");
        System.out.println("- - - -");
        for(int i = 0; i<rows_num; i++){
            for(int j = 0; j<columns_num; j++){
                if(matrix1[i][j]>0){
                    int[] row = {i, j, matrix1[i][j]};
                    System.out.println("|"+row[0] + " " + row[1] + " " + row[2]+"|");
                }
            }
        }
    }
}
