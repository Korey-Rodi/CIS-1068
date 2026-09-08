package Midterm2.arrayMethods;

public class arrayMethods11 {
    public static void main(String[] args) {
    String [] words = {"apple", "car","abc"};
    String [] Reversed = new String [words.length];
    for (int i = 0; i < words.length;i++) {
        StringBuilder sb = new StringBuilder(words[i]);
        Reversed[i] = sb.reverse().toString();
    }
    for (int i = 0; i < words.length; i++){
        System.out.print(Reversed[i] + " ");
    }
        
    }
    
}