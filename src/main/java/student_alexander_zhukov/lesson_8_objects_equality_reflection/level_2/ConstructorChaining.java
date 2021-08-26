package student_alexander_zhukov.lesson_8_objects_equality_reflection.level_2;

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(int firstParameter, String secondParameter) {
        this("private");
    }

}
