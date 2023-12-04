package com.example.instagram.Adopter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.Model.MessageModel;
import com.example.instagram.R;

import java.util.ArrayList;

public class MessageAdopter extends RecyclerView.Adapter<MessageAdopter.setItem> {
    private Context context;

    public MessageAdopter(Context context, ArrayList<MessageModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    private ArrayList<MessageModel> arrayList = new ArrayList<>();

    @NonNull
    @Override
    public MessageAdopter.setItem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.message_item, parent, false);
        return new setItem(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageAdopter.setItem holder, int position) {
        MessageModel model = this.arrayList.get(position);
        holder.setMessageItem(model);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class setItem extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name, day, message;

        public setItem(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.message_profile_image);
            name = itemView.findViewById(R.id.message_profile_name);
            day = itemView.findViewById(R.id.message_time);
            message = itemView.findViewById(R.id.message_details);
        }

        public void setMessageItem(MessageModel model) {
            imageView.setImageResource(model.getProfileImage());
            name.setText(model.getProfileName());
            day.setText(model.getTime());
            message.setText(model.getMessage());
        }
    }
}
