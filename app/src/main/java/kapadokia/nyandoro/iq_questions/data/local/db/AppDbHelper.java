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
        return mAppDatabase.questionDao().loadAll().toObservable();
    }


    @Override
    public Observable<Boolean> isOptionEmpty() {
        return mAppDatabase.optionDao().loadAll()
                .flatMapObservable(options -> Observable.just(options.isEmpty()));
    }

    @Override
    public Observable<Boolean> isQuestionEmpty() {
        return mAppDatabase.questionDao().loadAll()
                .flatMapObservable(questions -> Observable.just(questions.isEmpty()));
    }

    @Override
    public Observable<Boolean> saveOption(Option option) {
        return  Observable.fromCallable(new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                mAppDatabase.optionDao().insert(option);
                return true;
            }
        });
    }

    @Override
    public Observable<Boolean> saveOptionList(List<Option> optionList) {
        return Observable.fromCallable(new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                mAppDatabase.optionDao().insertAll(optionList);
                return true;
            }
        });
    }

    @Override
    public Observable<Boolean> saveQuestion(Question question) {
        return Observable.fromCallable(new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                mAppDatabase.questionDao().insert(question);
                return true;
            }
        });
    }

    @Override
    public Observable<Boolean> saveQuestionList(List<Question> questionList) {
        return Observable.fromCallable(new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                mAppDatabase.questionDao().insertAll(questionList);
                return true;
            }
        });
    }

    @Override
    public Observable<List<Option>> getOptionsForQuestionId(Long questionId) {
        return mAppDatabase.optionDao().loadAllByQuestionId(questionId)
                .toObservable();
    }


}
