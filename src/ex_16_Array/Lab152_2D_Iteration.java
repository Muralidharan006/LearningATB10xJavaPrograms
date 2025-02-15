package ex_16_Array;

public class Lab152_2D_Iteration {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{2,3,4},{3,4,5}};
        for(int i = 0; i<matrix.length;i++){ //matrix.lenght is always rows
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+"|");
            }
            System.out.println();
        }
    }
}
