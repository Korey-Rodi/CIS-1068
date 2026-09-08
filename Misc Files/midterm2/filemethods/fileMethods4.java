package midterm2.filemethods;

import java.util.*;
import java.io.*;


public class fileMethods4 {
    public static double findSum(String fileName)throws FileNotFoundException{
        Scanner in = new Scanner(new File(fileName));

        String line = in.nextLine();
        double highestSoFar = avg(line);
        while (in.hasNextLine()){
            line = in.nextLine();
            double cur = avg(line);
            if (cur > highestSoFar) {
                highestSoFar = cur;
            }
        }
        in.close();
        return highestSoFar;
    }

    public static double avg(String line){
        Scanner in = new Scanner(line);
        String name = in.next();
        System.out.println(name);
        int count = 0;
        double sum = 0;

        while (in.hasNextInt()) {
            count++;
            sum += in.nextInt();
        }
        in.close();
        return sum/count;
    }
    public static void main(String[] args)throws FileNotFoundException {
        String fileName = "Misc Files/midterm2/grades.txt";
        System.out.println(findSum(fileName));
    }
    
}
