package student_dmitry_samsonov.lesson_13_streams.level_1_intern;

class AppleRedColorPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return "red".equals(apple.getColor());
    }
}