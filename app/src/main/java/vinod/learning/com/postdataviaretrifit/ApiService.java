package vinod.learning.com.postdataviaretrifit;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {

    @POST("/posts")
    @FormUrlEncoded
    Call<PostPoja> savePost(@Field("title") String title,
                            @Field("body") String body,
                            @Field("userId") long userId);
}
