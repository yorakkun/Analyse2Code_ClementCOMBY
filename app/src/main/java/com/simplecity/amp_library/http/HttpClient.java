package com.simplecity.amp_library.http;

import com.simplecity.amp_library.http.lastfm.LastFmService;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpClient {

    public static final String TAG = "HttpClient";
    private static final String URL_LAST_FM = "https://ws.audioscrobbler.com/2.0/";
    private static final String URL_ITUNES = "https://itunes.apple.com/search/";

    private OkHttpClient okHttpClient;
    public LastFmService lastFmService;

    public static final String TAG_ARTWORK = "artwork";

    // Utilisation du pattern Singleton avec un holder de classe
    private static class SingletonHolder {
        private static final HttpClient INSTANCE = new HttpClient();
    }

    public static HttpClient getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private HttpClient() {

        okHttpClient = new OkHttpClient.Builder()
                .build();

        Retrofit lastFmRestAdapter = new Retrofit.Builder()
                .baseUrl(URL_LAST_FM)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        lastFmService = lastFmRestAdapter.create(LastFmService.class);
    }
}