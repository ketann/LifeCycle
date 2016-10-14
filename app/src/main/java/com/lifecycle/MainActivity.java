package com.lifecycle;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.lifecycle.Activity.SecondActivity;
import com.lifecycle.Fragment.FragmentA;


public class MainActivity extends FragmentActivity {

    // Activity lifecycle

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity --->", "onCreate");

        //Calling a fragment from activityMain

        FragmentA fragmentA = new FragmentA();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.activity_main, fragmentA, "TestFragmnet");
        transaction.commit();


        Button button = (Button) findViewById(R.id.btn_call_acvitiy_cecond);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
                finish();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity --->", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity --->", "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity --->", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity --->", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity --->", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity --->", "onDestroy");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d("MainActivity", "onSaveInstanceState");
    }

    @Override
    public void onStateNotSaved() {
        super.onStateNotSaved();
        Log.d("MainActivity", "onStateNotSaved");

    }
}
