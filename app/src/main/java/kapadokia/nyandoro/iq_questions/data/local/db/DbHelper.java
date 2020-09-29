package kapadokia.nyandoro.iq_questions.data.local.db;

import java.util.List;

import io.reactivex.Observable;
import kapadokia.nyandoro.iq_questions.data.model.db.User;

public interface DbHelper {

    Observable<List<User>> getAllUsers();
    Observable<Boolean> insertUser(final User user);
}
