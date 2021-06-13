package student_andrey_tryapichnikov.lesson_3.level_7;

public class PenPaperDemo {
    public static void main(String[] args) {
        var sheet = new Paper("sheet1", "A3");
        sheet.cutInHalf();
        System.out.println();
        var pen = new Pen("blue");
        pen.write(sheet, "Hello world!\n");
        System.out.println();
        pen.refill("green");
        pen.write(sheet, "Hello world again, but now in green!\n");
        System.out.println();
        pen.write(sheet, "Let's test the next message and see if we are out of ink...\n");
        System.out.println();
        pen.write(sheet, "And another one\n");
        pen.refill("yellow");
        pen.checkInkLevel();
        pen.write(sheet, "It did.\nBye!\n");
        System.out.println();
        sheet.read();
    }
}
