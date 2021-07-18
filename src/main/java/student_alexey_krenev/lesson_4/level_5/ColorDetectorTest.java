package student_alexey_krenev.lesson_4.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ColorDetectorTest {

    public static void main(String[] args) {

        ColorDetectorTest colorDetectorTest = new ColorDetectorTest();

        colorDetectorTest.isViolet();
        colorDetectorTest.isBlue();
        colorDetectorTest.isGreen();
        colorDetectorTest.isYellow();
        colorDetectorTest.isOrange();
        colorDetectorTest.isRed();
        colorDetectorTest.isInvisible();

    }

    private void isViolet() {
        int wavelength = 380;
        ColorDetector colorDetector = new ColorDetector();
        String res = colorDetector.detector(wavelength);
        if(res.equals("Violet")){
            System.out.println("Violet test OK");
        }
        else {
            System.out.println("Violet test FAIL");
        }
    }

    private void isBlue() {
        int wavelength = 450;
        ColorDetector colorDetector = new ColorDetector();
        String res = colorDetector.detector(wavelength);
        if(res.equals("Blue")){
            System.out.println("Blue test OK");
        }
        else {
            System.out.println("Blue test FAIL");
        }
    }

    private void isGreen() {
        int wavelength = 495;
        ColorDetector colorDetector = new ColorDetector();
        String res = colorDetector.detector(wavelength);
        if(res.equals("Green")){
            System.out.println("Green test OK");
        }
        else {
            System.out.println("Green test FAIL");
        }
    }

    private void isYellow() {
        int wavelength = 570;
        ColorDetector colorDetector = new ColorDetector();
        String res = colorDetector.detector(wavelength);
        if(res.equals("Yellow")){
            System.out.println("Yellow test OK");
        }
        else {
            System.out.println("Yellow test FAIL");
        }
    }

    private void isOrange() {
        int wavelength = 590;
        ColorDetector colorDetector = new ColorDetector();
        String res = colorDetector.detector(wavelength);
        if(res.equals("Orange")){
            System.out.println("Orange test OK");
        }
        else {
            System.out.println("Orange test FAIL");
        }
    }

    private void isRed() {
        int wavelength = 620;
        ColorDetector colorDetector = new ColorDetector();
        String res = colorDetector.detector(wavelength);
        if(res.equals("Red")){
            System.out.println("Red test OK");
        }
        else {
            System.out.println("Red test FAIL");
        }
    }

    private void isInvisible() {
        int wavelength = 100;
        ColorDetector colorDetector = new ColorDetector();
        String res = colorDetector.detector(wavelength);
        if(res.equals("Invisible Light")){
            System.out.println("Invisible test OK");
        }
        else {
            System.out.println("Invisible test FAIL");
        }
    }
}

/*


380 ... 449 - Фиолетовый ("Violet")
450 ... 494 - Синий ("Blue")
495 ... 569 - Зеленый ("Green")
570 ... 589 - Желтый ("Yellow")
590 ... 619 - Оранжевый ("Orange")
620 ... 750 - Красный ("Red")
Вне диапазонов - невидимый спектр ("Invisible Light")


 */