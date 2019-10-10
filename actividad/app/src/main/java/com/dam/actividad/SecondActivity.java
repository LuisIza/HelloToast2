package com.dam.actividad;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    private static final String LOG_TAG = SecondActivity.class.getSimpleName();

    protected void onCreate(Bundle savedInstanceState) {

        Log.i(LOG_TAG,"SEGUNDA ACTIVIDAD CREADA");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onStart(){
        super.onStart();

        Log.i(LOG_TAG, "onStart");
    }

    @Override
    public void  onResume(){

        Log.i(LOG_TAG, "onResume");
        super.onResume();
    }
    @Override
    public void  onPause(){

        Log.i(LOG_TAG, "onPause");
        super.onPause();
    }
    @Override
    public void  onRestart(){

        Log.i(LOG_TAG, "onRestart");
        super.onRestart();
    }
    @Override
    public void  onStop(){

        Log.i(LOG_TAG, "onStop");
        super.onStop();
    }
    @Override
    public void  onDestroy(){

        Log.i(LOG_TAG, "onDestroy");
        super.onDestroy();
    }
}
