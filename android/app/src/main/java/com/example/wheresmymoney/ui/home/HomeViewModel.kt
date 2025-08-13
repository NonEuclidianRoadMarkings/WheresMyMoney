package com.example.wheresmymoney.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Oompah, loompah, dupity-do, we have some pension values for you!"
    }
    val text: LiveData<String> = _text
}