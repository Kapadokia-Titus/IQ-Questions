package kapadokia.nyandoro.iq_questions.data.model.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class LogoutResponse {

    @Expose
    @SerializedName("message")
    public String message;

    @Expose
    @SerializedName("status_code")
    public String statusCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogoutResponse that = (LogoutResponse) o;

        if (statusCode != null ? !statusCode.equals(that.statusCode) : that.statusCode !=null){
            return false;
        }
        return message !=null ? message.equals(that.message) :that.message == null;
    }

    @Override
    public int hashCode() {
        int results = statusCode !=null ? statusCode.hashCode(): 0;
        results = 31*results +(message !=null ? statusCode.hashCode() : 0);
        return results;
    }

    public String getMessage() {
        return message;
    }

    public String getStatusCode() {
        return statusCode;
    }
}
