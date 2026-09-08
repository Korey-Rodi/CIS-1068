package misc;

import java.util.Scanner;

public class ScannerIn {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.next();
        System.out.println(name);
        console.close();
    }
    
}
