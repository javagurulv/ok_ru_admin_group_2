package student_dmitry_samsonov.lesson_9_interfaces.level_1_intern;

class MyListArrayImplTest {
    public static void main(String[] args) {
        MyListArrayImpl myListArray = new MyListArrayImpl();
        Integer a = 1;
        Integer b = 2;
        myListArray.add(a);
        printTestResult("Add 1 object, check len", myListArray.size() == 1);
        myListArray.replace(a, b);
        printTestResult("Replace a to b, get index 0", myListArray.get(0).equals(b));
        myListArray.add(a);
        myListArray.sort();
        printTestResult("Add a, sort, get index 0", myListArray.get(0).equals(a));
        printTestResult("Check non empty", !myListArray.isEmpty());
        myListArray.remove(a);
        printTestResult("Check contains a", !myListArray.contains(a));
        myListArray.add(b);
        Object[] bb = new Object[2];
        bb[0] = b;
        bb[1] = b;
        myListArray.removeAll(bb);
        printTestResult("Check empty", myListArray.isEmpty());
    }
    static void printTestResult(String name, boolean result) {
        String reportName = name + " test = ";
        String reportResult;
        if (result) {
            reportResult = "OK";
        } else {
            reportResult = "FAIL";
        }
        System.out.println(reportName + reportResult);
    }
}
