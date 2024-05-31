package com.example.it_cubick_mao.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.it_cubick_mao.R;
import com.example.it_cubick_mao.databinding.FragmentDictionaryBinding;
import com.example.it_cubick_mao.domain.models.DictionaryItem;
import com.example.it_cubick_mao.domain.viewmodels.DictionaryViewModel;

import java.util.ArrayList;

public class DictionaryFragment extends Fragment {

    private DictionaryViewModel viewModel;
    public ArrayList<DictionaryItem> words = new ArrayList<>();

    public DictionaryFragment() {
    }

    public static DictionaryFragment newInstance() {
        return new DictionaryFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.viewModel = new ViewModelProvider(this).get(DictionaryViewModel.class);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentDictionaryBinding binding = FragmentDictionaryBinding.inflate(inflater);
        viewModel.words().observe(getViewLifecycleOwner(), newData -> {
            words = newData;
        });

        DictionaryAdapter adapter = new DictionaryAdapter(words);
        binding.dictionaryList.setAdapter(adapter);
        return binding.getRoot();
    }
}