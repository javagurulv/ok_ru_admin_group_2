package student_alexander_zhukov.lesson_3.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }
}
