package student_alexander_zhukov.lesson_19;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

class WriteRandomIntToFile {
    public static void main(String[] args) {

        try {
            File file = new File("src/main/java/student_alexander_zhukov/randomint.txt");
            if (file.delete()) {
                System.out.println("Deleted the file: " + file.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
            Random intRand = new Random();
            FileWriter myWriter = new FileWriter(file);
            for (int i = 0; i < 100; i++) {
                myWriter.write(Integer.toString(intRand.nextInt(1000)) + '\n');
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
