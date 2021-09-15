package student_dmitry_samsonov.lesson_12_junit.level_7_senior;

class Storage {
    Directory root = new Directory("/");

    public Directory rootDirectory() {
        return this.root;
    }

    int totalSize() {
        return this.root.size;
    }

    int totalMP3() {
        return this.root.mp3Size;
    }
}
