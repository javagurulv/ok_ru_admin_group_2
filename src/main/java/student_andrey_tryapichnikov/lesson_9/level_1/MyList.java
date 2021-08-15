package student_andrey_tryapichnikov.lesson_9.level_1;

public interface MyList {
    // add value to the list
    void append(Object value);
    // append another list
    void appendList(MyList values);
    // remove value from the list, either by index or by value
    void removeByIndex(int index);
    void removeByValue(Object value);
    // sort the thing
    void sort();
    // display length of the list
    int getLength();
    // return the last element and remove it from the list
    Object pop();
    // return the value by index or some specified value if the former is missing
    Object getValue(int index, Object defaultValue);
    // get a part of the list
    Object[] slice(int indexStart, int indexEnd);
    // join into a string
    String join(String joinString);
}
