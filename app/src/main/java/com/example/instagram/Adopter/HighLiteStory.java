package com.example.instagram.Adopter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.Model.StoryModel;
import com.example.instagram.R;

import java.util.ArrayList;

public class HighLiteStory extends RecyclerView.Adapter<HighLiteStory.setData> {
    Context context;
    ArrayList<StoryModel> list = new ArrayList<>();
    public HighLiteStory(Context context, ArrayList<StoryModel> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public HighLiteStory.setData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.high_lite_story_item, parent, false);
      return new setData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HighLiteStory.setData holder, int position) {
        StoryModel storymodel = this.list.get(position);
        holder.setImage(storymodel);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class setData extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public setData(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.story_item_image);
            textView = itemView.findViewById(R.id.story_profile_name);
        }

        public void setImage(StoryModel storymodel) {
            textView.setText(storymodel.getName());
            imageView.setImageResource(storymodel.getImage());
        }
    }
}
