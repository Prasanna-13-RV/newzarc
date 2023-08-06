package com.newzarc.newzarcapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/newzarc/newzarcapp/di/UseCaseModule;", "", "()V", "providesCreateMyPostsUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/PostCreateUseCase;", "postsRepository", "Lcom/newzarc/newzarcapp/domain/repository/PostsRepository;", "providesCreateUserUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/user/PostCreateUserUseCase;", "userRepository", "Lcom/newzarc/newzarcapp/domain/repository/UserRepository;", "providesGetMyPostsUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/GetMyPostUseCase;", "providesGetNewsUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/GetNewsUseCase;", "newsRepository", "Lcom/newzarc/newzarcapp/domain/repository/NewsRepository;", "providesGetPostsUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/GetPostsUseCase;", "providesGetUserUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/user/GetUserUserCase;", "providesUpdateNewsUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/UpdateNewsUseCase;", "app_debug"})
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
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.newzarc.newzarcapp.domain.usecase.GetMyPostUseCase providesGetMyPostsUseCase(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.domain.repository.PostsRepository postsRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.newzarc.newzarcapp.domain.usecase.PostCreateUseCase providesCreateMyPostsUseCase(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.domain.repository.PostsRepository postsRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.newzarc.newzarcapp.domain.usecase.user.GetUserUserCase providesGetUserUseCase(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.domain.repository.UserRepository userRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.newzarc.newzarcapp.domain.usecase.user.PostCreateUserUseCase providesCreateUserUseCase(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.domain.repository.UserRepository userRepository) {
        return null;
    }
}