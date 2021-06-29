package student_alexander_zhukov.lesson_4.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.testViolet(415);
        lightColorDetector.testBlue(494);
        lightColorDetector.testGreen(495);
        lightColorDetector.testYellow(576);
        lightColorDetector.testOrange(618);
        lightColorDetector.testRed(677);
        lightColorDetector.testInvisible(760);
    }

    public void testViolet(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        if(result.equals("Violet")) {
            System.out.println("LightColorDetector test - Violet = OK");
        } else {
            System.out.println("LightColorDetector test - Violet = FAIL");
        }
    }

    public void testBlue(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        testResult(result.equals("Blue"),"Blue");
    }

    public void testGreen(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        testResult(result.equals("Green"),"Green");
    }

    public void testYellow(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        testResult(result.equals("Yellow"),"Yellow");
    }

    public void testOrange(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        testResult(result.equals("Orange"),"Orange");
    }

    public void testRed(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        testResult(result.equals("Red"),"Red");
    }

    public void testInvisible(int wavelength) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String result = lightColorDetector.detect(wavelength);
        testResult(result.equals("Invisible Light"),"Invisible Light");
    }

    public void testResult(boolean result, String testName) {
        if (result) {
            System.out.println("LightColorDetector test - " + testName + " = OK");
        } else {
            System.out.println("LightColorDetector test - " + testName + " = FAIL");
        }
    }
}
