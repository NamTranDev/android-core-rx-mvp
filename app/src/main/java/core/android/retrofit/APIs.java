package core.android.retrofit;

import core.android.model.entity.mockup.Account;
import core.android.model.entity.mockup.Token;

import io.reactivex.Flowable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface APIs {
    @POST("/api/login")
    @Headers("Content-Type: application/json")
    Flowable<Token> mockup(@Body Account account);

    @GET("aaaaa/{email}")
    Flowable<Boolean> isAccountActive(@Path("email") String email);
}
