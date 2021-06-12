package student_andrey_tryapichnikov.lesson_3.level_7;

public class Paper {
    String name;
    private int size;
    private int emptyPercent;

    public Paper(String name, String sizeSpec) {
        System.out.printf("\033[1mGetting a new sheet of paper - %s\033[0m\n", name);
        // we kinda assume the input will be correct
        // I've yet to learn how to use exceptions properly
        this.name = name;
        this.size = Integer.parseInt(sizeSpec.substring(sizeSpec.length() - 1));
        this.emptyPercent = 100;
    }

    public void cutInHalf() {
        this.size += 1;
        System.out.printf("The sheet \"%s\" has been cut in half, it's new size is A%s\n", this.name, this.size);
    }

    public void write(String text) {
        this.emptyPercent -= text.length() / 2;
        if (this.emptyPercent < 0) {
            System.out.printf("%s is out of space, get some new paper!\n", this.name);
            this.emptyPercent = 0;
        } else {
            System.out.printf("%s%% of %s is still empty.\n", this.emptyPercent, this.name);
        }
    }
}
