package com.zhy.databinding

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class User(name: String, age: Int) : BaseObservable() {

    @Bindable
    var name: String = name
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }


    @Bindable
    var age: Int = age
        set(value) {
            field = value
            notifyPropertyChanged(BR.age)
        }
}