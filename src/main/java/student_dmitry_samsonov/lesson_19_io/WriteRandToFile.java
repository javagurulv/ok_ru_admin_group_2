package student_dmitry_samsonov.lesson_19_io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

class WriteRandToFile {
    public static void main(String[] args) {
        try {
            File file = new File("/tmp/rand.txt");
            FileWriter myWriter = new FileWriter(file);

            Random rand = new Random();
            for (int i = 0; i < 1000; i++) {
                myWriter.write(Integer.toString(rand.nextInt()) + '\n');
            }
            myWriter.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
