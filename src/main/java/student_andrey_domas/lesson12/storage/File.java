package student_andrey_domas.lesson12.storage;

public class File extends Resource {

    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
