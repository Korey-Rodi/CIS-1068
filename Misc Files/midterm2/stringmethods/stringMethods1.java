package Midterm2.stringMethods;

public class stringMethods1 {
    public static boolean doubleLetter(String str){
        for (int i = 0; i < str.length()-1;i++){
            if (str.charAt(i) == str.charAt(i+1)){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        String str = "Koreyy";
        System.out.println(doubleLetter(str));
        
    }
    
}
