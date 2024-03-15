package com.example.mdt_android;

import android.os.BatteryManager;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {
    int view = R.layout.activity_main5;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(view);
        text = findViewById(R.id.text);
        BatteryManager bm = (BatteryManager)getSystemService(BATTERY_SERVICE);
        int percentage = bm.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);
        text.setText("Battery Percentage is "+percentage+" %");
    }
}