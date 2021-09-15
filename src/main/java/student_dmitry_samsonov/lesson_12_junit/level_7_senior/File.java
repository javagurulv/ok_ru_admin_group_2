package student_dmitry_samsonov.lesson_12_junit.level_7_senior;

class File extends Resource {
    public File(String name, int size) {
        this.name = name;
        this.size = size;
        if (name.length() >= 4 && name.endsWith(".mp3")) {
            this.mp3Size = size;
        } else {
            this.mp3Size = 0;
        }
    }
}
