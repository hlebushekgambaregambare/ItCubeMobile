package com.example.it_cubick_mao.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.it_cubick_mao.R;
import com.example.it_cubick_mao.databinding.FragmentKrBinding;
import com.example.it_cubick_mao.databinding.FragmentScheduleBinding;

public class ScheduleFragment extends Fragment {


    public ScheduleFragment() {
    }

    public static ScheduleFragment newInstance() {
        return new ScheduleFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentScheduleBinding binding = FragmentScheduleBinding.inflate(inflater);
        return binding.getRoot();
    }
}