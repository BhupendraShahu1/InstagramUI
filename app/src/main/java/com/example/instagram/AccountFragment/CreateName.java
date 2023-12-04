package com.example.instagram.AccountFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import com.example.instagram.R;
import com.example.instagram.databinding.FragmentCreateNameBinding;


public class CreateName extends Fragment {
    FragmentCreateNameBinding fragmentCreateNameBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentCreateNameBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_create_name, container, false);
        NavController navController = NavHostFragment.findNavController(this);
        fragmentCreateNameBinding.createNameNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_createName_to_createPassword);
            }
        });
//        fragmentCreateNameBinding.imgBackName.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                navController.navigate(R.id.action_createName_to_loginFragment);
//            }
//        });
        return fragmentCreateNameBinding.getRoot();
    }

}