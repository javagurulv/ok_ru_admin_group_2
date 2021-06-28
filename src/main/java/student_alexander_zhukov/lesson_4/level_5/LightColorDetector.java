package student_alexander_zhukov.lesson_4.level_5;

class LightColorDetector {

    public LightColorDetector() {
    }
    public String detect(int wavelength) {
        boolean isViolet = wavelength >= 380 && wavelength <= 449;
        boolean isBlue = wavelength >= 450 && wavelength <= 494;
        boolean isGreen = wavelength >= 495 && wavelength <= 569;
        boolean isYellow = wavelength >= 570 && wavelength <= 589;
        boolean isOrange = wavelength >= 590 && wavelength <= 619;
        boolean isRed = wavelength >= 620 && wavelength <= 750;

        if (isViolet) {
            return "Violet";
        }
        else if (isBlue) {
            return "Blue";
        }
        else if (isGreen) {
            return "Green";
        }
        else if (isYellow) {
            return "Yellow";
        }
        else if (isOrange) {
            return "Orange";
        }
        else if (isRed) {
            return "Red";
        }
        else {
            return "Invisible Light";
        }

    }

}
