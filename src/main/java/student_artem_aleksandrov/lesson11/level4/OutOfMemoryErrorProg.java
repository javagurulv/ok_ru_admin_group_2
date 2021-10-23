package student_artem_aleksandrov.lesson11.level4;

import java.util.ArrayList;

public class OutOfMemoryErrorProg {
    public static void main(String[] args) {
        ArrayList objects = new ArrayList<>();
        try {
            while (true) {
                String[] string = new String[999999];
                objects.add(string);
            }
        } catch (OutOfMemoryError err) {
            System.out.println("Reached OutOfMemoryError");
            throw err;
        }

    }
}
