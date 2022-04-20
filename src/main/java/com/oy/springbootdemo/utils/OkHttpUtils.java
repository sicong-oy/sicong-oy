package com.oy.springbootdemo.utils;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;

import java.io.IOException;
import java.util.Map;

@Slf4j
public class OkHttpUtils {
    public static void sendPost(String url,Map params) {
        OkHttpClient okHttpClient = new OkHttpClient();
        params.put("name", "HTTP");
        params.put("age", "18");

        Request request = new Request.Builder().url(url)
                .post(RequestBody.create(MediaType.get("application/json"), JSONObject.toJSONString(params))).build();

        try (Response response = okHttpClient.newCall(request).execute()) {
            ResponseBody body = response.body();
            if (response.isSuccessful()) {
                log.info("success:{}", body == null ? "" : body.string());
            } else {
                log.error("error,statusCode={},body={}", response.code(), body == null ? "" : body.string());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
