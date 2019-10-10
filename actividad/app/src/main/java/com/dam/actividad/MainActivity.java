package com.dam.actividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    final String LOG_TAG="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d(LOG_TAG,"PRIMERA ACTIVIDAD CREADA");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btn);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inttent = new Intent(v.getContext(), SecondActivity.class);
                startActivityForResult(inttent, 0);
            }
        });

    }

    @Override
    public void onStart(){
        super.onStart();

        Log.d(LOG_TAG, "onStart");
    }

    @Override
    public void  onResume(){

        Log.d(LOG_TAG, "onResume");
        super.onResume();
    }
    @Override
    public void  onPause(){

        Log.d(LOG_TAG, "onPause");
        super.onPause();
    }
    @Override
    public void  onRestart(){

        Log.d(LOG_TAG, "onRestart");
        super.onRestart();
    }
    @Override
    public void  onStop(){

        Log.d(LOG_TAG, "onStop");
        super.onStop();
    }
    @Override
    public void  onDestroy(){

        Log.d(LOG_TAG, "onDestroy");
        super.onDestroy();
    }

}
