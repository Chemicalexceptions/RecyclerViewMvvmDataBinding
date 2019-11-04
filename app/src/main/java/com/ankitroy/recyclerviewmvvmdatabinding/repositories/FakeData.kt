package com.ankitroy.recyclerviewmvvmdatabinding.repositories

import com.ankitroy.recyclerviewmvvmdatabinding.model.MyColors

class FakeData {

    fun getColorList(): List<MyColors> {

        var colorList = ArrayList<MyColors>()

        for (i in 0..10) {

            colorList.add(MyColors("color ${i}"))

        }

        return colorList

    }
}