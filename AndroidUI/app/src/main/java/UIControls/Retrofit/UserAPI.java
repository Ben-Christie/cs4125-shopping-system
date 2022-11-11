package UIControls.Retrofit;

import java.util.List;

import UIControls.Entity.UserEntity;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.Call;
import retrofit2.http.POST;

public interface UserAPI {

    @GET("/Database/get-all")
    Call<List<UserEntity>> getAllUsers();

    @POST("/User/CreateUser")
    Call<Boolean> save(@Body UserEntity userEntity);
}
