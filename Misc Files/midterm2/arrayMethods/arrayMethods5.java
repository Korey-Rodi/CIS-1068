//package Midterm2.arrayMethods;

public class arrayMethods5 {
    public static int [] copy(int[]A,int n){
        int [] C = new int [n];
        for (int i =0; i < n;i++){
            C[i] = A[i];
        }
        return C;


    }
    public static void main(String [] args){
        int [] A = {1,2,3,4,5,6,7};
        int n = 4;
        int [] result = copy(A,n);
        for (int i = 0;i < result.length;i++){
            System.out.print(result[i] + " ");
        }
        
    }

    
}
