package com.example.student.android_fragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment_Above fragment_above = new Fragment_Above();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment, fragment_above)
                .commit();
    }
}
