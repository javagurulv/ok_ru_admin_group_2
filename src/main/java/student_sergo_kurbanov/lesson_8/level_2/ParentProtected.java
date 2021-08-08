package student_sergo_kurbanov.lesson_8.level_2;

public class ParentProtected {
    String Parent;

    protected ParentProtected(String parent) {
        Parent = parent;
    }
}

class Child extends ParentProtected {
    String child;

    public Child(String parent, String child) {
        super(parent);
        this.child = child;
    }
}