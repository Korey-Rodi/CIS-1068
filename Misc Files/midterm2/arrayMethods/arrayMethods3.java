//package Midterm2.arrayMethods;

public class arrayMethods3 {
    public static boolean same(int A[],int []B){
        if (A.length != B.length){
            return false;
        }
        for (int i = 0; i < A.length;i++){
            if (A[i]!=B[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        int [] A = {1,2,4};
        int [] B = {1,2,4,5};
        if (same(A, B)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
