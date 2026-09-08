package FinalExam;
public class Recursion {
    public static int f (int x){
        if (x == 0){
            return 1;
        } else {
            return 2 * f(x - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(f(6));
    }
    
}
