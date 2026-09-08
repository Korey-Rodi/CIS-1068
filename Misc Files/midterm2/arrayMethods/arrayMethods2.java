//package Midterm2.arrayMethods;

public class arrayMethods2 {
    public static boolean isPalindrome(int A[]){
        for (int i = 0; i < A.length / 2 ;i++){
            if (A[i] != A[A.length - 1 - i]){
                return false;
            }

        }
        return true;
    }
    public static void main(String [] args){
        int [] A = {1,1};
        boolean result = isPalindrome(A);
        System.out.println(result);

    }

    
}

