/*
Zava
Program1
01/21/2024
 */

import java.io.*;
import java.util.Scanner;

public class Program1 {

    // Input
    static String userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the file name");

        String fileName = scanner.nextLine();

        return fileName;
    }
    
    public static void main(String[] args) {
        // Setting variables
        int maxNum = 0;
        int minNum = 0;
        int tempNum;
        int numInt = 0;

        try {
            File numFile = new File(userInput());
            Scanner myReader = new Scanner(numFile);
            while(myReader.hasNextLine()) {
                tempNum = myReader.nextInt();

                //sets up minimum and maximum numbers to compare to
                if (numInt == 0) {
                    minNum = tempNum;
                }

                //sets up minimum and maximum numbers to compare to
                if (numInt == 1) {
                    if (tempNum < minNum) {
                        minNum = tempNum;
                    }
                    else {
                        maxNum = tempNum;
                    }
                }

                //compares if the int read from file is bigger or smaller than min or max
                else {
                    if (tempNum < minNum) {
                        minNum = tempNum;
                    }
                    if (tempNum > maxNum) {
                        maxNum = tempNum;
                    }
                }
                numInt++;
            }

            // Output
            System.out.println("Name of the input file: " + numFile);
            System.out.println("Smallest Integer: " + minNum);
            System.out.println("Largest Integer: " + maxNum);
            System.out.println("Number of integers in the file: " + numInt);
        }

        catch (FileNotFoundException e) {
            System.out.println("Unable to find the file correctly :'(");
            e.printStackTrace();
        }
    }
}
