package student_dmitry_samsonov.lesson_11_exceptions.level_2_intern;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {
        if (!credentials.hasRole(Role.CAN_SEARCH_CLIENTS)) {
            AccessDeniedException exception = new AccessDeniedException("Need tole CAN_SEARCH_CLIENTS");
            throw exception;
        }
        for (BankClient client: this.clients) {
            if (client.getUid().equals(uid)){
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }

}