package kapadokia.nyandoro.iq_questions.data.remote;

import io.reactivex.Single;
import kapadokia.nyandoro.iq_questions.data.model.api.BlogResponse;
import kapadokia.nyandoro.iq_questions.data.model.api.LoginRequest;
import kapadokia.nyandoro.iq_questions.data.model.api.LoginResponse;
import kapadokia.nyandoro.iq_questions.data.model.api.LogoutResponse;
import kapadokia.nyandoro.iq_questions.data.model.api.OpenSourceResponse;

public interface ApiHelper {
    Single<LoginResponse> doFacebookLoginApiCall(LoginRequest.FacebookLoginRequest request);

    Single<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest request);

    Single<LogoutResponse> doLogoutApiCall();

    Single<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest request);

    ApiHeader getApiHeader();

    Single<BlogResponse> getBlogApiCall();

    Single<OpenSourceResponse> getOpenSourceApiCall();
}
