package com.newzarc.newzarcapp.data.datasourceImpl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/newzarc/newzarcapp/data/datasourceImpl/NewsCacheDataSourceImpl;", "Lcom/newzarc/newzarcapp/data/datasource/NewsCacheDataSource;", "()V", "newsList", "Ljava/util/ArrayList;", "Lcom/newzarc/newzarcapp/data/model/news/NewsEntity;", "getNewsFromCache", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveNewsFromCache", "", "news", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NewsCacheDataSourceImpl implements com.newzarc.newzarcapp.data.datasource.NewsCacheDataSource {
    private java.util.ArrayList<com.newzarc.newzarcapp.data.model.news.NewsEntity> newsList;
    
    public NewsCacheDataSourceImpl() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getNewsFromCache(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.newzarc.newzarcapp.data.model.news.NewsEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object saveNewsFromCache(@org.jetbrains.annotations.NotNull
    java.util.List<com.newzarc.newzarcapp.data.model.news.NewsEntity> news, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}