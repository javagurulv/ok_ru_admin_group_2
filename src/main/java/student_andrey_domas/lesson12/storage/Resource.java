package student_andrey_domas.lesson12.storage;

import java.util.HashMap;
import java.util.Map;

public abstract class Resource {
    private String name;


    public Resource(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getSize();

}
