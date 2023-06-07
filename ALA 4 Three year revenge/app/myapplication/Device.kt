package com.example.myapplication


data class Device (

    var devicename: String? = null,
    var ieee: String? = null,
    var access: ArrayList<Access>? = null,

)