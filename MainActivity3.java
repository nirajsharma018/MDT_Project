package com.example.mdt_android;


import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView btn1 = findViewById(R.id.btn1);
        btn1.setText(getSystemDetail());
    }

    @SuppressLint("HardwareIds")
    private String getSystemDetail() {
        return "Brand: " + Build.BRAND + "\n" +
                "DeviceID: " + Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID) + "\n" +
                "Model: " + Build.MODEL + "\n" +
                "ID: " + Build.ID + "\n" +
                "SDK: " + Build.VERSION.SDK_INT + "\n" +
                "Manufacture: " + Build.MANUFACTURER + "\n" +
                "Brand: " + Build.BRAND + "\n" +
                "User: " + Build.USER + "\n" +
                "Type: " + Build.TYPE + "\n" +
                "Base: " + Build.VERSION_CODES.BASE + "\n" +
                "Incremental: " + Build.VERSION.INCREMENTAL + "\n" +
                "Board: " + Build.BOARD + "\n" +
                "Host: " + Build.HOST + "\n" +
                "FingerPrint: " + Build.FINGERPRINT + "\n" +
                "Version Code: " + Build.VERSION.RELEASE;
    }
}
