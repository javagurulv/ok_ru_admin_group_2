package student_dmitry_samsonov.lesson_4.level_5_middle;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest detector = new LightColorDetectorTest();
        detector.invisibleLightTest();
        detector.violetTest();
        detector.blueTest();
        detector.greenTest();
        detector.yellowTest();
        detector.orangeTest();
        detector.redTest();
    }
    public void invisibleLightTest() {
        int wavelength = 10;
        String expectedResult = "Invisible Light";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Invisible Light test = OK");
        } else {
            System.out.println("Invisible Light test = FAIL");
        }
    }
    public void violetTest() {
        int wavelength = 390;
        String expectedResult = "Violet";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Violet test = OK");
        } else {
            System.out.println("Violet test = FAIL");
        }
    }
    public void blueTest() {
        int wavelength = 490;
        String expectedResult = "Blue";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Blue test = OK");
        } else {
            System.out.println("Blue test = FAIL");
        }
    }
    public void greenTest() {
        int wavelength = 569;
        String expectedResult = "Green";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Green test = OK");
        } else {
            System.out.println("Green test = FAIL");
        }
    }
    public void yellowTest() {
        int wavelength = 580;
        String expectedResult = "Yellow";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Yellow test = OK");
        } else {
            System.out.println("Yellow test = FAIL");
        }
    }
    public void orangeTest() {
        int wavelength = 590;
        String expectedResult = "Orange";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Orange test = OK");
        } else {
            System.out.println("Orange test = FAIL");
        }
    }
    public void redTest() {
        int wavelength = 690;
        String expectedResult = "Red";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Red test = OK");
        } else {
            System.out.println("Red test = FAIL");
        }
    }
}
