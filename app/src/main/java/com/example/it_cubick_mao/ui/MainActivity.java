package com.example.it_cubick_mao.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.example.it_cubick_mao.R;
import com.example.it_cubick_mao.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        NavController controller = Navigation.findNavController(this, R.id.bottom_navigation_graph);
        NavigationUI.setupWithNavController(binding.bottomNav, controller);
    }

    @Override
    public boolean onSupportNavigateUp() {
        return Navigation.findNavController(binding.getRoot()).navigateUp();
    }

}