package com.hasnanurhanifah_18102124.praktikum14.api

import com.hasnanurhanifah_18102124.praktikum14.CoroutineContextProvider
import com.hasnanurhanifah_18102124.praktikum14.`interface`.MainView
import com.hasnanurhanifah_18102124.praktikum14.model.QuoteResponse
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainPresenter(
    private val view: MainView,
    private val context: CoroutineContextProvider = CoroutineContextProvider()
) {

    fun getMyQuotes(token: String?) {
        GlobalScope.launch(context.main) {
            try {
                ApiMain().services.getMyQuotes("Bearer " + token).enqueue(object :
                    Callback<QuoteResponse> {
                    override fun onResponse(
                        call: Call<QuoteResponse>, response:
                        Response<QuoteResponse>
                    ) {
                        if (response.code() == 200) {
                            response.body()?.quotes?.let {
                                view.resultQuote(it)
                            }
                        }
                    }

                    override fun onFailure(call: Call<QuoteResponse>, t: Throwable) {
                        view.showMessage("Koneksi Terputus")
                    }
                })
            } catch (e: Exception) {
            }
        }
    }
}