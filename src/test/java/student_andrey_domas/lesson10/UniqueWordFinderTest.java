package student_andrey_domas.lesson10;


import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class UniqueWordFinderTest {

    UniqueWordFinder uf = new UniqueWordFinder();

    @Test
    public void spaceTest() {
        Set<String> results = uf.find("d3r34 fj6j wef43 y46");
        String expected[] = {"d3r34", "fj6j", "wef43", "y46"};
        Assert.assertArrayEquals(expected, results.stream().sorted().toArray());
    }

    @Test
    public void multipleSpacesTest() {
        Set<String> results = uf.find("d3r34   fj6j  wef43 y46");
        String expected[] = {"d3r34", "fj6j", "wef43", "y46"};
        Assert.assertArrayEquals(expected, results.stream().sorted().toArray());
    }

    @Test
    public void noSpacesTest() {
        Set<String> results = uf.find("d3r34fj6jwef43y46");
        String expected[] = {"d3r34fj6jwef43y46"};
        Assert.assertArrayEquals(expected, results.stream().sorted().toArray());
    }

}