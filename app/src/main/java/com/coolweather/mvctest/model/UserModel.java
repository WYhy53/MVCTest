package com.coolweather.mvctest.model;
import com.coolweather.mvctest.callback.onUserListener;

public interface UserModel {
    void getUserMsg(String userId , onUserListener listener);
}
