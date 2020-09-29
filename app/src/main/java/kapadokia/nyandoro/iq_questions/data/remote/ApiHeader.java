package kapadokia.nyandoro.iq_questions.data.remote;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.sql.StatementEvent;

@Singleton
public class ApiHeader {

    private ProtectedApiHeader mProtectedApiHeader;
    private PublicApiHeader mPublicApiHeader;

    @Inject
    public ApiHeader(PublicApiHeader mPublicApiHeader, ProtectedApiHeader mProtectedApiHeader){
        this.mProtectedApiHeader =mProtectedApiHeader;
        this.mPublicApiHeader = mPublicApiHeader;
    }

    public ProtectedApiHeader getmProtectedApiHeader() {
        return mProtectedApiHeader;
    }

    public PublicApiHeader getmPublicApiHeader() {
        return mPublicApiHeader;
    }

    public static final class ProtectedApiHeader {

        @Expose
        @SerializedName("access_token")
        private String mAccessToken;

        @Expose
        @SerializedName("api_key")
        private String mApiKey;

        @Expose
        @SerializedName("user_id")
        private Long mUserId;

        public ProtectedApiHeader(String mAccessToken, String mApiKey, Long mUserId){
            this.mAccessToken =mAccessToken;
            this.mApiKey = mApiKey;
            this.mUserId = mUserId;
        }

        public String getmAccessToken() {
            return mAccessToken;
        }

        public void setmAccessToken(String mAccessToken) {
            this.mAccessToken = mAccessToken;
        }

        public String getmApiKey() {
            return mApiKey;
        }

        public void setmApiKey(String mApiKey) {
            this.mApiKey = mApiKey;
        }

        public Long getmUserId() {
            return mUserId;
        }

        public void setmUserId(Long mUserId) {
            this.mUserId = mUserId;
        }
    }

    public static final class PublicApiHeader{

        @Expose
        @SerializedName("api_key")
        private String mApiKey;

        @Inject
        public PublicApiHeader(String mApiKey){
            this.mApiKey = mApiKey;
        }

        public String getmApiKey() {
            return mApiKey;
        }

        public void setmApiKey(String mApiKey) {
            this.mApiKey = mApiKey;
        }
    }
}
