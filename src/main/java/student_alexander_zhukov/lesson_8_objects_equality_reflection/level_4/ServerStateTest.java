package student_alexander_zhukov.lesson_8_objects_equality_reflection.level_4;

class ServerStateTest {
    public static void main(String[] args) {
        ServerStateTest test = new ServerStateTest();
        ServerState serverA = new ServerState("A",192,10);
        ServerState serverB = new ServerState("A",192,10);
        ServerState serverC = new ServerState("C",10,20);

        test.TestEqual(serverA, serverB, true);
        test.TestEqual(serverA, serverC, false);

    }
    public void TestEqual(ServerState server1, ServerState server2, boolean answer) {
       checkResults(server1.equals(server2) == answer, "TestEqual");
    }
    public void checkResults(boolean result, String name) {
        if (result) {
            System.out.println("Test " + name + " - OK");
        } else {
            System.out.println("Test " + name + " - FAIL");
        }
    }
}
