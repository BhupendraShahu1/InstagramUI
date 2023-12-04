package com.example.instagram.Adopter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.Model.PostModel;
import com.example.instagram.Model.ReelsModel;
import com.example.instagram.R;
import com.example.instagram.databinding.ReelsItemBinding;

import java.util.ArrayList;

public class ReelsAdopter extends RecyclerView.Adapter<ReelsAdopter.setItemView> {
    ArrayList<ReelsModel> arrayList = new ArrayList<>();

    public ReelsAdopter(ArrayList<ReelsModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    Context context;

    @NonNull
    @Override
    public ReelsAdopter.setItemView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.reels_item, parent, false);
        return new setItemView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReelsAdopter.setItemView holder, int position) {
        ReelsModel reelsModel = this.arrayList.get(position);
        holder.setModelItem(reelsModel);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class setItemView extends RecyclerView.ViewHolder {
        ReelsItemBinding binding;

        public setItemView(@NonNull View itemView) {
            super(itemView);
            binding = ReelsItemBinding.bind(itemView);
        }

        public void setModelItem(ReelsModel reelsModel) {

            binding.reelsCommentText.setText(reelsModel.getComment());
            binding.reelsLikesText.setText(reelsModel.getLike());
            binding.reelsSendText.setText(reelsModel.getSend());

        }
    }
}
