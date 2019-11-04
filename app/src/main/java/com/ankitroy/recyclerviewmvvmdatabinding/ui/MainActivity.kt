package com.ankitroy.recyclerviewmvvmdatabinding.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.ankitroy.recyclerviewmvvmdatabinding.R
import com.ankitroy.recyclerviewmvvmdatabinding.adapters.ColorListAdapter
import com.ankitroy.recyclerviewmvvmdatabinding.adapters.ColorListDataBindingSimpleAdapter
import com.ankitroy.recyclerviewmvvmdatabinding.adapters.ColorListLayoutDataBindingAdapter
import com.ankitroy.recyclerviewmvvmdatabinding.databinding.ActivityMainBinding
import com.ankitroy.recyclerviewmvvmdatabinding.model.MyColors
import com.ankitroy.recyclerviewmvvmdatabinding.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {


    lateinit var viewModel: MainViewModel
    lateinit var dataBinding: ActivityMainBinding

    //adapters
    lateinit var colorAdapter: ColorListAdapter
    lateinit var colorSimpleDataBindingAdapter: ColorListDataBindingSimpleAdapter
    lateinit var colorLayoutBindingAdapter: ColorListLayoutDataBindingAdapter


    var colorList = ArrayList<MyColors>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Accessing viewmodel
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        //init data binding with layout
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        dataBinding.lifecycleOwner = this
        dataBinding.viewmodel = viewModel



        dataBinding.rvMain.layoutManager = LinearLayoutManager(this@MainActivity)

        viewModel.colorList.observe(this, Observer {

            colorList = it as ArrayList<MyColors>
            colorLayoutBindingAdapter = ColorListLayoutDataBindingAdapter(colorList)
            dataBinding.rvMain.adapter = colorLayoutBindingAdapter

        })
        
    }
}
