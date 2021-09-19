package student_dmitry_samsonov.lesson_13_streams.level_1_intern;

class AppleLightWeightPredicate implements ApplePredicate {
    public boolean test (Apple apple) {
        return apple.getWeight() <= 150;
    }
}