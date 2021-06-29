package student_sergo_kurbanov.lesson_4.level_5;

public class LightColorDetector {
    public String detect(int wavelength) {

        if (isViolet(wavelength)) {
            return "Violet";
        }
        if (isBlue(wavelength)) {
            return "Blue";
        }
        if (isGreen(wavelength)) {
            return "Green";
        }
        if (isYellow(wavelength)) {
            return "Yellow";
        }
        if (isOrange(wavelength)) {
            return "Orange";
        }
        if (isRed(wavelength)) {
            return "Red";
        }
        return "Invisible Light";
    }

    private boolean isRed(int wavelength) {
        return wavelength >= 620 && wavelength <= 750;
    }

    private boolean isOrange(int wavelength) {
        return wavelength >= 590 && wavelength <= 619;
    }

    private boolean isYellow(int wavelength) {
        return wavelength >= 570 && wavelength <= 589;
    }

    private boolean isGreen(int wavelength) {
        return wavelength >= 495 && wavelength <= 569;
    }

    private boolean isBlue(int wavelength) {
        return wavelength >= 450 && wavelength <= 494;
    }

    private boolean isViolet(int wavelength) {
        return wavelength >= 380 && wavelength <= 449;
    }
}
