package student_dmitry_samsonov.lesson_19_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class CountSumFromFile {
    public static void main(String[] args) {
        try {
            File file = new File("/tmp/rand.txt");
            Scanner myReader = new Scanner(file);
            Integer sum = 0;
            while (myReader.hasNextLine()) {
                Integer number = Integer.valueOf(myReader.nextLine());
                sum += number;
            }
            myReader.close();
            System.out.println("Sum is " + sum);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
