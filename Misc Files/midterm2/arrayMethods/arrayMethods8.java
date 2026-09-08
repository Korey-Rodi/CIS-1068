package Midterm2.arrayMethods;

public class arrayMethods8 {
    public static boolean ascendingOrder(int [] A){
        for (int i = 0; i < A.length-1;i++){
            if (A[i] > A[i+1]){
                return false;
            } 
        }
        return true;
    }
    public static void main(String[] args) {
        int [] A = {1,2,4,9,6};
        System.out.println(ascendingOrder(A));
        
    }
    
}
