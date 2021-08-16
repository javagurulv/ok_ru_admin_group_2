package student_andrey_domas.lesson9.level7;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import student_andrey_domas.lesson9.level1.MyList;

import java.util.Arrays;
import java.util.List;

public abstract class MyListTests<MyListImpl extends MyList<Integer>> {

    MyListImpl lst;

    @Test
    public void testRemove() {
        lst.remove(2);
        Integer expected[] = {1, 3, 4};
        Assert.assertArrayEquals(expected, lst.toArray());
        Assert.assertEquals(3, lst.size());
    }

    @Test
    public void testRemoveLast() {
        lst.remove(4);
        Integer expected[] = {1, 2, 3};
        Assert.assertArrayEquals(expected, lst.toArray());
        Assert.assertEquals(3, lst.size());
    }

    @Test
    public void testRemoveFirst() {
        lst.remove(1);
        Integer expected[] = {2, 3, 4};
        Assert.assertArrayEquals(expected, lst.toArray());
        Assert.assertEquals(3, lst.size());
    }


    @Test
    public void testAdd() {
        Assert.assertEquals(4, lst.size());
        lst.add(2);
        Assert.assertEquals(5, lst.size());
        Integer expected[] = {1, 2, 3, 4, 2};
        Assert.assertArrayEquals(expected, lst.toArray());
    }

    @Test
    public void testPop() {
        int x = lst.pop(2);
        Integer expected[] = {1, 2, 4};
        Assert.assertArrayEquals(expected, lst.toArray());
        Assert.assertEquals(3, x);
        Assert.assertEquals(3, lst.size());
    }

    @Test
    public void testPopBadIndex1() {
        Assert.assertNull(lst.pop(-1));
    }

    @Test
    public void testPopBadIndex2() {
        Assert.assertNull(lst.pop(100));
    }

    @Test
    public void testIndexAbsent() {
        Assert.assertEquals(-1, lst.index(100));
    }

    @Test
    public void testExtendArray() {
        Integer ext[] = {5, null};
        MyList<Integer> extList = new MyListArrayImpl<>(ext);
        lst.extend(extList);
        Assert.assertEquals(6, lst.size());
        Integer expected[] = {1, 2, 3, 4, 5, null};
        Assert.assertArrayEquals(expected, lst.toArray());
    }

    @Test
    public void testExtendLinked() {
        Integer ext[] = {5, null};
        MyList<Integer> extList = new MyListLinkedListImpl<>(ext);
        lst.extend(extList);
        Assert.assertEquals(6, lst.size());
        Integer expected[] = {1, 2, 3, 4, 5, null};
        Assert.assertArrayEquals(expected, lst.toArray());
    }

    @Test
    public void testExtendNull() {
        lst.extend(null);
        Assert.assertEquals(4, lst.size());
        Integer expected[] = {1, 2, 3, 4};
        Assert.assertArrayEquals(expected, lst.toArray());
    }

    @Test
    public void testClear() {
        Assert.assertEquals(4, lst.size());
        lst.clear();
        Assert.assertEquals(0, lst.size());
    }

    @Test
    public void testIteration() {
        Integer expected[] = {1, 2, 3, 4};
        int actual[] = new int[4];
        int i = 0;
        for (Integer e: lst)
            actual[i++] = e;
        Assert.assertArrayEquals(expected, lst.toArray());
    }

    @Test
    public void testIndex() {
        Assert.assertEquals(1, lst.index(2));
    }

    @Test
    public void testIndexNull1() {
        Assert.assertEquals(-1, lst.index(null));
    }

    @Test
    public void testIndexNull2() {
        lst.add(null);
        Assert.assertEquals(4, lst.index(null));
    }
}
