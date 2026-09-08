package Midterm2.arrayMethods;

public class arrayMethods7 {
    public static int [] copy(int [] A, int n){
        int count = 0;
        for (int i = 0; i < A.length;i++){
            if (A[i]>=n){
                count++;
            }
        }
        int [] C = new int [count];
        int index = 0;
        for (int x=0; x < A.length; x++){
            if (A[x] >= n){
                C[index] = A[x];
                index++;
            }
        }
        return C;
    }
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5,6};
        int n = 4;
        int [] result = copy(A, n);
        for (int i = 0;i < result.length;i++){
            System.out.println(result[i]);
        }
        
    }
    
}
