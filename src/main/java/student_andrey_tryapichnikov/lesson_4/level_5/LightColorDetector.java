package student_andrey_tryapichnikov.lesson_4.level_5;

public class LightColorDetector {
    int waveLength;
    String color;

    public LightColorDetector(int waveLength) {
        this.waveLength = waveLength;
        detectColor();
    }

    void detectColor() {
        if (wavelengthIsBetween(380, 449)) this.color = "Violet";
        else if (wavelengthIsBetween(450, 494)) this.color = "Blue";
        else if (wavelengthIsBetween(495, 569)) this.color = "Green";
        else if (wavelengthIsBetween(570, 589)) this.color = "Yellow";
        else if (wavelengthIsBetween(590, 619)) this.color = "Orange";
        else if (wavelengthIsBetween(620, 750)) this.color = "Red";
        else this.color = "Invisible Light";
    }

    boolean wavelengthIsBetween(int lower, int upper) {
        return this.waveLength >= lower && this.waveLength <= upper;
    }

    public String detect() {
        return this.color;
    }
}
