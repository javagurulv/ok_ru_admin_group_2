package student_dmitry_drozdetsky.lesson_3.level_4.Task_15;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Phone {

    String model;

        Phone(String newModel) {
            this.model = newModel;
        }

         public String getModel() {
            return this.model;
        }

    }

    class PhoneDemo {

        public static void main(String[] args) {
            Phone myPhone = new Phone("Huawei");
            String phoneModel = myPhone.getModel();
            System.out.println("Phone model = " + phoneModel);
        }

    }