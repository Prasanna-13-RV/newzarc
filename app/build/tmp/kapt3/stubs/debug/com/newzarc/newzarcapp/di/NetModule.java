package com.newzarc.newzarcapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u0004H\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0007\u00a8\u0006\r"}, d2 = {"Lcom/newzarc/newzarcapp/di/NetModule;", "", "()V", "providesMyRetrofit", "Lretrofit2/Retrofit;", "providesNewsService", "Lcom/newzarc/newzarcapp/data/api/NewsService;", "retrofit", "providesPostsService", "Lcom/newzarc/newzarcapp/data/api/PostService;", "providesRetrofit", "providesUserService", "Lcom/newzarc/newzarcapp/data/api/UserService;", "app_debug"})
@dagger.Module
public final class NetModule {
    
    public NetModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "newsapi")
    @dagger.Provides
    @javax.inject.Singleton
    public final retrofit2.Retrofit providesRetrofit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "myapi")
    @dagger.Provides
    @javax.inject.Singleton
    public final retrofit2.Retrofit providesMyRetrofit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.newzarc.newzarcapp.data.api.NewsService providesNewsService(@org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "newsapi")
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.newzarc.newzarcapp.data.api.PostService providesPostsService(@org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "myapi")
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.newzarc.newzarcapp.data.api.UserService providesUserService(@org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "myapi")
    retrofit2.Retrofit retrofit) {
        return null;
    }
}