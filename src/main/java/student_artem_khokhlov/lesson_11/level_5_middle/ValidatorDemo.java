package student_artem_khokhlov.lesson_11.level_5_middle;

import java.util.Scanner;

public class ValidatorDemo {
    public static void main(String[] args) throws ValidationException {
        Validator validate = new ValidatorImpl();
        String name;
        String desc;
        Long price;
        System.out.println("Enter product name: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        validate.validateName(name);
        System.out.println("Enter price: ");
        sc = new Scanner(System.in);
        price = sc.nextLong();
        validate.validatePrice(price);
        System.out.println("Enter description: ");
        sc = new Scanner(System.in);
        desc = sc.nextLine();
        validate.validateDescription(desc);
    }
}
