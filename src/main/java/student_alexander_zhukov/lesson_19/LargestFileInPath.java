package student_alexander_zhukov.lesson_19;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;


class LargestFileInPath {

    public String fileName = "";
    public long  size = 0;

    public static void main(String[] args) {
        System.out.println("Enter directory path:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File file = new File(path);
        LargestFileInPath fileSearch = new LargestFileInPath();
        if (file.isDirectory()) {
            fileSearch.list(path);
            System.out.println("Largest file");
            System.out.println("filename: " + fileSearch.fileName);
            System.out.println("size: " + fileSearch.size);
        } else {
            System.out.println(path + " is not a directory");
        }
    }

    public void list(String path) {
        File f = new File(path);
        String[] dirObjects = f.list();
        int i;
        for(i = 0; i < dirObjects.length; i++) {
            File f1 = new File(path + File.separator + dirObjects[i]);
            if (f1.isFile()) {
                if (f1.length() >= this.size) {
                    this.size = f1.length();
                    this.fileName = path + File.separator + dirObjects[i];
                }
                //System.out.println(path + File.separator + dirObjects[i] + " Size: " + f1.length());
            } else if (f1.isDirectory()) {
                list(path + File.separator + dirObjects[i]);
            }

        }
    }

}

