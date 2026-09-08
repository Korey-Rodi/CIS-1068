package misc;
public class test {
    public static void main(String[] args) {
        String phrase = "your mom is";
        String acronym = "";

        String[] words = phrase.split(" "); // split by spaces

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) { // make sure it's not empty
                acronym += words[i].toUpperCase().charAt(0);
            }
        }

        System.out.println(acronym); // Output: YMI
    }
}
