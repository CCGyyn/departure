package com.example.dell.networktest;

public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
