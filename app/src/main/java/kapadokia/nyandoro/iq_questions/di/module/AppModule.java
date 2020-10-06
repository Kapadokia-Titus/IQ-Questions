package kapadokia.nyandoro.iq_questions.di.module;

import android.app.Application;
import android.content.Context;

import androidx.room.Room;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Provides;
import kapadokia.nyandoro.iq_questions.BuildConfig;
import kapadokia.nyandoro.iq_questions.R;
import kapadokia.nyandoro.iq_questions.data.AppDataManager;
import kapadokia.nyandoro.iq_questions.data.DataManager;
import kapadokia.nyandoro.iq_questions.data.local.db.AppDatabase;
import kapadokia.nyandoro.iq_questions.data.local.db.AppDbHelper;
import kapadokia.nyandoro.iq_questions.data.local.db.DbHelper;
import kapadokia.nyandoro.iq_questions.data.local.prefs.AppPreferencesHelper;
import kapadokia.nyandoro.iq_questions.data.local.prefs.PreferencesHelper;
import kapadokia.nyandoro.iq_questions.data.remote.ApiHeader;
import kapadokia.nyandoro.iq_questions.data.remote.ApiHelper;
import kapadokia.nyandoro.iq_questions.data.remote.AppApiHelper;
import kapadokia.nyandoro.iq_questions.di.ApiInfo;
import kapadokia.nyandoro.iq_questions.di.DatabaseInfo;
import kapadokia.nyandoro.iq_questions.di.PreferenceInfo;
import kapadokia.nyandoro.iq_questions.utils.AppConstants;
import kapadokia.nyandoro.iq_questions.utils.rx.AppSchedulerProvider;
import kapadokia.nyandoro.iq_questions.utils.rx.SchedulerProvider;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class AppModule {
    @Provides
    @Singleton
    ApiHelper provideApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }

    @Provides
    @ApiInfo
    String provideApiKey() {
        return BuildConfig.API_KEY;
    }

    @Provides
    @Singleton
    AppDatabase provideAppDatabase(@DatabaseInfo String dbName, Context context) {
        return Room.databaseBuilder(context, AppDatabase.class, dbName).fallbackToDestructiveMigration()
                .build();
    }

    @Provides
    @Singleton
    CalligraphyConfig provideCalligraphyDefaultConfig() {
        return new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/source-sans-pro/SourceSansPro-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build();
    }

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return AppConstants.DB_NAME;
    }

    @Provides
    @Singleton
    DbHelper provideDbHelper(AppDbHelper appDbHelper) {
        return appDbHelper;
    }

    @Provides
    @Singleton
    Gson provideGson() {
        return new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName() {
        return AppConstants.PREF_NAME;
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(AppPreferencesHelper appPreferencesHelper) {
        return appPreferencesHelper;
    }

    @Provides
    @Singleton
    ApiHeader.ProtectedApiHeader provideProtectedApiHeader(@ApiInfo String apiKey,
                                                           PreferencesHelper preferencesHelper) {
        return new ApiHeader.ProtectedApiHeader(
                apiKey,
                preferencesHelper.getCurrentUserId(),
                preferencesHelper.getAccessToken());
    }

    @Provides

    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }
}
