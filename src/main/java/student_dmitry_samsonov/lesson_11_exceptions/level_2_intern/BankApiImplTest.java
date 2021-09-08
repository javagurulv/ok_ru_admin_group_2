package student_dmitry_samsonov.lesson_11_exceptions.level_2_intern;

import java.util.List;

class BankApiImplTest {
    public static void main(String[] args) throws AccessDeniedException {
        BankClient bankClient = new BankClient("1", "Dmitry Samsonov");
        BankApiImpl bankApi = new BankApiImpl(List.of(bankClient));
        UserCredentials userCredentials = new UserCredentials(List.of());
        try {
            bankApi.findByUid(userCredentials, "1");
            printTestResult("findByUid AccessDeniedException", false);
        } catch (AccessDeniedException e) {
            printTestResult("findByUid AccessDeniedException", true);
        }
        userCredentials = new UserCredentials(List.of(Role.CAN_SEARCH_CLIENTS));
        printTestResult("findByUid",bankApi.findByUid(userCredentials, "1").isPresent());
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
