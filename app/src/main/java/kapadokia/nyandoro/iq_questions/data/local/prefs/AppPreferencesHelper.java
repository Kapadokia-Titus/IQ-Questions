package kapadokia.nyandoro.iq_questions.data.local.prefs;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;

import kapadokia.nyandoro.iq_questions.data.DataManager;

public class AppPreferencesHelper implements PreferencesHelper {

    public static final String PREF_KEY_ACCESS_TOKEN ="PREF_KEY_ACCESS_TOKEN";
    public static final String PREF_KEY_CURRENT_USER_EMAIL ="PREF_KEY_CURRENT_USER_EMAIL";
    public static final String PREF_KEY_CURRENT_USER_ID ="PREF_KEY_CURRENT_USER_ID";
    public static final String PREF_KEY_CURRENT_USER_NAME ="PREF_KEY_CURRENT_USER_NAME";
    public static final String PREF_KEY_CURRENT_USER_PROFILE_PIC_URL ="PREF_KEY_CURRENT_USER_PROFILE_PIC_URL";
    public static final String PREF_KEY_USER_LOGGED_IN_MODE ="PREF_KEY_USER_LOGGED_IN_MODE";

    private final SharedPreferences mPrefs;

    @Inject
    public AppPreferencesHelper(Context context, @PreferenceInfo String prefFileName) {
        mPrefs = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE);
    }
    @Override
    public String getAccessToken() {
        return mPrefs.getString(PREF_KEY_ACCESS_TOKEN, null);
    }

    @Override
    public void setAccessToken(String accessToken) {
        mPrefs.edit().putString(PREF_KEY_ACCESS_TOKEN, accessToken).apply();
    }

    @Override
    public String getCurrentUserEmail() {
        return mPrefs.getString(PREF_KEY_CURRENT_USER_EMAIL, null);
    }

    @Override
    public void setCurrentUserEmail(String email) {
       mPrefs.edit().putString(PREF_KEY_CURRENT_USER_EMAIL, email).apply();
    }

    @Override
    public Long getCurrentUserId() {
        long userId = mPrefs.getLong(PREF_KEY_CURRENT_USER_ID, AppConstants.NULL_INDEX);
        return userId == AppConstants.NULL_INDEX ? null : userId; 
    }

    @Override
    public void setCurrentUserId(Long userId) {

    }

    @Override
    public int getCurrentUserLoggedInMode() {
        return 0;
    }

    @Override
    public void setCurrentUserLoggedInMode(DataManager.LoggedInMode mode) {

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
