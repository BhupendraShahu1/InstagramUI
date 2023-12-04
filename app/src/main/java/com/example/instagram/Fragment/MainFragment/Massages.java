package com.example.instagram.Fragment.MainFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.Adopter.HighLiteStory;
import com.example.instagram.Adopter.MessageAdopter;
import com.example.instagram.Model.MessageModel;
import com.example.instagram.Model.StoryModel;
import com.example.instagram.R;

import java.util.ArrayList;


public class Massages extends Fragment {
    HighLiteStory storyAdopter;
    MessageAdopter messageAdopter;
    RecyclerView storyRecyclerView, messageRecyclerView;
    ArrayList<StoryModel> arrayList = new ArrayList();
    ArrayList<MessageModel> messageModelsList = new ArrayList();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_massages, container, false);
        storyRecyclerView = view.findViewById(R.id.message_profile_recycle);
        messageRecyclerView = view.findViewById(R.id.message_recycle);
        storyView();
        messageView();
        return view;
    }

    private void messageView() {
        messageRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        messageAdopter = new MessageAdopter(getContext(), messageModelsList);
        messageModelsList.add(new MessageModel("Mohan", "Sent a reels", "3d", R.drawable.ic_launcher_background));
        messageModelsList.add(new MessageModel("Mohan", "Sent a reels", "3d", R.drawable.ic_launcher_background));
        messageModelsList.add(new MessageModel("Mohan", "Sent a reels", "5d", R.drawable.ic_launcher_background));
        messageModelsList.add(new MessageModel("Mohan", "Sent a reels", "6d", R.drawable.ic_launcher_background));
        messageModelsList.add(new MessageModel("Mohan", "Sent a reels", "7d", R.drawable.ic_launcher_background));
        messageModelsList.add(new MessageModel("Mohan", "Sent a reels", "3d", R.drawable.ic_launcher_background));
        messageModelsList.add(new MessageModel("Mohan", "Sent a reels", "8d", R.drawable.ic_launcher_background));
        messageModelsList.add(new MessageModel("Mohan", "Sent a reels", "3d", R.drawable.ic_launcher_background));
        messageModelsList.add(new MessageModel("Mohan", "Sent a reels", "9d", R.drawable.ic_launcher_background));
        messageModelsList.add(new MessageModel("Mohan", "Sent a reels", "3d", R.drawable.ic_launcher_background));
        messageModelsList.add(new MessageModel("Mohan", "Sent a reels", "3d", R.drawable.ic_launcher_background));
        messageRecyclerView.setAdapter(messageAdopter);
        messageAdopter.notifyDataSetChanged();
    }

    private void storyView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        storyRecyclerView.setLayoutManager(linearLayoutManager);
        storyAdopter = new HighLiteStory(getContext(), arrayList);
        arrayList.add(new StoryModel("Ram", R.drawable.ic_launcher_background));
        arrayList.add(new StoryModel("YourStory", R.drawable.img));
        arrayList.add(new StoryModel("Ashish", R.drawable.img));
        arrayList.add(new StoryModel("Vinod", R.drawable.img));
        arrayList.add(new StoryModel("Ramu", R.drawable.img));
        arrayList.add(new StoryModel("Raju", R.drawable.img));
        arrayList.add(new StoryModel("Rakumar", R.drawable.img));
        arrayList.add(new StoryModel("Ram", R.drawable.ic_launcher_background));
        arrayList.add(new StoryModel("YourStory", R.drawable.img));
        arrayList.add(new StoryModel("Ashish", R.drawable.img));
        arrayList.add(new StoryModel("Vinod", R.drawable.img));
        arrayList.add(new StoryModel("Ramu", R.drawable.img));
        arrayList.add(new StoryModel("Raju", R.drawable.img));
        arrayList.add(new StoryModel("Rakumar", R.drawable.img));
        storyRecyclerView.setAdapter(storyAdopter);
        storyAdopter.notifyDataSetChanged();

    }
}