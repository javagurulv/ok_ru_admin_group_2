package student_dmitry_samsonov.lesson_12_junit.level_7_senior;

import org.junit.Assert;
import org.junit.Test;

public class StorageTest {
    Storage storage = new Storage();

    @Test
    public void rootDirectory() {
        Assert.assertEquals(new Directory("/"), this.storage.rootDirectory());
    }

    @Test
    public void addResource() {
        File file = new File("file", 1);
        this.storage.root.addResource(file);
        Assert.assertTrue(this.storage.root.resources.contains(file));
    }

    @Test
    public void delResource() {
        File file = new File("file", 1);
        this.storage.root.delResource(file);
        Assert.assertFalse(this.storage.root.resources.contains(file));
    }

    @Test
    public void addDir() {
        Directory directory = new Directory("directory");
        this.storage.root.addResource(directory);
        Assert.assertTrue(this.storage.root.resources.contains(directory));
    }

    @Test
    public void totalSize() {
        File file = new File("file2", 1);
        int initial_size = this.storage.totalSize();
        this.storage.root.addResource(file);
        Assert.assertEquals(initial_size + 1, this.storage.totalSize());
    }

    @Test
    public void totalMP3() {
        File file = new File("file.mp3", 1);
        int initial_size = this.storage.totalMP3();
        this.storage.root.addResource(file);
        Assert.assertEquals(initial_size + 1, this.storage.totalMP3());
    }
}