package kapadokia.nyandoro.iq_questions.data;

import java.util.List;

import io.reactivex.Observable;
import kapadokia.nyandoro.iq_questions.data.local.db.DbHelper;
import kapadokia.nyandoro.iq_questions.data.local.prefs.PreferencesHelper;
import kapadokia.nyandoro.iq_questions.data.model.others.QuestionCardData;
import kapadokia.nyandoro.iq_questions.data.remote.ApiHelper;

 // TODO 1:: to add preference helper
public interface DataManager extends DbHelper, PreferencesHelper, ApiHelper {

     Observable<List<QuestionCardData>> getQuestionCardData();

     Observable<Boolean> seedDatabaseOptions();

     Observable<Boolean> seedDatabaseQuestions();
     void setUserAsLoggedOut();
     void updateApiHeader(Long userId, String accessToken);
     void updateUserInfo(
             String accessToken,
             Long userId,
             LoggedInMode loggedInMode,
             String userName,
             String email,
             String profilePicPath);

     enum LoggedInMode{
         LOGGED_IN_MODE_LOGGED_OUT(0),
         LOGGED_IN_MODE_GOOGLE(1),
         LOGGED_IN_MODE_FB(2),
         LOGGED_IN_MODE_SERVER(3);

         private final int mType;

         LoggedInMode(int mType) {
             this.mType = mType;
         }

         public int getmType() {
             return mType;
         }
     }

}
