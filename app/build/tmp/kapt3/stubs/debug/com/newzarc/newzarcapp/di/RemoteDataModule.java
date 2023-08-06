package com.newzarc.newzarcapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/newzarc/newzarcapp/di/RemoteDataModule;", "", "()V", "provideNewsDataSource", "Lcom/newzarc/newzarcapp/data/datasource/NewsRemoteDataSource;", "newsService", "Lcom/newzarc/newzarcapp/data/api/NewsService;", "providePostsDataSource", "Lcom/newzarc/newzarcapp/data/datasource/PostsRemoteDataSource;", "postService", "Lcom/newzarc/newzarcapp/data/api/PostService;", "provideUserDataSource", "Lcom/newzarc/newzarcapp/data/datasource/UserRemoteDataSource;", "userService", "Lcom/newzarc/newzarcapp/data/api/UserService;", "app_debug"})
@dagger.Module
public final class RemoteDataModule {
    
    public RemoteDataModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.newzarc.newzarcapp.data.datasource.NewsRemoteDataSource provideNewsDataSource(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.data.api.NewsService newsService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.newzarc.newzarcapp.data.datasource.PostsRemoteDataSource providePostsDataSource(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.data.api.PostService postService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.newzarc.newzarcapp.data.datasource.UserRemoteDataSource provideUserDataSource(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.data.api.UserService userService) {
        return null;
    }
}