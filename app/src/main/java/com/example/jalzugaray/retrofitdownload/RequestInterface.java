package com.example.jalzugaray.retrofitdownload;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Streaming;

/**
 * Created by jalzugaray on 09/05/2018.
 */

public interface RequestInterface {
    @GET("files/Node-Android-Chat.zip")
    @Streaming
    Call<ResponseBody> downloadFile();
}
