package com.example.instagram.Fragment.BottomNavigationFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram.Adopter.PostAdopter;
import com.example.instagram.Adopter.StoryAdopter;
import com.example.instagram.Model.PostModel;
import com.example.instagram.Model.StoryModel;
import com.example.instagram.R;

import java.util.ArrayList;


public class HomeViewFragment extends Fragment {
    StoryAdopter storyAdopter;
    RecyclerView storyRecyclerView, postRecyclerView;
    PostAdopter postAdopter;
    ArrayList<StoryModel> arrayList = new ArrayList();
    ArrayList<PostModel> arrayPost = new ArrayList();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_view_fragmnet, container, false);
        storyRecyclerView = view.findViewById(R.id.story_recyclerView);
        postRecyclerView = view.findViewById(R.id.homeRecycle);
        setStory();
        setPost();
        return view;
    }

    private void setPost() {
        postRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        postAdopter = new PostAdopter(arrayPost, getContext());
        arrayPost.add(new PostModel(R.drawable.ic_launcher_background, "Ram", "andka", "1M", "2", "3"));
        arrayPost.add(new PostModel(R.drawable.ic_launcher_background, "Ram", "andka", "1M", "2", "3"));
        arrayPost.add(new PostModel(R.drawable.ic_launcher_background, "Ram", "andka", "1M", "2", "3"));
        postRecyclerView.setAdapter(postAdopter);
        postAdopter.notifyDataSetChanged();
    }

    private void setStory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        storyRecyclerView.setLayoutManager(linearLayoutManager);
        storyAdopter = new StoryAdopter(getContext(), arrayList);
        arrayList.add(new StoryModel("YourStory", R.drawable.img));
        arrayList.add(new StoryModel("Ashish", R.drawable.img));
        arrayList.add(new StoryModel("Vinod", R.drawable.img));
        arrayList.add(new StoryModel("Vijay", R.drawable.ic_launcher_background));
        arrayList.add(new StoryModel("Ramu", R.drawable.img));
        arrayList.add(new StoryModel("Raju", R.drawable.img));
        arrayList.add(new StoryModel("RamSingh", R.drawable.ic_launcher_background));
        arrayList.add(new StoryModel("Rakumar", R.drawable.img));
        storyRecyclerView.setAdapter(storyAdopter);
        storyAdopter.notifyDataSetChanged();

    }
}