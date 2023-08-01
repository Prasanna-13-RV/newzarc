package com.newzarc.newzarcapp.data.datasourceImpl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/newzarc/newzarcapp/data/datasourceImpl/NewsRemoteDataSourceImpl;", "Lcom/newzarc/newzarcapp/data/datasource/NewsRemoteDataSource;", "newsService", "Lcom/newzarc/newzarcapp/data/api/NewsService;", "apiKey", "", "(Lcom/newzarc/newzarcapp/data/api/NewsService;Ljava/lang/String;)V", "getAllNews", "Lretrofit2/Response;", "Lcom/newzarc/newzarcapp/data/model/NewsList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NewsRemoteDataSourceImpl implements com.newzarc.newzarcapp.data.datasource.NewsRemoteDataSource {
    private final com.newzarc.newzarcapp.data.api.NewsService newsService = null;
    private final java.lang.String apiKey = null;
    
    @javax.inject.Inject
    public NewsRemoteDataSourceImpl(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.data.api.NewsService newsService, @org.jetbrains.annotations.NotNull
    java.lang.String apiKey) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAllNews(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.newzarc.newzarcapp.data.model.NewsList>> continuation) {
        return null;
    }
}