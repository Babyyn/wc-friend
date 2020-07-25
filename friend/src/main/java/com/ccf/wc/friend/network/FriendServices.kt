package com.ccf.wc.friend.network

import com.ccf.wc.baselib.network.HttpClients
import okhttp3.Interceptor
import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object FriendServices {

    private const val BFF_BASE_URL = "http://192.168.0.2:8081"
//    private const val BFF_BASE_URL = "http://127.0.0.1:8081"

    val friendBffService: FriendBffService by lazy {
        Retrofit.Builder()
            .client(HttpClients.newClient {
                addInterceptor(object : Interceptor {
                    override fun intercept(chain: Interceptor.Chain): Response {
                        return chain.proceed(
                            chain.request()
                                .newBuilder()
                                .addHeader("x-module", "friend")
                                .build()
                        )
                    }
                })
            })
            .baseUrl(BFF_BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(FriendBffService::class.java)
    }

}