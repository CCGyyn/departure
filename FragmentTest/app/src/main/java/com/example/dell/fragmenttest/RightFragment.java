package com.example.dell.fragmenttest;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RightFragment extends Fragment {

    private final String TAG = "RightFragment";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG,TAG + "-onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,TAG + "-onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.right_fragment, container, false);
        Log.d(TAG,TAG + "-onCreateView");
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG,TAG + "-onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG,TAG + "-onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG,TAG + "-onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG,TAG + "-onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG,TAG + "-onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(TAG,TAG + "-onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG,TAG + "-onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG,TAG + "-onDetach");
    }
}
