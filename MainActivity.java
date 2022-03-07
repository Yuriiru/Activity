package com.example.fff;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.view.Menu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class StartActivity extends Activity {

        public static final String TAG = "StartActivity";

        private Integer count = 5;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Log.d(TAG, "onCreate");
            Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onStart() {
            super.onStart();
            Log.d(TAG, "onStart");
            resetUI();
            Toast.makeText(this, "onStart()", Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onResume() {
            super.onResume();
            Log.d(TAG, "onResume");
            Toast.makeText(this, "onResume()", Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onPause() {
            super.onPause();
            Log.d(TAG, "onPause");
            Toast.makeText(this, "onPause()", Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onStop() {
            super.onStop();
            Log.d(TAG, "onStop");
            Toast.makeText(this, "onStop()", Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onRestart() {
            super.onRestart();
            Log.d(TAG, "onRestart");
            Toast.makeText(this, "onRestart()", Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.d(TAG, "onDestroy");
            Toast.makeText(this, "onDestroy()", Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onSaveInstanceState(Bundle outState) {
            super.onSaveInstanceState(outState);
            outState.putInt("count", count);
            Log.d(TAG, "onSaveInstanceState");
        }

        @Override
        protected void onRestoreInstanceState(Bundle savedInstanceState) {
            super.onRestoreInstanceState(savedInstanceState);
            if (savedInstanceState != null &&
                    savedInstanceState.containsKey("count")) {
                count = savedInstanceState.getInt("count");
            }
            Log.d(TAG, "onRestoreInstanceState");
        }

        private void resetUI() {
            ((TextView) findViewById(R.id.txt_counter)).setText(count.toString());
            Log.d(TAG, "resetUI");
        }
        
    }

}
