package teacher.lesson_19_io.lessoncode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		try {
			File file = new File("src/main/java/teacher/lesson_19_io/files/filename.txt");
			FileWriter myWriter = new FileWriter(file);
			myWriter.write("Files in Java might be tricky, but it is fun enough!");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
