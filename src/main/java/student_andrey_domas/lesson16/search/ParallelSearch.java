package student_andrey_domas.lesson16.search;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.*;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class ParallelSearch {

    public List<String> search(String rootPath,
                               String text,
                               List<String> exts) {

        Path root = Path.of(rootPath);

        BiPredicate<Path, BasicFileAttributes> extMatcher =
                (path, a) -> path.toFile().isFile() && exts.stream().anyMatch(path.toString()::endsWith);

        ExecutorService pool = Executors.newWorkStealingPool();

        try {
            return Files.find(root, Integer.MAX_VALUE, extMatcher)
                    .map(file -> pool.submit(() -> Files.lines(file).anyMatch(line -> line.contains(text)) ? file.toString() : null))
                    .collect(Collectors.toList()).stream()  // start all threads
                    .map(future -> {
                        try {
                            return future.get();
                        } catch (InterruptedException | ExecutionException e) {
                            e.printStackTrace();
                            return null;
                        }
                    }).filter(Objects::nonNull).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
