package student_dmitry_samsonov.lesson_12_junit.level_7_senior;

public class Resource {
    String name;
    int size;
    int mp3Size;

    @Override
    public boolean equals(Object obj) {
        Resource resource = (Resource) obj;
        return this.name.equals(resource.name);
    }
}
