package student_dmitry_samsonov.lesson_12_junit.level_7_senior;

import java.util.ArrayList;
import java.util.List;

class Directory extends Resource {
    List<Resource> resources;

    public Directory(String name) {
        this.name = name;
        this.size = 0;
        this.mp3Size = 0;
        this.resources = new ArrayList<Resource>();
    }

    public void addResource(Resource resource) {
        this.resources.add(resource);
        this.size += resource.size;
        this.mp3Size += resource.mp3Size;
    }

    public void delResource(Resource resource) {
        if (this.resources.contains(resource)) {
            this.resources.remove(resource);
            this.size -= resource.size;
            this.mp3Size -= resource.mp3Size;
        }
    }
}
