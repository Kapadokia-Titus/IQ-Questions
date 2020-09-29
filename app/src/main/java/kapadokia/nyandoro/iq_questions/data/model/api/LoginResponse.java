package kapadokia.nyandoro.iq_questions.data.model.api;

import androidx.annotation.Nullable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public final class LoginResponse {

    private LoginResponse(){
        // this class is not publicly instantiable
    }

    @Expose
    @SerializedName("access_token")
    private String accessToken;
    @Expose
    @SerializedName("fb_profile_pic_url")
    private String fbProfileUrl;
    @Expose
    @SerializedName("google_profile_pic_url")
    private String googleProfileUrl;
    @Expose
    @SerializedName("message")
    private String message;
    @Expose
    @SerializedName("server_profile_pic_url")
    private String serverProfilePicUrl;
    @Expose
    @SerializedName("status_code")
    private String statusCode;
    @Expose
    @SerializedName("email")
    private String userEmail;
    @Expose
    @SerializedName("user_id")
    private Long userId;
    @Expose
    @SerializedName("user_name")
    private String userName;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginResponse that = (LoginResponse) o;

        if (statusCode !=null? !statusCode.equals(that.statusCode): that.statusCode==null){
            return false;
        }
        if (userId !=null? !userId.equals(that.userId): that.userId==null){
            return false;
        }
        if (accessToken !=null? !accessToken.equals(that.accessToken): that.accessToken==null){
            return false;
        }
        if (userName !=null? !userName.equals(that.userName): that.userName==null){
            return false;
        }
        if (userEmail !=null? !userEmail.equals(that.userEmail): that.userEmail==null){
            return false;
        }
        if (serverProfilePicUrl !=null? !serverProfilePicUrl.equals(that.serverProfilePicUrl): that.serverProfilePicUrl==null){
            return false;
        }
        if (fbProfileUrl !=null? !fbProfileUrl.equals(that.fbProfileUrl): that.fbProfileUrl==null){
            return false;
        }
        if (googleProfileUrl !=null? !googleProfileUrl.equals(that.googleProfileUrl): that.googleProfileUrl==null){
            return false;
        }
        return message !=null ? message.equals(that.message) : that.message==null;
    }

    @Override
    public int hashCode() {

        int result = statusCode !=null ? statusCode.hashCode():0;
        result = 31 * result +(userId !=null ? userId.hashCode() : 0);
        result = 31 * result +(accessToken !=null ? accessToken.hashCode() : 0);
        result = 31 * result +(userName !=null ? userName.hashCode() : 0);
        result = 31 * result +(userEmail !=null ? userEmail.hashCode() : 0);
        result = 31 * result +(serverProfilePicUrl !=null ? serverProfilePicUrl.hashCode() : 0);
        result = 31 * result +(googleProfileUrl !=null ? googleProfileUrl.hashCode() : 0);
        result = 31 * result +(fbProfileUrl !=null ? fbProfileUrl.hashCode() : 0);
        result = 31 * result +(message !=null ? message.hashCode() : 0);
        return result;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getFbProfileUrl() {
        return fbProfileUrl;
    }

    public String getGoogleProfileUrl() {
        return googleProfileUrl;
    }

    public String getMessage() {
        return message;
    }

    public String getServerProfilePicUrl() {
        return serverProfilePicUrl;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
}
