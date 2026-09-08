//package Midterm2.fileMethods;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileMethods1 {
    public static int numChars(String inputFilename)throws FileNotFoundException{
        Scanner in = new Scanner(new File(inputFilename));
        int count = 0;
        while (in.hasNextLine()) {
            String line = in.nextLine();
            count += line.length();
        }

        in.close();
        return count;
    }
    public static void main(String[] args)throws FileNotFoundException {
        String inputFilename = "Midterm2/fileMethods/words.txt";
        System.out.println(numChars(inputFilename));
    }
    
}
