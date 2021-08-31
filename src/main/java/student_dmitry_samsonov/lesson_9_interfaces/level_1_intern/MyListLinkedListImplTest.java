package student_dmitry_samsonov.lesson_9_interfaces.level_1_intern;

class MyListLinkedListImplTest {
    public static void main(String[] args) {
        MyListLinkedListImpl myListLinkedList = new MyListLinkedListImpl();
        Integer a = 1;
        Integer b = 2;
        myListLinkedList.add(a);
        printTestResult("Add 1 object, check len", myListLinkedList.size() == 1);
        myListLinkedList.replace(a, b);
        printTestResult("Replace a to b, get index 0", myListLinkedList.get(0).equals(b));
        myListLinkedList.add(a);
        printTestResult("Check non empty", !myListLinkedList.isEmpty());
        myListLinkedList.remove(a);
        printTestResult("Check contains a", !myListLinkedList.contains(a));
        myListLinkedList.add(b);
        Object[] bb = new Object[2];
        bb[0] = b;
        bb[1] = b;
        myListLinkedList.removeAll(bb);
        printTestResult("Check empty", myListLinkedList.isEmpty());
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
