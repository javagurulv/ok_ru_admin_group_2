package student_alexander_fateev.lesson8.level_2.task10;

class ConstructorChaining {
    private String constructorName;
    private int parameterCount;

    public ConstructorChaining(String constructorName, int parameterCount) {
        this(constructorName);
        //this.constructorName = constructorName;
        this.parameterCount = parameterCount;
    }

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }
}
