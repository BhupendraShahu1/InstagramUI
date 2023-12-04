package com.example.instagram.Adopter;



import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.instagram.Fragment.Home;
import com.example.instagram.Fragment.Massages;

public class ViewPagerAdopter_profile extends FragmentStatePagerAdapter {


    public ViewPagerAdopter_profile(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Home();
        } else if (position==1){
            return new Massages();
        }else {
            return new Home();
        }
    }

    @Override
    public int getCount() {

        return 2;
    }
}
