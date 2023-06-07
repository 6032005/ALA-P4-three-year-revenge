package com.example.myapplication

import android.content.ContentValues
import android.util.Log
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.sse.EventSource
import okhttp3.sse.EventSourceListener
import java.util.concurrent.TimeUnit

class AppRepository {

    companion object {

        val client = OkHttpClient.Builder().connectTimeout(5, TimeUnit.SECONDS)
            .readTimeout(10, TimeUnit.MINUTES)
            .writeTimeout(10, TimeUnit.MINUTES)
            .build()

        val request = Request.Builder()
            .url("http://192.168.0.100:8000/stream")
            .header("Accept", "application/json; q=0.5")
            .addHeader("Accept", "text/event-stream")
            .build()


    }
}