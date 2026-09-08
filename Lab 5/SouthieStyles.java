/* Korey Rodi
10/3/25
Assignment 5 - Southie Styles

The purpose of this program is to run through a txt file and convert words
to match rules set in the functions.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class SouthieStyles {
 public static void main(String[] args) throws FileNotFoundException {
     String inputFilename = "jawsScript.txt";
     String outputFilename = "jawsBostonVersion.txt";
     Scanner in = new Scanner(new File(inputFilename));
     // Separate by white space and punctuation
     in.useDelimiter("[^\\p{Alpha}']+");
     PrintStream out = new PrintStream(new File(outputFilename));

     while (in.hasNext()) {
         String word = in.next();
         String converted = convertWord(word);
         out.print(converted + " ");
     }
     in.close();
     out.close();
 }

 public static String convertWord(String word) {
     word = veryToWicked(word);
     StringBuilder sb = new StringBuilder(word);
     sb = rAtEndExceptions(sb);
     sb = rFollowingVowel(sb);
     sb = aAppendR(sb);
     return sb.toString();
 }
 
 // Basic Rules
 public static StringBuilder rFollowingVowel(StringBuilder sb) {
     for (int i = 0; i < sb.length() - 1; i++) {
         if (isVowel(sb.charAt(i)) && sb.charAt(i + 1) == 'r') {
             sb.setCharAt(i + 1, 'h');
         }
     }
     return sb;
 }

 public static StringBuilder aAppendR(StringBuilder sb) {
     int lastIndex = sb.length() - 1;
     if (sb.length() == 0) {
         return sb;
     }
     if (sb.charAt(lastIndex) == 'a' && sb.length() > 1) {
         sb.append('r');
     }
     return sb;
 }

 public static String veryToWicked(String word) {
     if (word.equalsIgnoreCase("very")) {
         return "wicked";
     }
     return word;
 }
 
 // Exceptions
 public static StringBuilder rAtEndExceptions(StringBuilder sb) {
	 int len = sb.length();
	    if (len < 3) return sb;

	    if (sb.charAt(len - 1) == 'r') {
	        String lower = sb.toString().toLowerCase();

	        if (lower.endsWith("eer") || lower.endsWith("ir")) {
	            sb.replace(len - 1, len, "yah");
	            return sb;
	        }

	        if (lower.endsWith("oor")) {
	            sb.replace(len - 1, len, "wah");
	            return sb;
	        }
	    }

	    return sb;
	}
// Check if char is vowel
 public static boolean isVowel(char c) {
     c = Character.toLowerCase(c);
     return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
 }
}
