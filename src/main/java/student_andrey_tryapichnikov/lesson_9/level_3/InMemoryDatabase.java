package student_andrey_tryapichnikov.lesson_9.level_3;

import java.util.Optional;

public class InMemoryDatabase implements ProductDatabase{
    private Product[] products = new Product[0];

    public void save(Product product) {
        int newIndex = products.length + 1;
        Product[] newProducts = new Product[newIndex];
        newProducts[newIndex - 1] = product;
        System.arraycopy(products, 0, newProducts, 0, products.length);
        products = newProducts;
    }

    public Optional<Product> findByTitle(String productTitle) {
        Product result = null;
        for (Product i: products) {
            if (productTitle.equals(i.getTitle())) result = i;
        }
        return Optional.ofNullable(result);
    }

    public void listProducts() {
        for (Product i: products) {
            System.out.println(i.getTitle());
        }
    }

    public static void main(String[] args) {
        var myDB = new InMemoryDatabase();
        myDB.save(new Product("asdf asdf"));
        myDB.save(new Product("klmn oprs"));
        myDB.save(new Product("qwer rewq"));
        myDB.save(new Product(";lkj ;lkj"));
        myDB.save(new Product("1233 3321"));

        myDB.listProducts();

        testDB(myDB, "1233 3321");
        testDB(myDB, "no u!");
        testDB(myDB, "klmn oprs");
    }

    public static void testDB(ProductDatabase database, String title) {
        var element = database.findByTitle(title);
        if (element.isPresent()) {
            System.out.println(element.get().getTitle());
            return;
        }
        System.out.printf("%s returns null\n", title);
    }
}
