//package Midterm2.arrayMethods;

public class arrayMethods6 {
    public static int [] slice(int [] A,int i,int j){
        int [] C = new int [j-i+1];
        for (int x = i;x <= j; x++){
            C[x-i] = A[x];
        }
        return C;
    }
    public static void main(String [] args){
        int i = 0;
        int j = 1;
        int [] A = {1,2,3,4,5};
        int [] result = slice(A,i,j);
        System.out.println(result);
        for (int z = 0;z < result.length;z++){
            System.out.println(result[z] + " ");
        }

    }
    
}
