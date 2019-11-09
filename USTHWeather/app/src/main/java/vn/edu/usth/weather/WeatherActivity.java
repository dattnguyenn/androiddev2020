package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "WeatherActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i(TAG,"this is onCreate Function");
        // Create a new Fragment to be placed in the activity
        ForecastFragment firstFragment = new ForecastFragment();

        // Add the fragment to the 'container' FrameLayout
        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"this is onStart Function");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"this is onResume Function");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"this is onPause Function");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"this is onStop Function");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"this is onDestroy Function");
    }
}
