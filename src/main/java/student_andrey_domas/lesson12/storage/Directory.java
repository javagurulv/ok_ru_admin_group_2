package student_andrey_domas.lesson12.storage;

import java.util.HashMap;
import java.util.Map;

public class Directory extends Resource {
    private final Map<String, Resource> resources;

    public Directory(String name) {
        super(name);
        resources = new HashMap<>();
    }

    @Override
    public int getSize() {
        return resources.values().stream().map(Resource::getSize).mapToInt(Integer::intValue).sum();
    }

    public Directory mkdir(String name) {
        return (Directory) resources.computeIfAbsent(name, Directory::new);
    }

    public void add(File file) {
        resources.put(file.getName(), file);
    }

    public void delete(String filename) {
        resources.remove(filename);
    }

    public int countFilesByPattern(String pattern) {
        int count = 0;
        for (Resource resource: resources.values()) {
            if (resource instanceof Directory dir) {
                count += dir.countFilesByPattern(pattern);
            } else if (resource.getName().matches(pattern)) {
                count++;
            }
        }
        return count;
    }

}
