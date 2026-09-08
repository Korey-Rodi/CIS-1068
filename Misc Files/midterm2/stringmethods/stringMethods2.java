package Midterm2.stringMethods;

public class stringMethods2 {
    public static int romanNumeral(String str){
        for (int i = str.length()-1; i >= 0;i--){
            if (str.charAt(i)== 'I' || str.charAt(i) == 'V' || str.charAt(i) == 'X'
            || str.charAt(i) == 'L' || str.charAt(i) == 'C' || str.charAt(i) == 'D'
            || str.charAt(i) == 'M'){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "oooooo";
        String str2 = "IVXLCDM";
        System.out.println(romanNumeral(str));
        System.out.println(romanNumeral(str2));

        
    }
    
}
