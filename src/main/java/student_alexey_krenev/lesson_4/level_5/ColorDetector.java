package student_alexey_krenev.lesson_4.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ColorDetector {

    public String detector(int wavelength){

        if (380 <= wavelength && wavelength <= 449)
            return "Violet";
        else if (450 <= wavelength && wavelength <= 494)
            return "Blue";
        else if (495 <= wavelength && wavelength <= 569)
            return "Green";
        else if (570 <= wavelength && wavelength <= 589)
            return "Yellow";
        else if (590 <= wavelength && wavelength <= 619)
            return "Orange";
        else if (620 <= wavelength && wavelength <= 750)
            return "Red";
        else
            return "Invisible Light";

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