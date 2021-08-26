package student_alexander_zhukov.lesson_8_objects_equality_reflection.level_5;

class ReflectionUtil {

    public String getClassAccessModifier(String fullClassName) throws ClassNotFoundException {
        Class nameClass = Class.forName(fullClassName);
        int modifier = nameClass.getModifiers();
        return java.lang.reflect.Modifier.toString(modifier);
    }

    public String getSuperClassName(String fullClassName) throws ClassNotFoundException {
        Class nameClass = Class.forName(fullClassName);
        return nameClass.getSuperclass().getName();
    }

    public void printClassMethods(String fullClassName) throws ClassNotFoundException {
        Class nameClass = Class.forName(fullClassName);
        for (var i: nameClass.getDeclaredMethods()) {
            System.out.println("Method Name: " + i.getName());
            System.out.println("Modifier: " + java.lang.reflect.Modifier.toString(i.getModifiers()));
            System.out.println("Return Types: " + i.getReturnType());
            System.out.println();
        }

    }

    public void printClassFields(String fullClassName) throws ClassNotFoundException {
        Class nameClass = Class.forName(fullClassName);
        for (var i: nameClass.getDeclaredFields()) {
            System.out.println("Field Name: " + i.getName());
            System.out.println("Modifier: " + java.lang.reflect.Modifier.toString(i.getModifiers()));
            System.out.println("Return Types: " + i.getType());
            System.out.println();
        }
    }

    public void printClassConstructors(String fullClassName) throws ClassNotFoundException {
        Class nameClass = Class.forName(fullClassName);
        int constructorNum = 0;
        for (var i: nameClass.getDeclaredConstructors()) {
            String text = i.toString();
            constructorNum ++;
            System.out.println("Constructor " + constructorNum);
            System.out.println("Modifier: " + java.lang.reflect.Modifier.toString(i.getModifiers()));
            System.out.println("Parameter Types: " + text.substring(text.indexOf('(') + 1, text.indexOf(')')));
            System.out.println();
        }
    }

    public Object createClassInstanceUsingDefaultConstructor(String fullClassName) throws Exception {
        Class nameClass = Class.forName(fullClassName);
        return nameClass.getDeclaredConstructor().newInstance();
    }


}
