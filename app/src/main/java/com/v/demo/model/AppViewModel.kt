package com.v.demo.model

import androidx.lifecycle.MutableLiveData
import com.v.base.BaseViewModel

/**
 * @Author : ww
 * desc    :
 * time    : 2021/1/27 14:55
 */
class AppViewModel: BaseViewModel() {

    var string = MutableLiveData<String>()
}