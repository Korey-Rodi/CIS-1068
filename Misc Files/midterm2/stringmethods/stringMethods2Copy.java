package Midterm2.stringMethods;

public class stringMethods2Copy {
    public static int indexOfLast(String word){
        for (int i = word.length()-1; i >= 0; i--){
            if (isRoman(word.charAt(i))){
                return i;
            }
        }
    return - 1;
    }
    public static boolean isRoman(char c){
        String romans = "ivxlcdmIVXLCDM";

        for (int i = 0; i <romans.length(); i++){
            if (romans.charAt(i)== c) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String word = "ivcMD";
        System.out.println(indexOfLast(word));

    }
}

    
