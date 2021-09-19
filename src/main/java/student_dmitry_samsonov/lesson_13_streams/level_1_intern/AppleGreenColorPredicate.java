package student_dmitry_samsonov.lesson_13_streams.level_1_intern;

class AppleGreenColorPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return "green".equals(apple.getColor());
    }
}