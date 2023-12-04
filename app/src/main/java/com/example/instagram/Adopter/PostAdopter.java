package com.example.instagram.Adopter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.Model.PostModel;
import com.example.instagram.R;

import java.util.ArrayList;

public class PostAdopter extends RecyclerView.Adapter<PostAdopter.setItem> {
    ArrayList<PostModel> arrayList = new ArrayList<>();

    public PostAdopter(ArrayList<PostModel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    private Context context;

    @NonNull
    @Override
    public PostAdopter.setItem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.post_item, parent, false);
        return new setItem(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdopter.setItem holder, int position) {
        PostModel postModel = this.arrayList.get(position);
        holder.setItemView(postModel);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class setItem extends RecyclerView.ViewHolder {
        ImageView profileImage, postImage;
        TextView like, comment, time, profileName, location;

        public setItem(@NonNull View itemView) {
            super(itemView);
            profileImage = itemView.findViewById(R.id.post_profile_image);
//            postImage = itemView.findViewById(R.id.post_image_view);
//            like = itemView.findViewById(R.id.post_like_text);
//            comment = itemView.findViewById(R.id.post_comment_text);
//            time = itemView.findViewById(R.id.day);
//            profileName = itemView.findViewById(R.id.post_profile_name);
//            location = itemView.findViewById(R.id.post_location);
        }

        public void setItemView(PostModel postModel) {
//            profileImage.setImageResource(postModel.getProfileImage());
//            postImage.setImageResource(postModel.getProfileImage());
//            like.setText(postModel.getLike());
//            comment.setText(postModel.getComment());
//            time.setText(postModel.getDay());
//            profileName.setText(postModel.getName());
//            location.setText(postModel.getLocation());
        }
    }
}
