package com.aslnstbk.tazaaua.common.data

import com.aslnstbk.tazaaua.utils.API_KEY
import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.Response

const val API_KEY_PARAM = "key"

class ApiInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val originalHttpUrl = original.url()

        val url: HttpUrl? =  originalHttpUrl.newBuilder()
            .addQueryParameter(API_KEY_PARAM, API_KEY)
            .build()

        var requestBuilder = original.newBuilder()

        if(url != null){
            requestBuilder = original.newBuilder().url(url)
        }

        return chain.proceed(requestBuilder.build())
    }
}