package com.example.instagram.Adopter.ViewPagerAdopter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.instagram.Fragment.MainFragment.Home;
import com.example.instagram.Fragment.MainFragment.Massages;

public class ViewPagerAdopter extends FragmentStatePagerAdapter {


    public ViewPagerAdopter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Home();
        } else {
            return new Massages();
        }
    }

    @Override
    public int getCount() {

        return 2;
    }
}
