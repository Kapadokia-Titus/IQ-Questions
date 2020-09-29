package kapadokia.nyandoro.iq_questions.data.local.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import kapadokia.nyandoro.iq_questions.data.local.db.dao.OptionDao;
import kapadokia.nyandoro.iq_questions.data.local.db.dao.QuestionDao;
import kapadokia.nyandoro.iq_questions.data.local.db.dao.UserDao;
import kapadokia.nyandoro.iq_questions.data.model.db.Option;
import kapadokia.nyandoro.iq_questions.data.model.db.Question;
import kapadokia.nyandoro.iq_questions.data.model.db.User;

@Database( entities = {User.class, Question.class, Option.class}, version = 2)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDao userDao();
    public abstract OptionDao optionDao();
    public abstract QuestionDao questionDao();
}
