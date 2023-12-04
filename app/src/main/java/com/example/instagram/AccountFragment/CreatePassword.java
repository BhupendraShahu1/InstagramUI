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
import com.example.instagram.databinding.FragmentCreatePasswordBinding;


public class CreatePassword extends Fragment {

    FragmentCreatePasswordBinding createPasswordBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        createPasswordBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_create_password, container, false);
        NavController navController = NavHostFragment.findNavController(this);
        createPasswordBinding.createPasswordNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_createPassword_to_loginInfo);
            }
        });
        return createPasswordBinding.getRoot();
    }
}