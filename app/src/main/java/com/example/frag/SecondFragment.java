package com.example.frag;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {
    final String LOG_TAG = "MyLogs";


    @Override
    public void onAttach(@NonNull Activity activity) {
        super.onAttach(activity);
        Log.d(LOG_TAG,"fragment2 onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG,"fragment2 onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Log.d(LOG_TAG,"fragment2 onCreateView");
        return inflater.inflate(R.layout.second_fragment,null);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(LOG_TAG,"fragment2 onActivityCreate");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(LOG_TAG,"fragment2 onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(LOG_TAG,"fragment2 onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(LOG_TAG,"fragment2 onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(LOG_TAG,"fragment2 onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG,"fragment2 onDestroy");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(LOG_TAG,"fragment2 onDestroyView");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(LOG_TAG,"fragment2 onDetach");
    }
}
