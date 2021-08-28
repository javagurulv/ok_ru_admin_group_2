package student_andrey_domas.lesson12.storage;

import java.util.List;

class Storage {

    private Directory root = new Directory("/");

    public Directory rootDirectory() {
        return root;
    }

    public Directory mkdir_p(String path) {
        Directory currentDir = rootDirectory();
        for (String dirName: path.split("/")) {
            currentDir = currentDir.mkdir(dirName);
        }
        return currentDir;
    }

    public int totalSize() {
        return root.getSize();
    }

    public int totalMP3(String pattern) {
        return rootDirectory().countFilesByPattern(pattern);
    }
}