package com.example.bankapp.Login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.bankapp.Login.ui.LoginViewModel;
import com.example.bankapp.databinding.ActivityLoginBinding;
import com.example.bankapp.main.ui.MainActivity;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        LoginViewModel loginViewModel = new ViewModelProvider(this).get(LoginViewModel.class);

        mBinding.button.setOnClickListener(view -> openMain());

    }
    private void openMain() {
        Intent intent = new Intent(this, MainActivity.class);
        // intent.putExtra("IS_LOGGED_in", true);
        //intent.getBooleanExtra("IS_Logged_in", false)
        startActivity(intent);
        finishAffinity();
    }


}
