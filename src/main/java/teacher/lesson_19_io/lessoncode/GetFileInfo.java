package teacher.lesson_19_io.lessoncode;

import java.io.File;

public class GetFileInfo {

	public static void main(String[] args) {
		File file = new File("src/main/java/teacher/lesson_19_io/files/filename.txt");
		if (file.exists()) {
			System.out.println("File name: " + file.getName());
			System.out.println("Absolute path: " + file.getAbsolutePath());
			System.out.println("Writeable: " + file.canWrite());
			System.out.println("Readable " + file.canRead());
			System.out.println("File size in bytes " + file.length());
		} else {
			System.out.println("The file does not exist.");
		}
	}

}
