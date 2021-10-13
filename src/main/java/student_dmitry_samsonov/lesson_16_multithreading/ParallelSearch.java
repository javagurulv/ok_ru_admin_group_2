package student_dmitry_samsonov.lesson_16_multithreading;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class ParallelSearch implements Runnable {
    List<File> filesToCheck = new LinkedList<>();
    List<File> matchedFiles = Collections.synchronizedList(new ArrayList<File>());
    String text;

    @Override
    public void run() {
        File file;
        while (filesToCheck.size() > 0) {
            synchronized (filesToCheck) {
                if (filesToCheck.size() > 0) {
                    file = filesToCheck.get(0);
                    filesToCheck.remove(0);
                } else {
                    return;
                }
            }

            // Files are read too fast to see positive effect of multithreading, so help it by slowing thread down
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " Checking file " + file);

            try {
                String file_text = new String(Files.readAllBytes(file.toPath()), StandardCharsets.UTF_8);
                if (file_text.contains(text)) {
                    matchedFiles.add(file);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}