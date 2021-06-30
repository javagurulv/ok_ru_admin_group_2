package student_sergo_kurbanov.lesson_3.level_4;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.printf("Phone model = %s", phoneModel);
    }
}
