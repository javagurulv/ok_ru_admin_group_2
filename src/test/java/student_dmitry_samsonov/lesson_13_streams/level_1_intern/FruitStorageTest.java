package student_dmitry_samsonov.lesson_13_streams.level_1_intern;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FruitStorageTest {

    @Test
    public void getAllGreenApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        FruitStorage fruitStorage = new FruitStorage();
        Assert.assertEquals(apples, fruitStorage.getApplesByColor("green"));
    }

    @Test
    public void getAllRedApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        FruitStorage fruitStorage = new FruitStorage();
        Assert.assertEquals(apples, fruitStorage.getApplesByColor("red"));
    }

    @Test
    public void getAll100PlusApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        FruitStorage fruitStorage = new FruitStorage();
        Assert.assertEquals(apples, fruitStorage.getApplesByWeight(199));
    }

    @Test
    public void findApplesGreen() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        FruitStorage fruitStorage = new FruitStorage();
        Assert.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(),
                                                            new AppleGreenColorPredicate()));
    }

    @Test
    public void findApplesRed() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        FruitStorage fruitStorage = new FruitStorage();
        Assert.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(),
                new AppleRedColorPredicate()));
    }

    @Test
    public void findApplesHeavy() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("yellow", 170));
        FruitStorage fruitStorage = new FruitStorage();
        Assert.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(),
                new AppleHeavyWeightPredicate()));
    }

    @Test
    public void findApplesLight() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        FruitStorage fruitStorage = new FruitStorage();
        Assert.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(),
                new AppleLightWeightPredicate()));
    }

    @Test
    public void findApplesAnonymousGreen() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        FruitStorage fruitStorage = new FruitStorage();
        Assert.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(),
                new ApplePredicate() {
                    public boolean test (Apple apple) {
                        return "green".equals(apple.getColor());
                    }
                }));
    }

    @Test
    public void findApplesAnonymousRed() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        FruitStorage fruitStorage = new FruitStorage();
        Assert.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(),
                new ApplePredicate() {
                    public boolean test (Apple apple) {
                        return "red".equals(apple.getColor());
                    }
                }));
    }

    @Test
    public void findApplesAnonymousHeavy() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("yellow", 170));
        FruitStorage fruitStorage = new FruitStorage();
        Assert.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(),
                new ApplePredicate() {
                    public boolean test (Apple apple) {
                        return apple.getWeight() > 150;
                    }
                }));
    }

    @Test
    public void findApplesAnonymousLight() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        FruitStorage fruitStorage = new FruitStorage();
        Assert.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(),
                new ApplePredicate() {
                    public boolean test (Apple apple) {
                        return apple.getWeight() <= 150;
                    }
                }));
    }

    @Test
    public void findApplesLambdaGreen() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        FruitStorage fruitStorage = new FruitStorage();
        Assert.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(),
                (Apple apple) -> "green".equals(apple.getColor())));
    }

    @Test
    public void findApplesLambdaRed() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        FruitStorage fruitStorage = new FruitStorage();
        Assert.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(),
                (Apple apple) -> "red".equals(apple.getColor())));
    }

    @Test
    public void findApplesLambdaHeavy() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("yellow", 170));
        FruitStorage fruitStorage = new FruitStorage();
        Assert.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(),
                (Apple apple) -> apple.getWeight() > 150));
    }

    @Test
    public void findApplesLambdaLight() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        FruitStorage fruitStorage = new FruitStorage();
        Assert.assertEquals(apples, fruitStorage.findApples(fruitStorage.getAllApples(),
                (Apple apple) -> apple.getWeight() <= 150));
    }
}