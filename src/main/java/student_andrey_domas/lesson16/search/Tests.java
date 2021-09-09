package student_andrey_domas.lesson16.search;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tests {

    private String tmpdir;
    private final String TEST_DATA1 = "ubeix8aiTeNae2eija";
    private final String TEST_DATA2 = "ahb8paetae3KeezeeD";
    private final String JUNK_DATA = "ahtha4Iengohpaegae";
    private final Map<String, List<String>> files1 = new HashMap<>();  // extension -> files
    private final Map<String, List<String>> files2 = new HashMap<>();  // extension -> files

    private ParallelSearch ps;

    private void write_test_file1(Path path, String ext) throws IOException {
        String fname = path.resolve(TEST_DATA1 + "." + ext).toString();
        PrintWriter writer = new PrintWriter(fname, StandardCharsets.UTF_8);
        for (int i = 0; i<10000; i++)
            writer.println(JUNK_DATA + "\n");
        writer.println(TEST_DATA1);
        for (int i = 0; i<1000; i++)
            writer.println(JUNK_DATA + "\n");
        writer.close();
        files1.computeIfAbsent(ext, k -> new LinkedList<>()).add(fname);
    }

    private void write_test_file2(Path path, String ext) throws IOException {
        String fname = path.resolve(TEST_DATA2 + "." + ext).toString();
        PrintWriter writer = new PrintWriter(fname, StandardCharsets.UTF_8);
        for (int i = 0; i<1000; i++)
            writer.println(JUNK_DATA + "\n");
        writer.println(TEST_DATA2);
        for (int i = 0; i<10000; i++)
            writer.println(JUNK_DATA + "\n");
        writer.close();
        files2.computeIfAbsent(ext, k -> new LinkedList<>()).add(fname);
    }

    @Before
    public void init() throws IOException {
        ps = new ParallelSearch();

        tmpdir = Files.createTempDirectory("search_tests_").toFile().getAbsolutePath();
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                Path currDirPath = Paths.get(tmpdir, "dir" + i, "dir" + i + "" + j);
                Assert.assertTrue(currDirPath.toFile().mkdirs());

                if (i % 2 == 0) {
                    write_test_file1(currDirPath, "txt");
                }
                if ((j + i) % 2 == 0) {
                    write_test_file2(currDirPath, "txt");
                }
                if (j % 2 == 0) {
                    write_test_file1(currDirPath, "xxx");
                }
            }
        }
    }

    @After
    public void destroy() throws IOException {
        Files.walk(Path.of(tmpdir))
                .sorted(Comparator.reverseOrder())
                .map(Path::toFile)
                .forEach(f -> Assert.assertTrue(f.delete()));
        Files.deleteIfExists(Path.of(tmpdir));
    }

    @Test
    public void testFiles_data1_txt() {
        List<String> extensions = Arrays.asList("txt", "zzz");
        List<String> files = ps.search(tmpdir, TEST_DATA1, extensions);
        Assert.assertArrayEquals(files1.get("txt").stream().sorted().toArray(), files.stream().sorted().toArray());
    }

    @Test
    public void testFiles_data2_txt() {
        List<String> extensions = Arrays.asList("txt", "zzz");
        List<String> files = ps.search(tmpdir, TEST_DATA2, extensions);
        Assert.assertArrayEquals(files2.get("txt").stream().sorted().toArray(), files.stream().sorted().toArray());
    }

    @Test
    public void testFiles_data1_xxx() {
        List<String> extensions = Arrays.asList("xxx", "zzz");
        List<String> files = ps.search(tmpdir, TEST_DATA1, extensions);
        Assert.assertArrayEquals(files1.get("xxx").stream().sorted().toArray(), files.stream().sorted().toArray());
    }

    @Test
    public void testFiles_data1_xxx_and_txt() {
        List<String> extensions = Arrays.asList("xxx", "txt");
        List<String> files = ps.search(tmpdir, TEST_DATA1, extensions);
        Stream<String> expected = files1.values().stream().flatMap(Collection::stream);
        Assert.assertArrayEquals(expected.sorted().toArray(), files.stream().sorted().toArray());
    }

    @Test
    public void testFiles_not_found() {
        List<String> extensions = Arrays.asList("zzz", "zzz");
        List<String> files = ps.search(tmpdir, TEST_DATA1, extensions);
        Assert.assertEquals(0, files.size());
    }

    @Test
    public void testFiles_not_exists_dir() {
        List<String> extensions = Arrays.asList("xxx", "zzz");
        List<String> files = ps.search("/putin_xyjlo", TEST_DATA1, extensions);
        Assert.assertEquals(0, files.size());
    }
}
