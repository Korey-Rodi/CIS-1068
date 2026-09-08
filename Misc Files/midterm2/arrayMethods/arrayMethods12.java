package Midterm2.arrayMethods;

public class arrayMethods12 {
    public static void rowByRow(int[][]A){
        for (int i = 0; i < A.length;i++){
            for (int j = 0; j < A[i].length;j++){
                System.out.print(A[i][j]+ " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int [][] A = {
            {1,2,3},
            {4,5,6}
        };
        rowByRow(A);
        
    }
    
}
