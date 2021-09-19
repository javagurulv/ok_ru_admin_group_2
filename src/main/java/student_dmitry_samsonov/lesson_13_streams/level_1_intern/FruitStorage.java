package student_dmitry_samsonov.lesson_13_streams.level_1_intern;

import java.util.ArrayList;
import java.util.List;

class FruitStorage {

    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    public List<Apple> getApplesByColor(String color) {
        return getAllApples().stream().filter(a -> a.getColor().equals(color)).toList();
    }

    public boolean havierThen(Apple apple, int weight) {
        return apple.getWeight() > weight;
    }

    public List<Apple> getApplesByWeight(int weight) {
        return getAllApples().stream().filter(a -> havierThen(a, weight)).toList();
    }

    public List<Apple> findApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}