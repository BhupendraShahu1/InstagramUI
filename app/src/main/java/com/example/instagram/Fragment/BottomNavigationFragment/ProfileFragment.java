package com.example.instagram.Fragment.BottomNavigationFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.instagram.Adopter.HighLiteStory;
import com.example.instagram.Adopter.ViewPagerAdopter.ViewPagerAdopter_profile;
import com.example.instagram.Model.StoryModel;
import com.example.instagram.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


public class ProfileFragment extends Fragment {
    HighLiteStory storyAdopter;
    RecyclerView storyRecyclerView;
    ViewPager viewPager;
    ArrayList<StoryModel> arrayList = new ArrayList();
    TabLayout tabLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        storyRecyclerView = view.findViewById(R.id.profile_highLiteStory_recycle);
        viewPager = view.findViewById(R.id.profile_post_viewPager);
        tabLayout = view.findViewById(R.id.tabs);
        setStory();
        viewPager();
        return view;
    }

    private void viewPager() {

        ViewPagerAdopter_profile viewPagerAdopterProfile = new ViewPagerAdopter_profile(getChildFragmentManager());
        viewPager.setAdapter(viewPagerAdopterProfile);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_reel);
        tabLayout.getTabAt(2).setIcon(R.drawable.profile_icon);
    }

    private void setStory() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        storyRecyclerView.setLayoutManager(linearLayoutManager);
        storyAdopter = new HighLiteStory(getContext(), arrayList);
        arrayList.add(new StoryModel("YourStory", R.drawable.img));
        arrayList.add(new StoryModel("Ashish", R.drawable.img));
        arrayList.add(new StoryModel("Vinod", R.drawable.img));
        arrayList.add(new StoryModel("Vijay", R.drawable.img));
        arrayList.add(new StoryModel("Ramu", R.drawable.img));
        arrayList.add(new StoryModel("Raju", R.drawable.img));
        arrayList.add(new StoryModel("RamSing", R.drawable.img));
        arrayList.add(new StoryModel("Rajkumar", R.drawable.img));
        storyRecyclerView.setAdapter(storyAdopter);
        storyAdopter.notifyDataSetChanged();

    }
}