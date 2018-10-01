package home.learn.hmt.soapimei.data;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

public interface APIInterface {
    // a có thể thay ở đây
    @POST("/api/users")
    @FormUrlEncoded
    Observable<String> sendImeiPhone(@Field("imei") String imei);
}
