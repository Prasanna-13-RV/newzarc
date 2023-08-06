package com.newzarc.newzarcapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/newzarc/newzarcapp/di/RepositoryModule;", "", "()V", "providesNewsRepository", "Lcom/newzarc/newzarcapp/domain/repository/NewsRepository;", "newsRemoteDataSource", "Lcom/newzarc/newzarcapp/data/datasource/NewsRemoteDataSource;", "newsLocalDataSource", "Lcom/newzarc/newzarcapp/data/datasource/NewsLocalDataSource;", "newsCacheDataSource", "Lcom/newzarc/newzarcapp/data/datasource/NewsCacheDataSource;", "providesPostsRepository", "Lcom/newzarc/newzarcapp/domain/repository/PostsRepository;", "postsRemoteDataSource", "Lcom/newzarc/newzarcapp/data/datasource/PostsRemoteDataSource;", "providesUserRepository", "Lcom/newzarc/newzarcapp/domain/repository/UserRepository;", "userRemoteDataSource", "Lcom/newzarc/newzarcapp/data/datasource/UserRemoteDataSource;", "app_debug"})
@dagger.Module
public final class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.newzarc.newzarcapp.domain.repository.NewsRepository providesNewsRepository(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.data.datasource.NewsRemoteDataSource newsRemoteDataSource, @org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.data.datasource.NewsLocalDataSource newsLocalDataSource, @org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.data.datasource.NewsCacheDataSource newsCacheDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.newzarc.newzarcapp.domain.repository.PostsRepository providesPostsRepository(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.data.datasource.PostsRemoteDataSource postsRemoteDataSource) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.newzarc.newzarcapp.domain.repository.UserRepository providesUserRepository(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.data.datasource.UserRemoteDataSource userRemoteDataSource) {
        return null;
    }
}