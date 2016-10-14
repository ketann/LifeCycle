package com.lifecycle.Fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lifecycle.R;

/**
 * Created by GURUKRUPA on 10/14/2016.
 */

public class FragmentA extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("Fragment ", "onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Fragment ", "onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i("Fragment", "onCreateView");
        return inflater.inflate(R.layout.fragment_a,container, false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("Fragment", "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("Fragment", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("Fragment", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("Fragment", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("Fragment", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("Fragment", "onDestroyView");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Fragment", "onDestroy");
    }


    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("Fragment", "onDetach");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("Fragment", "onSaveInstanceState");
    }

}
