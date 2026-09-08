//package Midterm2.fileMethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileMethods3 {
    public static int longestWord(String inputFilename)throws FileNotFoundException{
        Scanner in = new Scanner(new File(inputFilename));
        int longest = 0;
        while (in.hasNext()) {
            String word = in.next();
             if (word.length() > longest) {
                longest = word.length();
        }
    }

        in.close();
        return longest;
    }
    
    public static void main(String[] args)throws FileNotFoundException {
        String inputFilename = "Midterm2/fileMethods/words.txt";
        System.out.println(longestWord(inputFilename));
    }
    
}
