package student_alexander_fateev.lesson4.level_5.task16;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest colorTest = new LightColorDetectorTest();

        // Violet low border
        colorTest.anyColorTest(380, "Violet");
        // Violet inside range
        colorTest.anyColorTest(400, "Violet");
        // Violet upper border
        colorTest.anyColorTest(449, "Violet");

        // Blue low border
        colorTest.anyColorTest(450, "Blue");
        // Blue inside range
        colorTest.anyColorTest(470, "Blue");
        // Blue upper border
        colorTest.anyColorTest(494, "Blue");

        // Green low border
        colorTest.anyColorTest(495, "Green");
        // Green inside range
        colorTest.anyColorTest(530, "Green");
        // Green upper border
        colorTest.anyColorTest(569, "Green");

        // Yellow low border
        colorTest.anyColorTest(570, "Yellow");
        // Yellow inside range
        colorTest.anyColorTest(580, "Yellow");
        // Yellow upper border
        colorTest.anyColorTest(589, "Yellow");

        // Orange low border
        colorTest.anyColorTest(590, "Orange");
        // Orange inside range
        colorTest.anyColorTest(600, "Orange");
        // Orange upper border
        colorTest.anyColorTest(619, "Orange");

        // Red low border
        colorTest.anyColorTest(620, "Red");
        // Red inside range
        colorTest.anyColorTest(700, "Red");
        // Red upper border
        colorTest.anyColorTest(750, "Red");

        //Out of bound low
        colorTest.anyColorTest(350, "Invisible Light");
        //Out of bound high
        colorTest.anyColorTest(800, "Invisible Light");
    }

    void anyColorTest(int waveLength, String color) {
        LightColorDetector light = new LightColorDetector();

        if (light.detect(waveLength).equals(color)) {
            System.out.println(color + " " + waveLength + " - OK");
        }
        else {
            System.out.println(color + " " + waveLength + " - FAIL");
        }
    }
}
