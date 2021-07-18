package student_sergo_kurbanov.lesson_4.level_7;

import student_sergo_kurbanov.lesson_4.level_5.LightColorDetector;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LightColorDetectorTest {
    public static void main(String[] args) {

        testAnyColor(LightColorDetector.Colors.VIOLET);
        testAnyColor(LightColorDetector.Colors.BLUE);
        testAnyColor(LightColorDetector.Colors.GREEN);
        testAnyColor(LightColorDetector.Colors.YELLOW);
        testAnyColor(LightColorDetector.Colors.ORANGE);
        testAnyColor(LightColorDetector.Colors.RED);
        testAnyColor(LightColorDetector.Colors.INVISIBLE);
    }

    public static void testAnyColor(LightColorDetector.Colors color) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();
        switch (color) {
            case VIOLET:
                lightColorDetector.testColor(405, LightColorDetector.Colors.VIOLET);
                break;
            case BLUE:
                lightColorDetector.testColor(475, LightColorDetector.Colors.BLUE);
                break;
            case GREEN:
                lightColorDetector.testColor(505, LightColorDetector.Colors.GREEN);
                break;
            case YELLOW:
                lightColorDetector.testColor(585, LightColorDetector.Colors.YELLOW);
                break;
            case ORANGE:
                lightColorDetector.testColor(619, LightColorDetector.Colors.ORANGE);
                break;
            case RED:
                lightColorDetector.testColor(620, LightColorDetector.Colors.RED);
                break;
            case INVISIBLE:
                lightColorDetector.testColor(760, LightColorDetector.Colors.INVISIBLE);
                break;
            default:
                System.out.println(color + " NOT IMPLEMENTED YET");
        }
    }

    public void testColor(int wavelength, LightColorDetector.Colors expectingColor) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        LightColorDetector.Colors result = lightColorDetector.detect(wavelength);

        System.out.printf("\nLightColorDetector test: %s = %s", expectingColor.name(), result == expectingColor ? "OK" : "FAIL");
    }
}
