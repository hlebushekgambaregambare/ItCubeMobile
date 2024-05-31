package com.example.it_cubick_mao.domain.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.it_cubick_mao.domain.models.DictionaryItem;

import java.util.ArrayList;

public class DictionaryViewModel extends ViewModel {

    private MutableLiveData<ArrayList<DictionaryItem>> _words = new MutableLiveData<>(new ArrayList<>());

    public LiveData<ArrayList<DictionaryItem>> words() { return _words; }

}