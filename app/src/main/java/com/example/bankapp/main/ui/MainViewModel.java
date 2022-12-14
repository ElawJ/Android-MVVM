package com.example.bankapp.main.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.bankapp.App;

public class MainViewModel extends ViewModel {
    public MutableLiveData<String> txtName = new MutableLiveData<>();

    public MainViewModel() {
        setName();
    }

    public void setName() {
        String name = "Jerub";
        if (App.getInstance().getDataManager().getNameState())
            name = "Elias";
        txtName.setValue(name);
    }

    public void onClickName() {
        Boolean isFather = App.getInstance().getDataManager().getNameState();
        App.getInstance().getDataManager().setNameState(!isFather);
        setName();
    }

}

