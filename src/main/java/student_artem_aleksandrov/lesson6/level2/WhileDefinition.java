package student_artem_aleksandrov.lesson6.level2;

class WhileDefinition2 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100)
            System.out.println(i);
        i++;
    }
}

class WhileDefinition3 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;

        }
    }
}

class WhileDefinition5 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

}

class NumberUtils {

    public boolean isEven(int number) {
        return number % 2 == 0 ? true : false;
    }

}
