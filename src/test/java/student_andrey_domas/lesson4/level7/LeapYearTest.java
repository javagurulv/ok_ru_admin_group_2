package student_andrey_domas.lesson4.level7;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class LeapYearTest {

    LeapYear ly;
    final int[] leapYears = {2028, 2024, 2020, 2016, 2012, 2008, 2004, 2000, 1996, 1992, 1988, 1984, 1980, 1976, 1972,
            1968, 1964, 1960, 1956, 1952, 1948, 1944, 1940, 1936, 1932, 1928, 1924, 1920, 1916, 1912, 1908, 1904};

    @Before
    public void inuit() {
        ly = new LeapYear();
    }

    @Test
    public void testLeap() {
        for (int year: leapYears)
            assertTrue(ly.isLeapYear(year));
    }

    @Test
    public void testNotLeap() {
        for (int year: leapYears)
            assertFalse(ly.isLeapYear(year + 1));
    }
}
