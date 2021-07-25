package student_andrey_tryapichnikov.lesson_8.level_6;

import java.lang.reflect.*;

class ReflectionUtil {
    private static void printBeautifully(int color, String[][] dataMap) {
        for (int i = 0; i < dataMap[0].length; i++) {
            System.out.printf("\033[3%sm%s:\033[39m %s\n", color, dataMap[0][i], dataMap[1][i]);
        }
        System.out.println();
    }

    private static String arrayToString(Object[] array) {
        var result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i].toString();
        }
        return String.join(", ", result);
    }

    public String getClassAccessModifier(String fullClassName) {
        try {
            var reflectedClass = Class.forName(fullClassName);
            var modifiers = reflectedClass.getModifiers();
            return Modifier.toString(modifiers) + "\n";
        } catch (ClassNotFoundException e) {
            return e.toString();
        }
    }

    public String getSuperClassName(String fullClassName) {
        try {
            var reflectedClass = Class.forName(fullClassName);
            var superclassName = reflectedClass.getSuperclass().getName();
            return superclassName + "\n";
        } catch (ClassNotFoundException e) {
            return e + "\n";
        }
    }

    public void printClassMethods(String fullClassName) {
        final String[] headers = {"Method Name", "Modifier", "Return Types"};
        var dataMap = new String[2][headers.length];
        dataMap[0] = headers;
        try {
            var reflectedClass = Class.forName(fullClassName);
            var declaredMethods = reflectedClass.getDeclaredMethods();
            for (Method m: declaredMethods) {
                dataMap[1][0] = m.getName();
                dataMap[1][1] = Modifier.toString(m.getModifiers());
                dataMap[1][2] = m.getReturnType().toString();
                printBeautifully(3, dataMap);
            }
        } catch (ClassNotFoundException e) {
            System.out.printf("%s\n\n", e);
        }
    }

    public void printClassFields(String fullClassName) {
        final String[] headers = {"Field Name", "Modifier", "Type"};
        var dataMap = new String[2][headers.length];
        dataMap[0] = headers;
        try {
            var reflectedClass = Class.forName(fullClassName);
            var declaredFields = reflectedClass.getDeclaredFields();
            for (Field f: declaredFields) {
                dataMap[1][0] = f.getName();
                dataMap[1][1] = Modifier.toString(f.getModifiers());
                dataMap[1][2] = f.getType().getName();
                printBeautifully(3, dataMap);
            }
        } catch (ClassNotFoundException e) {
            System.out.printf("%s\n\n", e);
        }
    }

    public void printClassConstructors(String fullClassName) {
        final String[] headers = {"Constructor", "Modifier", "Parameter Types"};
        var dataMap = new String[2][headers.length];
        dataMap[0] = headers;
        try {
            var reflectedClass = Class.forName(fullClassName);
            var declaredConstructors = reflectedClass.getDeclaredConstructors();
            for (int i = 0; i < declaredConstructors.length; i++) {
                dataMap[1][0] = Integer.toString(i);
                dataMap[1][1] = Modifier.toString(declaredConstructors[i].getModifiers());
                Object[] parameterTypes = declaredConstructors[i].getParameterTypes();
                dataMap[1][2] = arrayToString(parameterTypes);
                printBeautifully(3, dataMap);
            }
        } catch (ClassNotFoundException e) {
            System.out.printf("%s\n\n", e);
        }
    }

    public Object createClassInstanceUsingDefaultConstructor(String fullClassName) {
        try {
            var reflectedClass = Class.forName(fullClassName);
            return reflectedClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            System.out.printf("%s\n\n", e);
            return new Object();
        }
    }
}
