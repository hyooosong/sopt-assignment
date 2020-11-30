package com.example.onsopt_1st.api

import android.app.Application
import android.renderscript.Sampler
import android.widget.Toast
import okhttp3.ResponseBody
import org.json.JSONObject
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object SoptServiceImpl {
    private const val BASE_URL="http://15.164.83.210:3000"

    private val retrofit : Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service : SoptService = retrofit.create(SoptService::class.java)

}