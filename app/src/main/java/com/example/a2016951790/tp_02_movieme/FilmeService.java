package com.example.a2016951790.tp_02_movieme;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by a2016951790 on 14/08/18.
 */

public interface FilmeService {
    @GET("3/movie/popular?api_key=7bd6324cd7f2a1ec966c76a434e3c24e&language=en-US&page=1")
    Call<List<Filme>> getFilme();
}