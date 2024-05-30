package com.example.it_cubick_mao.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.it_cubick_mao.databinding.DictionaryListBinding;
import com.example.it_cubick_mao.domain.models.DictionaryItem;

import java.util.ArrayList;

public class DictionaryAdapter extends RecyclerView.Adapter<DictionaryAdapter.ViewHolder> {

    private ArrayList<DictionaryItem> words;

    public DictionaryAdapter(ArrayList<DictionaryItem> words) {
        this.words = words;
    }

    @NonNull
    @Override
    public DictionaryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(DictionaryListBinding.inflate(LayoutInflater.from(parent.getContext())));
    }

    @Override
    public void onBindViewHolder(@NonNull DictionaryAdapter.ViewHolder holder, int position) {
        holder.binding.deutsch.setText(words.get(position).getDeutschWord());
        holder.binding.russish.setText(words.get(position).getRussianWord());
        holder.binding.english.setText(words.get(position).getEnglishWord());
        holder.binding.subjectText.setText(words.get(position).getSubject());
    }

    @Override
    public int getItemCount() {
        return words.size();
    }

    public void updateData(ArrayList<DictionaryItem> items) {
        this.words = items;
        this.notifyDataSetChanged();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        DictionaryListBinding binding;
        public ViewHolder(@NonNull DictionaryListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}

