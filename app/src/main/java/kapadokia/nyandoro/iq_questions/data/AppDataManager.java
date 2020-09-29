package kapadokia.nyandoro.iq_questions.data;

import android.content.Context;

import com.google.gson.Gson;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Single;
import kapadokia.nyandoro.iq_questions.data.local.db.DbHelper;
import kapadokia.nyandoro.iq_questions.data.model.api.LoginRequest;
import kapadokia.nyandoro.iq_questions.data.model.api.LoginResponse;
import kapadokia.nyandoro.iq_questions.data.model.api.LogoutResponse;
import kapadokia.nyandoro.iq_questions.data.model.db.Option;
import kapadokia.nyandoro.iq_questions.data.model.db.Question;
import kapadokia.nyandoro.iq_questions.data.model.db.User;
import kapadokia.nyandoro.iq_questions.data.model.others.QuestionCardData;
import kapadokia.nyandoro.iq_questions.data.remote.ApiHeader;
import kapadokia.nyandoro.iq_questions.data.remote.ApiHelper;

public class AppDataManager implements DataManager {
    private static final String TAG = "AppDataManager";

    private final ApiHelper mApiHelper;
    private final Context mContext;
    private final DbHelper mDbHelper;
    private final Gson mGson;

    @Inject
    public AppDataManager(Context mContext, DbHelper mDbHelper,Gson mGson, ApiHelper mApiHelper){
        this.mApiHelper = mApiHelper;
        this.mDbHelper = mDbHelper;
        this.mContext = mContext;
        this.mGson =mGson;
    }

    @Override
    public Observable<List<QuestionCardData>> getQuestionCardData() {
        return null;
    }

    @Override
    public Observable<Boolean> seedDatabaseOptions() {
        return null;
    }

    @Override
    public Observable<Boolean> seedDatabaseQuestions() {
        return null;
    }

    @Override
    public void setUserAsLoggedOut() {
        updateUserInfo(null,
                        null,
                        LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT,
                        null,
                        null,
                        null);
    }

    @Override
    public void updateApiHeader(Long userId, String accessToken) {
        mApiHelper.getApiHeader().getmProtectedApiHeader().setmUserId(userId);
        mApiHelper.getApiHeader().getmProtectedApiHeader().setmAccessToken(accessToken);

    }

    @Override
    public void updateUserInfo(String accessToken,
                               Long userId,
                               LoggedInMode loggedInMode,
                               String userName, String email, String profilePicPath) {



    }

    @Override
    public Observable<List<User>> getAllUsers() {
        return null;
    }

    @Override
    public Observable<Boolean> insertUser(User user) {
        return null;
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

    @Override
    public Single<LoginResponse> doFacebookLoginApiCall(LoginRequest.FacebookLoginRequest request) {
        return null;
    }

    @Override
    public Single<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest request) {
        return null;
    }

    @Override
    public Single<LogoutResponse> doLogoutApiCall() {
        return null;
    }

    @Override
    public Single<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest request) {
        return null;
    }


    @Override
    public ApiHeader getApiHeader() {
        return null;
    }

    @Override
    public String getAccessToken() {
        return null;
    }

    @Override
    public void setAccessToken(String accessToken) {

    }

    @Override
    public String getCurrentUserEmail() {
        return null;
    }

    @Override
    public void setCurrentUserEmail(String email) {

    }

    @Override
    public Long getCurrentUserId() {
        return null;
    }

    @Override
    public void setCurrentUserId(Long userId) {

    }

    @Override
    public int getCurrentUserLoggedInMode() {
        return 0;
    }

    @Override
    public void setCurrentUserLoggedInMode(LoggedInMode mode) {

    }

    @Override
    public String getCurrentUserName() {
        return null;
    }

    @Override
    public void setCurrentUserName(String userName) {

    }

    @Override
    public String getCurrentUserProfilePicUrl() {
        return null;
    }

    @Override
    public void setCurrentUserProfilePicUrl(String profilePicUrl) {

    }
}
