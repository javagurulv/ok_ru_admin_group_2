package student_dmitry_samsonov.lesson_4.level_5_middle;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LightColorDetector {
    public String detect(int wavelength) {
        String color = "Invisible Light";
        if (wavelength>=380 && wavelength<=449) {
            color = "Violet";
        } else if (wavelength>=450 && wavelength<=494) {
            color = "Blue";
        } else if (wavelength>=495 && wavelength<=569) {
            color = "Green";
        } else if (wavelength>=570 && wavelength<=589) {
            color = "Yellow";
        } else if (wavelength>=590 && wavelength<=619) {
            color = "Orange";
        } else if (wavelength>=620 && wavelength<=750) {
            color = "Red";
        }
        return color;
    }
}
