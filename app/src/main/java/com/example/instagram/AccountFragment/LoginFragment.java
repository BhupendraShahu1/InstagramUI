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
import com.example.instagram.databinding.FragmentLoginBinding;

public class LoginFragment extends Fragment {
    FragmentLoginBinding fragmentLoginBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentLoginBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false);
        NavController navController = NavHostFragment.findNavController(this);
        fragmentLoginBinding.createNewAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_loginFragment_to_createName);
            }
        });
        fragmentLoginBinding.btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_loginFragment_to_mainActivity);

            }
        });
        return fragmentLoginBinding.getRoot();
    }

}