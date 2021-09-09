package student_dmitry_samsonov.lesson_11_exceptions.level_2_intern;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}