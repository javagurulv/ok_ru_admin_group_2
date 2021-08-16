package student_andrey_domas.lesson9.level4.task11;

public class TemperatureViewKImpl implements TemperatureView {
    @Override
    public String convert(int celsius) {
        return "" + (celsius + 273);
    }
}
