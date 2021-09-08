package student_dmitry_samsonov.lesson_11_exceptions.level_2_intern;

// Exception - это checked ошибка, которую мы должны поймать и обработать или передать дальше.
// В данном случае мы можем и хотим проверить права и сообщить об ошибке понятным сообщением.
class AccessDeniedException extends Exception {
    public AccessDeniedException(String message) {
        super(message);
    }
}