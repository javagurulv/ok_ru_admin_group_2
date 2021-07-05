package student_sergo_kurbanov.lesson_4.level_5;

public class LightColorDetector {
    public Colors detect(int wavelength) {

        if (isViolet(wavelength)) {
            return Colors.VIOLET;
        }
        if (isBlue(wavelength)) {
            return Colors.BLUE;
        }
        if (isGreen(wavelength)) {
            return Colors.GREEN;
        }
        if (isYellow(wavelength)) {
            return Colors.YELLOW;
        }
        if (isOrange(wavelength)) {
            return Colors.ORANGE;
        }
        if (isRed(wavelength)) {
            return Colors.RED;
        }
        return Colors.INVISIBLE;
    }

    public enum Colors {
        VIOLET,
        BLUE,
        GREEN,
        YELLOW,
        ORANGE,
        RED,
        INVISIBLE,
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
