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
import com.example.instagram.databinding.FragmentLoginInfoBinding;

public class LoginInfo extends Fragment {
    FragmentLoginInfoBinding loginInfoBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        loginInfoBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_login_info, container, false);
        NavController navController = NavHostFragment.findNavController(this);
        loginInfoBinding.btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_loginInfo_to_mainActivity2);
            }
        });
        return loginInfoBinding.getRoot();
    }
}