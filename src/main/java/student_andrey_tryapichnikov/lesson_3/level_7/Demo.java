package student_andrey_tryapichnikov.lesson_3.level_7;

public class Demo {
    public static void main(String[] args) {
        var sheet = new Paper("sheet1", "A3");
        sheet.cutInHalf();
        var pen = new Pen("blue");
        pen.write(sheet, "Hello world!");

        pen.refill("green");
        var newSheet = new Paper("sheet2", "A4");
        pen.write(newSheet, "Hello world again, but now in green!");
        pen.write(newSheet, "Let's test the next message and see if we are out of ink...");
        pen.write(newSheet, "And another one");
        pen.refill("yellow");
        pen.checkInkLevel();
    }
}
