package student_alexander_zhukov.lesson_9.level_3;

import java.util.Optional;

class TestProduct {
    public static void main(String[] args) {
        Product pr = new Product("test");
        InMemoryDatabase db = new InMemoryDatabase();
        db.save(pr);
        db.save(pr);
        db.save(pr);
        Optional<Product> pr1 = db.findByTitle("test");
        System.out.println(pr1);

    }
}
