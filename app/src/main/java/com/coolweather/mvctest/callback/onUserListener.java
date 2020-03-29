package com.coolweather.mvctest.callback;

import com.coolweather.mvctest.bean.User;

public interface onUserListener {

    void onBefore();

    void onSuccess(User user);

    void onError(int errorID);
}

