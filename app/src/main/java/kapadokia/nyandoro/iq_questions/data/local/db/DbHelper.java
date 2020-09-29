package kapadokia.nyandoro.iq_questions.data.local.db;

import java.util.List;

import io.reactivex.Observable;
import kapadokia.nyandoro.iq_questions.data.model.db.Option;
import kapadokia.nyandoro.iq_questions.data.model.db.Question;
import kapadokia.nyandoro.iq_questions.data.model.db.User;

public interface DbHelper {

    Observable<List<User>> getAllUsers();
    Observable<Boolean> insertUser(final User user);
    Observable<List<Question>> getAllQuestions();
    Observable<List<Option>> getAllOptionsForQuestionId(Long questionId);
    Observable<Boolean> isOptionEmpty();
    Observable<Boolean> isQuestionEmpty();
    Observable<Boolean> saveOption(Option option);
    Observable<Boolean> saveOptionList(List<Option> optionList);
    Observable<Boolean> saveQuestion(Question question);
    Observable<Boolean> saveQuestionList(List<Question> questionList);
}
