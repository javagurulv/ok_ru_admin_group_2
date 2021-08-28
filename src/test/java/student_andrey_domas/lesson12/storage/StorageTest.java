package student_andrey_domas.lesson12.storage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StorageTest {

    private Storage storage;
    private Directory dir1;
    private Directory dir2;
    private Directory dir3;
    private Directory dir4;

    @Before
    public void setup() {
        storage = new Storage();
        dir1 = storage.mkdir_p("/dir1/dir2/");
        dir2 = storage.mkdir_p("/dir1/dir2/dir3");
        dir3 = storage.mkdir_p("/dir1/dir2/dir3/dir4");
        dir4 = storage.mkdir_p("/dir1_2/dir2_2");
    }

    @Test
    public void testSizeZero() {
        Assert.assertEquals(0, storage.totalSize());
    }

    @Test
    public void testSizeNonZero() {
        dir1.add(new File("file1", 1));
        dir1.add(new File("file2", 2));
        dir2.add(new File("file1", 3));
        dir3.add(new File("file1", 4));
        Assert.assertEquals(10, storage.totalSize());
    }

    @Test
    public void testSizeNonZeroDuplicatedFile() {
        dir1.add(new File("file1", 1));
        dir1.add(new File("file1", 2));
        dir2.add(new File("file1", 3));
        dir3.add(new File("file1", 4));
        Assert.assertEquals(9, storage.totalSize());
    }

    @Test
    public void testMp3Total() {
        dir1.add(new File("file1.mp3", 1));
        dir1.add(new File("file2", 2));
        dir2.add(new File("file3.mp3", 3));
        dir3.add(new File("file4", 4));
        Assert.assertEquals(2, storage.totalMP3(".*\\.mp3"));
    }

    @Test
    public void testMp3TotalZore() {
        dir1.add(new File("file1", 1));
        dir1.add(new File("file2", 2));
        dir2.add(new File("file3", 3));
        dir3.add(new File("file4", 4));
        Assert.assertEquals(0, storage.totalMP3(".*\\.mp3"));
    }
}