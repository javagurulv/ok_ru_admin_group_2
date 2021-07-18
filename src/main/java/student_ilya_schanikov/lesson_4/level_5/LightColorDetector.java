package student_ilya_schanikov.lesson_4.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LightColorDetector {
    public String detect(int wavelength) {
        String lightColor;
        if (wavelength>=380 && wavelength<=449) {
            lightColor = "Violet";
        } else if (wavelength>=450 && wavelength<=494) {
            lightColor = "Blue";
        } else if (wavelength>=495 && wavelength<=569) {
            lightColor = "Green";
        } else if (wavelength>=570 && wavelength<=589) {
            lightColor = "Yellow";
        } else if (wavelength>=590 && wavelength<=619) {
            lightColor = "Orange";
        } else if (wavelength>=620 && wavelength<=750) {
            lightColor = "Red";
        } else {
            lightColor = "Invisible Light";
        }
        return lightColor;
    }
}

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightTest = new LightColorDetectorTest();
        lightTest.VioletTest();
        lightTest.BlueTest();
        lightTest.GreenTest();
        lightTest.YellowTest();
        lightTest.OrangeTest();
        lightTest.RedTest();
        lightTest.Invis1Test();
        lightTest.Invis2Test();
    }

    public void VioletTest() {
        int wavelength = 400;
        String expectedResult = "Violet";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Violet test = PASS");
        } else {
            System.out.println("Violet test = FAIL");
        }
    }

    public void BlueTest() {
        int wavelength = 480;
        String expectedResult = "Blue";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Blue test = PASS");
        } else {
            System.out.println("Blue test = FAIL");
        }
    }

    public void GreenTest() {
        int wavelength = 500;
        String expectedResult = "Green";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Green test = PASS");
        } else {
            System.out.println("Green test = FAIL");
        }
    }

    public void YellowTest() {
        int wavelength = 580;
        String expectedResult = "Yellow";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Yellow test = PASS");
        } else {
            System.out.println("Yellow test = FAIL");
        }
    }

    public void OrangeTest() {
        int wavelength = 600;
        String expectedResult = "Orange";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Orange test = PASS");
        } else {
            System.out.println("Orange test = FAIL");
        }
    }

    public void RedTest() {
        int wavelength = 730;
        String expectedResult = "Red";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Red test = PASS");
        } else {
            System.out.println("Red test = FAIL");
        }
    }

    public void Invis1Test() {
        int wavelength = 10;
        String expectedResult = "Invisible Light";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Invis1 test = PASS");
        } else {
            System.out.println("Invis1 test = FAIL");
        }
    }

    public void Invis2Test() {
        int wavelength = 1000;
        String expectedResult = "Invisible Light";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Invis2 test = PASS");
        } else {
            System.out.println("Invis2 test = FAIL");
        }
    }
}