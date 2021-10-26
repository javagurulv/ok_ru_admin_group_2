package student_alexander_zhukov.lesson_17;

import org.apache.log4j.Logger;

import java.util.Scanner;

class LoggerDemo {

    private static Logger logger = Logger.getLogger(LoggerDemo.class);

    boolean done = true;

    public static void main(String[] args) {

        LoggerDemo demo = new LoggerDemo();
        demo.startMenu();

    }

    private void startMenu() {
        while (this.done) {
            printProgramMenu();
            int menuNumber = getMenuNumberFromUser();
            executeSelectedMenuItem(menuNumber);
        }
    }

    private static void printProgramMenu() {
        System.out.println();
        System.out.println("Program menu:");
        System.out.println("1. Demo logger INFO");
        System.out.println("2. Demo logger WARN");
        System.out.println("3. Demo logger ERROR");
        System.out.println("4. Demo logger FATAL");
        System.out.println("5. Demo logger DEBUG");
        System.out.println("6. Demo logger TRACE");
        System.out.println("7. Exit");
        System.out.println();
    }

    private static int getMenuNumberFromUser() {
        System.out.println("Enter menu item number to execute:");
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    private void executeSelectedMenuItem(int selectedMenu) {
        switch (selectedMenu) {
            case 1: {
                logger.info(String.format("Demo string with logger INFO"));
                break;
            }
            case 2: {
                logger.warn(String.format("Demo string with logger WARN"));
                break;
            }
            case 3: {
                logger.error(String.format("Demo string with logger ERROR"));
                break;
            }
            case 4: {
                logger.fatal(String.format("Demo string with logger FATAL"));
                break;
            }
            case 5: {
                logger.debug(String.format("Demo string with logger DEBUG"));
                break;
            }
            case 6: {
                logger.trace(String.format("Demo string with logger TRACE"));
                break;
            }
            case 7: {
                System.out.println("Exit");
                this.done = false;
                return;
            } default: {
                logger.fatal(String.format("Not existing (%s) menu item was entered", selectedMenu));
            }
        }
    }
}