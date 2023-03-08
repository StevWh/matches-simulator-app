package me.dio.simulator;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import me.dio.simulator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding baindig;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        baindig = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(baindig.getRoot());

    }
}
