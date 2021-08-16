package student_andrey_domas.lesson9.level4.task11;

public class TemperatureViewFImpl implements  TemperatureView {
    @Override
    public String convert(int celsius) {
        return "" + (celsius * 9 / 5 + 32);
    }
}
