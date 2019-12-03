package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;


public class WeatherActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private Adapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("My_Tag", "This is on start");
        viewPager = findViewById(R.id.weatherForecastViewPager);
        adapter = new Adapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        MediaPlayer mediaPlayer = MediaPlayer.create(WeatherActivity.this, R.raw.thememusic);
        mediaPlayer.start();

        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);


//        forecast_fragment forecastFragment = new forecast_fragment();
//        getSupportFragmentManager().beginTransaction().add(R.id.fragment2, forecastFragment).commit();
//
//        WeatherFragment weatherFragment = new WeatherFragment();
//        getSupportFragmentManager().beginTransaction().add(R.id.weatherFragment, weatherFragment).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.setting_action: {
                // do your sign-out stuff
                startActivities(new Intent[]{new Intent(getApplicationContext(), PrefActivity.class)});
                break;
            }
            case R.id.action_refresh: {
                Toast.makeText(getApplicationContext(), R.string.refresh_mess, Toast.LENGTH_LONG).show();
                break;
            }
            // case blocks for other MenuItems (if any)
        }
        return true;
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("My_Tag", "This is on start");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("My_Tag", "This is on resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("My_Tag", "This is on restart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("My_Tag", "This is on Pause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("My_Tag", "This is on Stop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("My_Tag", "This is on destroy");
    }

}