package com.ankitroy.recyclerviewmvvmdatabinding.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.ankitroy.recyclerviewmvvmdatabinding.model.MyColors
import com.ankitroy.recyclerviewmvvmdatabinding.repositories.FakeData

class MainViewModel(application: Application) : AndroidViewModel(application){


    var repo : FakeData = FakeData()

    var colorList = MutableLiveData<List<MyColors>>().apply {

        value = repo.getColorList()

    }


}