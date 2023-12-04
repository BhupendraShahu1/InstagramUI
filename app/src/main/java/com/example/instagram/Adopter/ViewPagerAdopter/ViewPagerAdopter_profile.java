package com.example.instagram.Adopter.ViewPagerAdopter;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.instagram.Fragment.Profile.Mention;
import com.example.instagram.Fragment.Profile.Post;
import com.example.instagram.Fragment.Profile.Reels;

public class ViewPagerAdopter_profile extends FragmentStatePagerAdapter {


    public ViewPagerAdopter_profile(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Post();
        } else if (position==1){
            return new Reels();
        }else {
            return new Mention();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
