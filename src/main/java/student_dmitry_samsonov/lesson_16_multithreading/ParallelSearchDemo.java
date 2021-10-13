package student_dmitry_samsonov.lesson_16_multithreading;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParallelSearchDemo {
    public static void main(String[] args) {
        ParallelSearch parallelSearch = new ParallelSearch();
        long start = System.currentTimeMillis();

        System.out.println("Enter path to scan:");
        Scanner scanner = new Scanner(System.in);
        File rootPath = new File(scanner.nextLine());
        if (!rootPath.isDirectory()) {
            System.out.println(rootPath + " is not a directory");
            return;
        }

        System.out.println("Enter text to search:");
        parallelSearch.text = scanner.nextLine();

        List<String> exts = new ArrayList<String>();
        exts.add("txt");
        exts.add("csv");
        exts.add("conf");
        exts.add("c");
        exts.add("h");
        exts.add("cf");
        exts.add("html");
        exts.add("py");
        exts.add("log");
        exts.add("sh");
        exts.add("tmpl");
        exts.add("jks");
        exts.add("crt");
        exts.add("pem");
        exts.add("key");
        exts.add("service");
        exts.add("rst");
        exts.add("yaml");
        exts.add("yml");
        exts.add("xml");
        exts.add("java");
        exts.add("go");

        List<File> files = scanForFiles(rootPath, exts);
        int file_count = files.size();
        if (files.size() == 0) {
            System.out.println("No files were found in " + rootPath);
        }

        long middle = System.currentTimeMillis();

        parallelSearch.filesToCheck = files;

        int thread_count = 100;
        Thread[] threads = new Thread[thread_count];
        for (Integer i=0; i<thread_count; i++) {
            threads[i] = new Thread(parallelSearch, i.toString());
            threads[i].start();
        }

        try {
            for (Thread thread: threads) {
                thread.join();
            }
        } catch (InterruptedException ignored) {
        }

        if (parallelSearch.matchedFiles.size() > 0) {
            System.out.println("Text '" + parallelSearch.text + "' found in files: ");
            for (File file : parallelSearch.matchedFiles) {
                System.out.println(file);
            }
        } else {
            System.out.println("Text '" + parallelSearch.text + "' was not found in files in " + rootPath);
        }
        System.out.println("Time elapsed for building file list: " + (middle - start));
        System.out.println("Time elapsed for searching for text: " + (System.currentTimeMillis() - middle));
        System.out.println("Scanned file count: " + file_count);
    }

    static List<File> scanForFiles(File path_to_scan, List<String> exts) {
        System.out.println("Scanning dir: " + path_to_scan.toString());
        List<File> files = new ArrayList<File>();
        String[] paths = path_to_scan.list();
        if (paths == null) {
            return files;
        }
        for (String path : paths) {
            File file = new File(path_to_scan + "/" + path);
            if (file.isFile()) {
                Pattern pattern = Pattern.compile(".*\\.(.*)");
                Matcher matcher = pattern.matcher(file.toString());
                String fileExtension;
                if (matcher.matches()) {
                    fileExtension = matcher.group(1);
                } else {
                    System.out.println("File without extension " + file);
                    continue;
                }
                if (!exts.contains(fileExtension)) {
                    System.out.println("File extension unsupported " + file);
                    continue;
                }
                System.out.println("Adding file to queue: " + file);
                files.add(file);
            } else if (file.isDirectory()) {
                System.out.println("Found dir: " + file);
                List<File> files_from_subdir = scanForFiles(file, exts);
                files.addAll(files_from_subdir);
            } else {
                System.out.println("Neither file or dir: " + file.exists());
            }
        }
        return files;
    }
}
