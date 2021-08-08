package student_andrey_domas.lesson8.level4;

import org.junit.Test;

public class ServerStateTest {

    @Test
    public void equalsTest() {
        ServerState ss1 = new ServerState("a", 1);
        ss1.setCpuPercent(10);
        ss1.setHddFreePercent(20);
        ss1.setLoadAverage(30);
        ServerState ss2 = new ServerState("a", 1);
        ss2.setCpuPercent(40);
        ss2.setHddFreePercent(50);
        ss2.setLoadAverage(60);
        assert ss1.equals(ss2);
        assert ss1.hashCode() == ss2.hashCode();
    }

    @Test
    public void notEqualsTest() {
        ServerState ss1 = new ServerState("a", 1);
        ss1.setCpuPercent(0);
        ss1.setHddFreePercent(0);
        ss1.setLoadAverage(0);
        ServerState ss2 = new ServerState("a", 2);
        ss2.setCpuPercent(0);
        ss2.setHddFreePercent(0);
        ss2.setLoadAverage(0);
        assert !ss1.equals(ss2);
        assert ss1.hashCode() != ss2.hashCode();
    }
}
