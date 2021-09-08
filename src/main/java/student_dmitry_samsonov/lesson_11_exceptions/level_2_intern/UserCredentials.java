package student_dmitry_samsonov.lesson_11_exceptions.level_2_intern;

import java.util.List;

class UserCredentials {

    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean hasRole(Role role) {
        return this.getRoles().contains(role);
    }
}