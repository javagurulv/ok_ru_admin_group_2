package student_dmitry_samsonov.lesson_19_io;

import java.io.File;
import java.util.Optional;
import java.util.Scanner;

class FindLargestFile {
    public static void main(String[] args) {
        System.out.println("Enter path to scan:");
        Scanner scanner = new Scanner(System.in);
        File path = new File(scanner.nextLine());
        if (path.isDirectory()) {
            Optional<File> largest = getLargestFile(path);
            if (largest.isEmpty()) {
                System.out.println("No files were found in " + path);
            } else {
                System.out.println("Largest file is " + largest.get() + " with size of " +
                        largest.get().length() + "B");

            }
        } else {
            System.out.println(path + " is not a directory");
        }
    }

    static Optional<File> getLargestFile(File path_to_scan) {
        System.out.println("Scanning dir: " + path_to_scan.toString());
        Optional<File> largest = Optional.ofNullable(null);
        String[] paths = path_to_scan.list();
        if (paths == null) {
            return largest;
        }
        for (String path : paths) {
            File file = new File(path_to_scan + "/" + path);
            if (file.isFile()) {
                System.out.println("Checking size of " + file);
                if (largest.isEmpty() || file.length() > largest.get().length()) {
                    largest = Optional.of(file);
                }
            } else if (file.isDirectory()) {
                System.out.println("Found dir: " + file);
                Optional<File> largest_from_subdir = getLargestFile(file);
                if (largest.isEmpty() ||
                        largest_from_subdir.isPresent() && largest_from_subdir.get().length() > largest.get().length()) {
                    largest = largest_from_subdir;
                }
            } else {
                System.out.println("Neither file or dir: " + file.exists());
            }
        }
        return largest;
    }
}