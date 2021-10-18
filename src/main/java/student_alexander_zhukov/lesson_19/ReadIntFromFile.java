package student_alexander_zhukov.lesson_19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadIntFromFile {
    public static void main(String[] args) {

        int sum = 0;

        try {
            File file = new File("src/main/java/student_alexander_zhukov/randomint.txt");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                Integer data = Integer.valueOf(myReader.nextLine());
                sum += data;
            }
            System.out.println(sum);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
