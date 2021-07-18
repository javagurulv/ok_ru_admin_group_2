package student_alexander_fateev.lesson4.level_7.task25;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetector testDetector = new LightColorDetector();
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.testViolet(405, testDetector);
        lightColorDetector.testBlue(475, testDetector);
        lightColorDetector.testGreen(505, testDetector);
        lightColorDetector.testYellow(585, testDetector);
        lightColorDetector.testOrange(619, testDetector);
        lightColorDetector.testRed(620, testDetector);
        lightColorDetector.testInvisible(760, testDetector);
    }

    public void checkResult(String result, String expectedResult) {
        if(result.equals(expectedResult)) {
            System.out.println("LightColorDetector test - " + expectedResult + " = OK");
        } else {
            System.out.println("LightColorDetector test - " + expectedResult + " = FAIL");
        }
    }

    public void testViolet(int wavelength, LightColorDetector testDetector) {
        String result = testDetector.detect(wavelength);
        checkResult(result, "Violet");
    }

    public void testBlue(int wavelength, LightColorDetector testDetector) {
        String result = testDetector.detect(wavelength);
        checkResult(result, "Blue");
    }

    public void testGreen(int wavelength, LightColorDetector testDetector) {
        String result = testDetector.detect(wavelength);
        checkResult(result, "Green");
    }

    public void testYellow(int wavelength, LightColorDetector testDetector) {
        String result = testDetector.detect(wavelength);
        checkResult(result, "Yellow");
    }

    public void testOrange(int wavelength, LightColorDetector testDetector) {
        String result = testDetector.detect(wavelength);
        checkResult(result, "Orange");
    }

    public void testRed(int wavelength, LightColorDetector testDetector) {
        String result = testDetector.detect(wavelength);
        checkResult(result, "Red");
    }

    public void testInvisible(int wavelength, LightColorDetector testDetector) {
        String result = testDetector.detect(wavelength);
        checkResult(result, "Invisible Light");
    }
}
