package kapadokia.nyandoro.iq_questions.data.model.others;

import java.util.List;

import kapadokia.nyandoro.iq_questions.data.model.db.Option;
import kapadokia.nyandoro.iq_questions.data.model.db.Question;

public class QuestionCardData {

    public boolean mShowCorrectOptions;

    public List<Option> options;

    public Question question;

    public QuestionCardData(Question question, List<Option> options) {
        this.question = question;
        this.options = options;
    }
}
