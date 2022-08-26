package com.example.bankapp.main.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.bankapp.App;
import com.example.bankapp.Login.LoginActivity;
import com.example.bankapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        MainViewModel mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        //mainViewModel.txtName.observe(this, binding.btnMain::setText);
        mBinding.layoutMain.btnMain.setOnClickListener(view -> openLogin());
    }

    private void openLogin() {
        App.getInstance().getDataManager().clear();
        Intent intent = new Intent(this, LoginActivity.class);
       // intent.putExtra("IS_LOGGED_in", true);
        //intent.getBooleanExtra("IS_Logged_in", false)
        startActivity(intent);
        finishAffinity();
    }
}
