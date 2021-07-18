package student_dmitry_samsonov.lesson_4.level_7_senior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        LightColorDetector lightColorDetector = new LightColorDetector();

        lightColorDetectorTest.test(lightColorDetector, 405, "Violet");
        lightColorDetectorTest.test(lightColorDetector, 475, "Blue");
        lightColorDetectorTest.test(lightColorDetector, 505, "Green");
        lightColorDetectorTest.test(lightColorDetector, 585, "Yellow");
        lightColorDetectorTest.test(lightColorDetector, 619, "Orange");
        lightColorDetectorTest.test(lightColorDetector, 620, "Red");
        lightColorDetectorTest.test(lightColorDetector, 760, "Invisible Light");
    }
    public void test(LightColorDetector lightColorDetector, int wavelength, String expectedResult) {
        String result = lightColorDetector.detect(wavelength);
        this.printTestResult(expectedResult, result.equals(expectedResult));
    }
    public void printTestResult(String name, boolean result) {
        String reportName = name + " test = ";
        String reportResult;
        if (result) {
            reportResult = "OK";
        } else {
            reportResult = "FAIL";
        }
        System.out.println(reportName + reportResult);
    }
}