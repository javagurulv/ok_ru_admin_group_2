package student_andrey_domas.lesson9.level4.task11;

public class TemperatureController implements TemperatureView {

    // this program just converts 100C
    public static void main(String[] args) {

        int currentTemperature = 100; // Celsius

        String userTemperaturePreference = "...";

        TemperatureView userTemperatureView;

        switch (userTemperaturePreference) {
            case "K":
                userTemperatureView = new TemperatureViewKImpl();
                break;
            case "F":
                userTemperatureView = new TemperatureViewFImpl();
                break;
            default:
                userTemperatureView = new TemperatureController();
                break;
        }

        System.out.println(userTemperatureView.convert(currentTemperature));
    }

    @Override
    public String convert(int celsius) {
        return "" + celsius;
    }
}
