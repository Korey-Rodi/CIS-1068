package Midterm2.stringMethods;

public class stringMethods7 {
    public static String appendIfMissing(String S, String E){
        if (S.endsWith(E)) {
            return S;
        } else {
            return S + E;
        }
    }
    public static void main(String[] args) {
        String s = "Lightning";
        String e = "bug";
        String z = "Lightningbug";
        String a = "lol";
        System.out.println(appendIfMissing(s, e));
        System.out.println(appendIfMissing(z, a));

    }
}

