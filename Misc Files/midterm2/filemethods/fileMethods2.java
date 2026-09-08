//package Midterm2.fileMethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileMethods2 {
    public static int numWords(String inputFilename)throws FileNotFoundException{
        Scanner in = new Scanner(new File(inputFilename));
        int count = 0;
        while (in.hasNextLine()) {
            in.next();
            count ++;
        }

        in.close();
        return count;
    }
    public static void main(String[] args)throws FileNotFoundException {
        String inputFilename = "Midterm2/fileMethods/words.txt";
        System.out.println(numWords(inputFilename));
    }
    
}