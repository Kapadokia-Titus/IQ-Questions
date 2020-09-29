package kapadokia.nyandoro.iq_questions.data.local.db;

import java.util.List;
import java.util.concurrent.Callable;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;
import kapadokia.nyandoro.iq_questions.data.model.db.Option;
import kapadokia.nyandoro.iq_questions.data.model.db.Question;
import kapadokia.nyandoro.iq_questions.data.model.db.User;

@Singleton
public class AppDbHelper implements DbHelper {

    private final AppDatabase mAppDatabase;

    @Inject
    public AppDbHelper(AppDatabase mAppDatabase) {
        this.mAppDatabase = mAppDatabase;
    }

    @Override
    public Observable<List<User>> getAllUsers() {
        return Observable.fromCallable(new Callable<List<User>>() {
            @Override
            public List<User> call() throws Exception {
                return mAppDatabase.userDao().loadAll();
            }
        });
    }

    @Override
    public Observable<Boolean> insertUser(User user) {
        return Observable.fromCallable(new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                mAppDatabase.userDao().insert(user);
                return true;
            }
        });
    }

    @Override
    public Observable<List<Question>> getAllQuestions() {
        return null;
    }

    @Override
    public Observable<List<Option>> getAllOptionsForQuestionId(Long questionId) {
        return null;
    }

    @Override
    public Observable<Boolean> isOptionEmpty() {
        return null;
    }

    @Override
    public Observable<Boolean> isQuestionEmpty() {
        return null;
    }

    @Override
    public Observable<Boolean> saveOption(Option option) {
        return null;
    }

    @Override
    public Observable<Boolean> saveOptionList(List<Option> optionList) {
        return null;
    }

    @Override
    public Observable<Boolean> saveQuestion(Question question) {
        return null;
    }

    @Override
    public Observable<Boolean> saveQuestionList(List<Question> questionList) {
        return null;
    }
}
