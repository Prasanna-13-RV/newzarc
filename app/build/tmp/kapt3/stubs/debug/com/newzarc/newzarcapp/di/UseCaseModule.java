package com.newzarc.newzarcapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\r"}, d2 = {"Lcom/newzarc/newzarcapp/di/UseCaseModule;", "", "()V", "providesGetNewsUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/GetNewsUseCase;", "newsRepository", "Lcom/newzarc/newzarcapp/domain/repository/NewsRepository;", "providesGetPostsUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/GetPostsUseCase;", "postsRepository", "Lcom/newzarc/newzarcapp/domain/repository/PostsRepository;", "providesUpdateNewsUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/UpdateNewsUseCase;", "app_debug"})
@dagger.Module
public final class UseCaseModule {
    
    public UseCaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.newzarc.newzarcapp.domain.usecase.GetNewsUseCase providesGetNewsUseCase(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.domain.repository.NewsRepository newsRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.newzarc.newzarcapp.domain.usecase.UpdateNewsUseCase providesUpdateNewsUseCase(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.domain.repository.NewsRepository newsRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.newzarc.newzarcapp.domain.usecase.GetPostsUseCase providesGetPostsUseCase(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.domain.repository.PostsRepository postsRepository) {
        return null;
    }
}