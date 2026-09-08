//package Midterm2.arrayMethods;

public class arrayMethods1 {
    public static int passingScore(int[]A, int passing) {
        int count = 0;
        for (int i = 0; i < A.length;i++) {
            if (A[i] >= passing){
                count++;

            }
        }
        return count;
    

        }

    public static void main(String[] args) {
        int A [] = {1,5,7,9,11};
        int passing = 5;
        int result = passingScore(A,passing);
        System.out.println(result);

    
}
}
