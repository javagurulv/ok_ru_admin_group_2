package student_andrey_tryapichnikov.lesson_3.level_7;

public class Pen {
    private String inkColorName;
    private int inkColorValue;
    private int inkLevelPercent;

    public Pen(String color) {
        this.inkLevelPercent = 100;
        setColor(color);
    }

    void setColor(String color) {
        int val;
        switch(color) {
            case "red" -> val = 31;
            case "green" -> val = 32;
            case "yellow" -> val = 33;
            case "blue" -> val = 34;
            case "pink" -> val = 35;
            case "cyan" -> val = 36;
            default -> val = 39;
        }
        this.inkColorValue = val;
        if (val == 39) {
            System.out.printf("%s is incompatible with this pen, we'll use default instead :(\n\n", color);
            this.inkColorName = "default";
        } else {
            this.inkColorName = color;
        }
    }

    public void write(Paper paper, String text) {
        if (inkLevelPercent - text.length() < 0) {
            System.err.println("Not enough ink!");
            return;
        }
        inkLevelPercent -= text.length();
        System.out.printf("\n\033[%sm%s\033[39m\n\n", this.inkColorValue, text);
        paper.write(text);
        checkInkLevel();
    }

    public void refill(String newInkColor) {
        String prevMsg = String.format("Replacing %s%% of %s ink...", this.inkLevelPercent, this.inkColorName);
        this.inkLevelPercent = 100;
        setColor(newInkColor);
        String nextMsg = String.format(" with %s%% of %s ink.", this.inkLevelPercent, this.inkColorName);
        System.out.printf("\033[1m%s\033[0m\n", prevMsg + nextMsg);
    }

    public void checkInkLevel() {
        System.out.printf("%s%% of %s ink left.\n", this.inkLevelPercent, this.inkColorName);
    }
}
