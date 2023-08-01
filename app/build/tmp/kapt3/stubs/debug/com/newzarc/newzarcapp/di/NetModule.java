package com.newzarc.newzarcapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\t\u001a\u00020\u0006H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/newzarc/newzarcapp/di/NetModule;", "", "()V", "providesNewsService", "Lcom/newzarc/newzarcapp/data/api/NewsService;", "retrofit", "Lretrofit2/Retrofit;", "providesPostsService", "Lcom/newzarc/newzarcapp/data/api/PostService;", "providesRetrofit", "app_debug"})
@dagger.Module
public final class NetModule {
    
    public NetModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final retrofit2.Retrofit providesRetrofit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.newzarc.newzarcapp.data.api.NewsService providesNewsService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.newzarc.newzarcapp.data.api.PostService providesPostsService(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit retrofit) {
        return null;
    }
}