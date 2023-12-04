package com.example.instagram.NavigateFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.instagram.Adopter.ReelsAdopter;
import com.example.instagram.Model.ReelsModel;
import com.example.instagram.R;
import com.example.instagram.databinding.FragmentReelsBinding;

import java.util.ArrayList;


public class Reels extends Fragment {
    ReelsAdopter reelsAdopter;
    FragmentReelsBinding reelsBinding;
    ArrayList<ReelsModel> arrayList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        reelsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_reels, container, false);
        reels();
        return reelsBinding.getRoot();
    }

    private void reels() {
        reelsBinding.reelsRecycle.setLayoutManager(new LinearLayoutManager(getContext()));
        reelsAdopter = new ReelsAdopter(arrayList, getContext());
        arrayList.add(new ReelsModel(R.drawable.ic_launcher_background, "Raju", "nothing", "56.7K", "1h", "34.2k", R.drawable.ic_launcher_background, "23.4k"));
        arrayList.add(new ReelsModel(R.drawable.ic_launcher_background, "Ramu", "nothing", "56.7K", "3h", "34.2k", R.drawable.ic_launcher_background, "23.4k"));
        arrayList.add(new ReelsModel(R.drawable.ic_launcher_background, "Mohan", "nothing", "56.7K", "5d", "3.2k", R.drawable.ic_launcher_background, "23.4k"));
        arrayList.add(new ReelsModel(R.drawable.ic_launcher_background, "Sita", "nothing", "56.7K", "7m", "35.2k", R.drawable.ic_launcher_background, "23.4k"));
        arrayList.add(new ReelsModel(R.drawable.ic_launcher_background, "Gita", "nothing", "56.7K", "5h", "36.2k", R.drawable.ic_launcher_background, "23.4k"));
        arrayList.add(new ReelsModel(R.drawable.ic_launcher_background, "Renu", "nothing", "56.7K", "45m", "37.2k", R.drawable.ic_launcher_background, "23.4k"));
        arrayList.add(new ReelsModel(R.drawable.ic_launcher_background, "Priyanka", "nothing", "56.7K", "1h", "4.2k", R.drawable.ic_launcher_background, "23.4k"));
        arrayList.add(new ReelsModel(R.drawable.ic_launcher_background, "parul", "nothing", "56.7K", "23d", "39.2k", R.drawable.ic_launcher_background, "23.4k"));
        arrayList.add(new ReelsModel(R.drawable.ic_launcher_background, "bhumika", "nothing", "56.7K", "1d", "94.2k", R.drawable.ic_launcher_background, "23.4k"));
        arrayList.add(new ReelsModel(R.drawable.ic_launcher_background, "Bhupendra", "nothing", "56.7K", "45h", "94.2k", R.drawable.ic_launcher_background, "23.4k"));
        arrayList.add(new ReelsModel(R.drawable.ic_launcher_background, "Atul", "nothing", "56.7K", "4m", "340.2k", R.drawable.ic_launcher_background, "23.4k"));
        arrayList.add(new ReelsModel(R.drawable.ic_launcher_background, "Vinod", "nothing", "56.7K", "1y", "349.2k", R.drawable.ic_launcher_background, "23.4k"));
        reelsBinding.reelsRecycle.setAdapter(reelsAdopter);
        reelsAdopter.notifyDataSetChanged();
    }
}