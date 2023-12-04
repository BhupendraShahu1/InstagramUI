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

public class StoryAdopter extends RecyclerView.Adapter<StoryAdopter.setItem> {
    Context context;

    public StoryAdopter(Context context, ArrayList<StoryModel> list) {
        this.context = context;
        this.list = list;
    }

    ArrayList<StoryModel> list = new ArrayList<>();

    @NonNull
    @Override
    public setItem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.story_item_layout, parent, false);
        return new setItem(view);
    }

    @Override
    public void onBindViewHolder(@NonNull setItem holder, int position) {
        StoryModel storymodel = this.list.get(position);
        holder.setImage(storymodel);
        if (holder.getAdapterPosition() == 0) {
            holder.story_icon.setVisibility(View.VISIBLE);
            holder.yourStoryImage.setVisibility(View.VISIBLE);
            holder.textView.setVisibility(View.GONE);
            holder.yourStoryName.setVisibility(View.VISIBLE);
            holder.constraintLayout.setVisibility(View.GONE);
        } else {
            holder.story_icon.setVisibility(View.GONE);
            holder.yourStoryName.setVisibility(View.GONE);
            holder.yourStoryImage.setVisibility(View.GONE);
            holder.textView.setVisibility(View.VISIBLE);
            holder.constraintLayout.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class setItem extends RecyclerView.ViewHolder {
            ImageView imageView, story_icon, yourStoryImage;
            TextView textView, yourStoryName;
            ConstraintLayout constraintLayout;

        public setItem(@NonNull View itemView) {
            super(itemView);
            yourStoryName = itemView.findViewById(R.id.your_story_profile_name);
            yourStoryImage = itemView.findViewById(R.id.your_story_item_image);
            constraintLayout = itemView.findViewById(R.id.constraint_shape);
            story_icon = itemView.findViewById(R.id.add_story);
            imageView = itemView.findViewById(R.id.story_item_image);
            textView = itemView.findViewById(R.id.story_profile_name);
        }

        public void setImage(StoryModel storymodel) {
            textView.setText(storymodel.getName());
            imageView.setImageResource(storymodel.getImage());
        }
    }
}
