package com.coolweather.mvctest.model;

import android.text.TextUtils;

import com.coolweather.mvctest.bean.User;
import com.coolweather.mvctest.callback.onUserListener;

public class UserModelImpl implements UserModel {
    public static final int USERID_IS_EMPTY = 1;
    public static final int USER_IS_INVALID = 2;

    @Override
    public void getUserMsg(String userId, final  onUserListener listener) {

        if (TextUtils.isEmpty(userId)) {
            listener.onError(USERID_IS_EMPTY);
            return;
        }

        if (listener == null) return;

        listener.onBefore();
        //这里模拟网络耗时操作,实际开发中绝对不要这样直接new Thread
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                User user = new User();
                user.setUserId("12");
                user.setUserName("WY");
                user.setAge("18");
                user.setSex("0");
                user.setJob("码农");

                if (user == null) {
                    listener.onError(USER_IS_INVALID);
                } else {
                    listener.onSuccess(user);
                }

            }
        }).start();

    }
}
