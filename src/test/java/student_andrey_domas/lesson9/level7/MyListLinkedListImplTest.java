package student_andrey_domas.lesson9.level7;

import org.junit.Before;

public class MyListLinkedListImplTest extends MyListTests{
    @Before
    public void setup() {
        Integer initial[] = {1, 2, 3, 4};
        lst = new MyListLinkedListImpl(initial);
    }
}
