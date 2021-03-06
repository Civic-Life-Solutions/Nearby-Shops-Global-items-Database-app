package nbsidb.nearbyshops.org.RetrofitRestContractRoles;

import nbsidb.nearbyshops.org.ModelRoles.Admin;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PUT;
import rx.Observable;

/**
 * Created by sumeet on 12/3/16.
 */
public interface AdminServiceSimple {

    @GET("/api/v1/Admin/Login")
    Call<Admin> getAdmin(@Header("Authorization") String headers);

    
    @PUT("/api/v1/Admin/{id}")
    Call<ResponseBody> putShop(@Header("Authorization") String headers,
                               @Body Admin admin);
}
