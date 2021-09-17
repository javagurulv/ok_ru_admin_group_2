package student_alexander_fateev.lesson8.level_4.task17;

class ServerStateTest {
    public static void main(String[] args) {
        ServerStateTest test = new ServerStateTest();

        test.testAllEqual();
        test.testCPUDiffers();
        test.testDiskFreeDiffers();
        test.testMemFreeDiffers();
        test.AllDiffers();
    }

    void testAllEqual() {
        boolean expectedResult = true;
        String message = "All fields are equal";

        ServerState srv1 = new ServerState();
        srv1.setCpuLoadPercent(50);
        srv1.setDiskFreeSpace(1000);
        srv1.setMemFreeSpace(500);

        ServerState srv2 = new ServerState();
        srv2.setCpuLoadPercent(50);
        srv2.setDiskFreeSpace(1000);
        srv2.setMemFreeSpace(500);

        boolean result = srv1.equals(srv2);
        printMessage(message, result, expectedResult);
    }

    void testCPUDiffers() {
        boolean expectedResult = false;
        String message = "CPU differs";

        ServerState srv1 = new ServerState();
        srv1.setCpuLoadPercent(70);
        srv1.setDiskFreeSpace(1000);
        srv1.setMemFreeSpace(500);

        ServerState srv2 = new ServerState();
        srv2.setCpuLoadPercent(50);
        srv2.setDiskFreeSpace(1000);
        srv2.setMemFreeSpace(500);

        boolean result = srv1.equals(srv2);
        printMessage(message, result, expectedResult);
    }

    void testDiskFreeDiffers() {
        boolean expectedResult = false;
        String message = "Disk free differs";

        ServerState srv1 = new ServerState();
        srv1.setCpuLoadPercent(50);
        srv1.setDiskFreeSpace(1000);
        srv1.setMemFreeSpace(500);

        ServerState srv2 = new ServerState();
        srv2.setCpuLoadPercent(50);
        srv2.setDiskFreeSpace(1100);
        srv2.setMemFreeSpace(500);

        boolean result = srv1.equals(srv2);
        printMessage(message, result, expectedResult);
    }

    void testMemFreeDiffers() {
        boolean expectedResult = false;
        String message = "Mem free differs";

        ServerState srv1 = new ServerState();
        srv1.setCpuLoadPercent(50);
        srv1.setDiskFreeSpace(1000);
        srv1.setMemFreeSpace(600);

        ServerState srv2 = new ServerState();
        srv2.setCpuLoadPercent(50);
        srv2.setDiskFreeSpace(1000);
        srv2.setMemFreeSpace(500);

        boolean result = srv1.equals(srv2);
        printMessage(message, result, expectedResult);
    }

    void AllDiffers() {
        boolean expectedResult = false;
        String message = "All different";

        ServerState srv1 = new ServerState();
        srv1.setCpuLoadPercent(70);
        srv1.setDiskFreeSpace(1010);
        srv1.setMemFreeSpace(700);

        ServerState srv2 = new ServerState();
        srv2.setCpuLoadPercent(50);
        srv2.setDiskFreeSpace(1000);
        srv2.setMemFreeSpace(500);

        boolean result = srv1.equals(srv2);
        printMessage(message, result, expectedResult);
    }

    void printMessage(String message, boolean result, boolean expectedResult) {
        if (result == expectedResult) {
            System.out.println(message + ": OK");
        }
        else {
            System.out.println(message + ": FAIL");
        }
    }
}
