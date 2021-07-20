package student_ilya_schanikov.lesson_4.level_7;

class LightColorDetector {

    public String detect(int wavelength) {

        if (wavelength >= 380 && wavelength <= 449) {
            return "Violet";
        } else if (wavelength >= 450 && wavelength <= 494) {
            return "Blue";
        } else if (wavelength >= 495 && wavelength <= 569) {
            return "Green";
        } else if (wavelength >= 570 && wavelength <= 589) {
            return "Yellow";
        } else if (wavelength >= 590 && wavelength <= 619) {
            return "Orange";
        } else if (wavelength >= 620 && wavelength <= 750) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }
}


class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        lightColorDetector.Test("Violet", 405);
        lightColorDetector.Test("Blue", 475);
        lightColorDetector.Test("Green", 505);
        lightColorDetector.Test("Yellow", 585);
        lightColorDetector.Test("Orange", 619);
        lightColorDetector.Test("Red", 620);
        lightColorDetector.Test("Invisible", 760);
    }
    public void Test(String TestName, int lightLen) {
        LightColorDetector lightcolor = new LightColorDetector();
        String outcome;
        switch (TestName) {
            case "Invisible": {
                outcome = lightcolor.detect(lightLen);
                if (outcome.equals("Invisible Light")) {
                    outcome = "Invisible";
                } else {
                    break;
                }
                break;
            }
            default: {
                outcome = lightcolor.detect(lightLen);
                break;
            }
        }
        printTestResult(TestName, outcome.equals(TestName));
    }

    public void printTestResult(String testN, boolean testResult) {
        if (testResult) {
            String convertedResult = "OK";
            System.out.println("Test " + testN + " result is: " + convertedResult);
        } else {
            String convertedResult = "FAIL";
            System.out.println("Test " + testN + " result is: " + convertedResult);
        }
    }
}
