package com.example.it_cubick_mao.domain.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.it_cubick_mao.databinding.DictionaryListBinding;
import com.example.it_cubick_mao.domain.models.DictionaryItem;

import java.util.ArrayList;

public class DictionaryListAdapter extends RecyclerView.Adapter<DictionaryListAdapter.ViewHolder> {

    private ArrayList<DictionaryItem> dictionaryItems;

    public DictionaryListAdapter(ArrayList<DictionaryItem> dictionaryItems) {
        this.dictionaryItems = dictionaryItems;
    }

    @NonNull
    @Override
    public DictionaryListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        DictionaryListBinding binding = DictionaryListBinding.inflate(LayoutInflater.from(parent.getContext()),parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull DictionaryListAdapter.ViewHolder holder, int position) {
        holder.binding.dictionaryName.setText(dictionaryItems.get(position).getSubject());
        holder.binding.getRoot().setOnClickListener(view -> {

        });
    }

    @Override
    public int getItemCount() {
        return dictionary_list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        DictionaryListBinding binding;

        public ViewHolder(@NonNull DictionaryListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
