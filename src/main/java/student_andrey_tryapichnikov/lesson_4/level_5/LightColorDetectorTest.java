package student_andrey_tryapichnikov.lesson_4.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class LightColorDetectorTest {
    public static void main(String[] args) {
        /*
        380 ... 449 - Фиолетовый ("Violet")
        450 ... 494 - Синий ("Blue")
        495 ... 569 - Зеленый ("Green")
        570 ... 589 - Желтый ("Yellow")
        590 ... 619 - Оранжевый ("Orange")
        620 ... 750 - Красный ("Red")
        В.не диапазонов - невидимый спектр ("Invisible Light")
        */
        testColor(300, "Invisible Light");
        testColor(400, "Violet");
        testColor(470, "Blue");
        testColor(500, "Green");
        testColor(580, "Yellow");
        testColor(600, "Orange");
        testColor(700, "Red");
        testColor(900, "Invisible Light");
    }

    static void testColor(int waveLength, String expectedColor) {
        var detector = new LightColorDetector(waveLength);
        var colorMatches = expectedColor.equals(detector.color) ? "OK" : "FAIL";
        System.out.printf("%s test: %s\n", waveLength, colorMatches);
    }
}
