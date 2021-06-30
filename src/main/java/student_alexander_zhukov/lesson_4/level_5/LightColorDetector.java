package student_alexander_zhukov.lesson_4.level_5;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class LightColorDetector {

	@CodeReviewComment(teacher = "Дефолтный конструктор у класса можно не писать явно если он единственный конструктор в классе. Java при компиляции его добавит автоматически.")
    public LightColorDetector() {
    }
    public String detect(int wavelength) {
        if (isViolet(wavelength)) {
            return "Violet";
        } else if (isBlue(wavelength)) {
            return "Blue";
        } else if (isGreen(wavelength)) {
            return "Green";
        } else if (isYellow(wavelength)) {
            return "Yellow";
        } else if (isOrange(wavelength)) {
            return "Orange";
        } else if (isRed(wavelength)) {
            return "Red";
        } else {
            return "Invisible Light";
        }

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
