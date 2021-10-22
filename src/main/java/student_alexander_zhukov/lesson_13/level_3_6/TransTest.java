package student_alexander_zhukov.lesson_13.level_3_6;

class TransTest {

    public static void main(String[] args) {
        TransactionAnalysisService test = new TransactionAnalysisService();
        TransactionTestData data = new TransactionTestData();

        System.out.println(test.findTransactionsByYear(data.getTransactions(), 2012));
        System.out.println(test.sortTransactionsByValue(data.getTransactions()));
        System.out.println(test.sortTransactionsByValueReversed(data.getTransactions()));
        System.out.println(test.findTransactions2011AndSort(data.getTransactions()));

        System.out.println(test.findTransactionsYears(data.getTransactions()));
        System.out.println(test.findTransactionsYearsUniq(data.getTransactions()));
        System.out.println(test.findTransactionsTradersUniq(data.getTransactions()));
        System.out.println(test.findTransactionsCitiesUniq(data.getTransactions()));
        System.out.println(test.findTransactionsFromCambridge(data.getTransactions()));
        System.out.println(test.findTraderNamesFromCity(data.getTransactions(), "Milan"));

        System.out.println(test.maxValue(data.getTransactions()));
        System.out.println(test.minValue(data.getTransactions()));
        System.out.println(test.tradersList(data.getTransactions()));
        System.out.println(test.citiesList(data.getTransactions()));
    }


}
