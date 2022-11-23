package UIControls.Retrofit;

import UIControls.DTO.UserDTO;
import retrofit2.http.Body;
import retrofit2.Call;
import retrofit2.http.POST;

public interface UserAPI {
    @POST("/User/VerifyCreds")
    Call<Boolean> veriftyCreds(@Body UserDTO userDTO);

    @POST("/User/CreateUser")
    Call<Boolean> save(@Body UserDTO userDTO);
}
