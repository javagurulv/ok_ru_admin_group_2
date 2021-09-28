package student_andrey_domas.lesson19;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class FilesSandbox {

    private static final String RANDOM_NUMBERS_FNAME = "randomNumbersFile";

    /**
     * Напишите программу, которая записывает в файл случайные целые числа
     * (каждое число записывайте в новой строке)
     */
    private static void task1(Path tmpDir) throws IOException {
        var rnd = new Random();
        var randomNumbersFilePath = Paths.get(tmpDir.toString(), RANDOM_NUMBERS_FNAME);
        var outStream = new FileOutputStream(randomNumbersFilePath.toFile());
        for (int i = 0; i < 100; i++) {
            outStream.write((rnd.nextInt() + "\n").getBytes());
        }
        outStream.close();
    }

    /**
     * Напишите программу, которая читает из файла случайные целые числа
     * (каждое число записано в файле в новой строке), складывает их
     * и сумму выводит на экран.
     */
    private static void task2(Path tmpDir) throws IOException {
        var randomNumbersFilePath = Paths.get(tmpDir.toString(), RANDOM_NUMBERS_FNAME);
        int sum =  Files.lines(randomNumbersFilePath).map(Integer::parseInt).reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);
    }

    /**
     * Напишите программу, которая на вход как параметр получает
     * путь к директории. Программа должна проверить все файлы в
     * указанной директории и в любой из под директорий, найти
     * файл самого большого размера и вывести информацию про него
     * на консоль.
     */
    private static void task3(Path tmpDir) throws IOException {
        Optional<File> maxLengthfile = Files.walk(tmpDir)
                .map(Path::toFile).max((f1, f2) -> Objects.compare(f1.length(), f2.length(), Long::compareTo));
        if (maxLengthfile.isPresent()) {
            var file = maxLengthfile.get();
            System.out.println("File: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length());
        }
    }

    public static void main(String[] args) throws IOException {
        Path tmpDir = Files.createTempDirectory("domas_filesSandbox");
        task1(tmpDir);
        task2(tmpDir);
        task3(tmpDir);
        Files.walk(tmpDir)
                .sorted()
                .map(Path::toFile)
                .forEach(File::delete);
        tmpDir.toFile().delete();
    }
}
