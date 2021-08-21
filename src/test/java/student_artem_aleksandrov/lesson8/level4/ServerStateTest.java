package student_artem_aleksandrov.lesson8.level4;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServerStateTest extends TestCase {

    @Test
    public void testIsServersStateEqual() {
        float diskFree = 50;
        float cpuUsage = 50;
        float ramUsage = 100;

        ServerState serverState1 = new ServerState(diskFree, cpuUsage, ramUsage);
        ServerState serverState2 = new ServerState(diskFree, cpuUsage, ramUsage);

        assertEquals(serverState1, serverState2);
    }

    @Test
    public void testIsServersStateNotEqual() {
        float diskFree = 50;
        float cpuUsage = 50;
        float ramUsage = 100;

        ServerState serverState1 = new ServerState(diskFree, cpuUsage, ramUsage);
        ServerState serverState2 = new ServerState(diskFree - 1, cpuUsage, ramUsage);

        assertNotEquals(serverState1, serverState2);
    }

}