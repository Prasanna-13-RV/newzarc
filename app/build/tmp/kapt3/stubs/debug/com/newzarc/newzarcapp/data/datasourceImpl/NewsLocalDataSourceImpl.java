package com.newzarc.newzarcapp.data.datasourceImpl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/newzarc/newzarcapp/data/datasourceImpl/NewsLocalDataSourceImpl;", "Lcom/newzarc/newzarcapp/data/datasource/NewsLocalDataSource;", "newsDao", "Lcom/newzarc/newzarcapp/data/db/NewsDao;", "(Lcom/newzarc/newzarcapp/data/db/NewsDao;)V", "clearDb", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewsFromDb", "", "Lcom/newzarc/newzarcapp/data/model/news/NewsEntity;", "saveNewsFromDb", "news", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NewsLocalDataSourceImpl implements com.newzarc.newzarcapp.data.datasource.NewsLocalDataSource {
    private final com.newzarc.newzarcapp.data.db.NewsDao newsDao = null;
    
    public NewsLocalDataSourceImpl(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.data.db.NewsDao newsDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getNewsFromDb(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.newzarc.newzarcapp.data.model.news.NewsEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object saveNewsFromDb(@org.jetbrains.annotations.NotNull
    java.util.List<com.newzarc.newzarcapp.data.model.news.NewsEntity> news, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object clearDb(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}