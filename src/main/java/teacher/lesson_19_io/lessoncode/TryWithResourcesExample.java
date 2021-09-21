package teacher.lesson_19_io.lessoncode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		File file = new File("src/main/java/teacher/lesson_19_io/files/filename.txt");
		try {
			FileInputStream fileIS = new FileInputStream(file);
			BufferedReader br = new BufferedReader(new InputStreamReader(fileIS));
			try (br) {
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: ");
			e.printStackTrace();
		} catch (SecurityException e) {
			System.out.println("Security exception: ");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException: ");
			e.printStackTrace();
		}
	}

}