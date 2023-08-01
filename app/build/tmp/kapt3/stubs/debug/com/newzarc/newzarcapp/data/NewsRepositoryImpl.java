package com.newzarc.newzarcapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/newzarc/newzarcapp/data/NewsRepositoryImpl;", "Lcom/newzarc/newzarcapp/domain/repository/NewsRepository;", "newsRemoteDataSource", "Lcom/newzarc/newzarcapp/data/datasource/NewsRemoteDataSource;", "newsLocalDataSource", "Lcom/newzarc/newzarcapp/data/datasource/NewsLocalDataSource;", "newsCacheDataSource", "Lcom/newzarc/newzarcapp/data/datasource/NewsCacheDataSource;", "(Lcom/newzarc/newzarcapp/data/datasource/NewsRemoteDataSource;Lcom/newzarc/newzarcapp/data/datasource/NewsLocalDataSource;Lcom/newzarc/newzarcapp/data/datasource/NewsCacheDataSource;)V", "getAllNews", "", "Lcom/newzarc/newzarcapp/data/model/NewsEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewsFromApi", "getNewsFromCache", "getNewsFromRoom", "updateNews", "app_debug"})
public final class NewsRepositoryImpl implements com.newzarc.newzarcapp.domain.repository.NewsRepository {
    private final com.newzarc.newzarcapp.data.datasource.NewsRemoteDataSource newsRemoteDataSource = null;
    private final com.newzarc.newzarcapp.data.datasource.NewsLocalDataSource newsLocalDataSource = null;
    private final com.newzarc.newzarcapp.data.datasource.NewsCacheDataSource newsCacheDataSource = null;
    
    public NewsRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.data.datasource.NewsRemoteDataSource newsRemoteDataSource, @org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.data.datasource.NewsLocalDataSource newsLocalDataSource, @org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.data.datasource.NewsCacheDataSource newsCacheDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAllNews(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.newzarc.newzarcapp.data.model.NewsEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object updateNews(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.newzarc.newzarcapp.data.model.NewsEntity>> continuation) {
        return null;
    }
    
    private final java.lang.Object getNewsFromCache(kotlin.coroutines.Continuation<? super java.util.List<com.newzarc.newzarcapp.data.model.NewsEntity>> continuation) {
        return null;
    }
    
    private final java.lang.Object getNewsFromRoom(kotlin.coroutines.Continuation<? super java.util.List<com.newzarc.newzarcapp.data.model.NewsEntity>> continuation) {
        return null;
    }
    
    private final java.lang.Object getNewsFromApi(kotlin.coroutines.Continuation<? super java.util.List<com.newzarc.newzarcapp.data.model.NewsEntity>> continuation) {
        return null;
    }
}