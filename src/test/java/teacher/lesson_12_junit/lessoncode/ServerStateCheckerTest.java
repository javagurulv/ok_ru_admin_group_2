package teacher.lesson_12_junit.lessoncode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ServerStateCheckerTest {

	private static int abc;

	private ServerState serverState;
	private ServerStateChecker checker;

	@Before
	public void setUp() {
		serverState = new ServerState();
		checker = new ServerStateChecker();
	}

	@After
	public void clear() {

	}

	@BeforeClass
	public static void initClassY() {
		abc = 100;
	}

	@AfterClass
	public static void clearClass() {

	}

	@Test
	public void test1() {
		checker.check(serverState);
	}

	@Test
	public void test2() {

	}

}