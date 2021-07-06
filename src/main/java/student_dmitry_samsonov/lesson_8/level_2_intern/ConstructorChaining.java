package student_dmitry_samsonov.lesson_8.level_2_intern;

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }
    public ConstructorChaining(String constructorName, int parameterCount){
        this(constructorName);
    }
}