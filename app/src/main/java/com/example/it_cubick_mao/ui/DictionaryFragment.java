package com.example.it_cubick_mao.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.it_cubick_mao.R;
import com.example.it_cubick_mao.databinding.FragmentDictionaryBinding;

public class DictionaryFragment extends Fragment {

    public DictionaryFragment() {
    }

    public static DictionaryFragment newInstance() {
        return new DictionaryFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentDictionaryBinding binding = FragmentDictionaryBinding.inflate(inflater);
        return binding.getRoot();
    }
}