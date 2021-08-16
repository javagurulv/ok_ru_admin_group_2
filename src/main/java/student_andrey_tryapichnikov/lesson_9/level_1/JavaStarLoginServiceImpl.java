package student_andrey_tryapichnikov.lesson_9.level_1;

public class JavaStarLoginServiceImpl implements JavaStarLoginService {
    @Override
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}
