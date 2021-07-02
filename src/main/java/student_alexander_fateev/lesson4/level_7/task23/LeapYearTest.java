package student_alexander_fateev.lesson4.level_7.task23;

class LeapYearTest {
    public static void main(String[] args) {

        // Test case 1: Если год не делится на 4, значит он обычный.
        LeapYear year1981 = new LeapYear();
        if (!year1981.isLeapYear(1981)) {
            System.out.println("1981 is not leap year: OK");
        }
        else {
            System.out.println("1981 is not leap year: FAIL");
        }

        // Test case 2: Иначе надо проверить не делится ли год на 100.
        // Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
        LeapYear year2008 = new LeapYear();
        if (year2008.isLeapYear(2008)) {
            System.out.println("2008 is leap year: OK");
        }
        else {
            System.out.println("2008 is leap year: FAIL");
        }

        // Test case 3: Если делится на 100, значит это столетие и его следует проверить его делимость на 400.
        // Если год делится на 400, то он високосный.
        LeapYear year2000 = new LeapYear();
        if (year2000.isLeapYear(2000)) {
            System.out.println("2000 is leap year: OK");
        }
        else {
            System.out.println("2000 is leap year: FAIL");
        }

        // Test case 4: // Иначе год обычный.
        LeapYear year1000 = new LeapYear();
        if (!year1000.isLeapYear(1000)) {
            System.out.println("1000 is not leap year: OK");
        }
        else {
            System.out.println("1000 is not leap year: FAIL");
        }
    }
}
