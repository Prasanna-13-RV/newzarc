package com.newzarc.newzarcapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/newzarc/newzarcapp/data/PostsRepositoryImpl;", "Lcom/newzarc/newzarcapp/domain/repository/PostsRepository;", "postsRemoteDataSource", "Lcom/newzarc/newzarcapp/data/datasource/PostsRemoteDataSource;", "(Lcom/newzarc/newzarcapp/data/datasource/PostsRemoteDataSource;)V", "getAllPosts", "", "Lcom/newzarc/newzarcapp/data/model/PostEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPostsFromApi", "app_debug"})
public final class PostsRepositoryImpl implements com.newzarc.newzarcapp.domain.repository.PostsRepository {
    private final com.newzarc.newzarcapp.data.datasource.PostsRemoteDataSource postsRemoteDataSource = null;
    
    public PostsRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.data.datasource.PostsRemoteDataSource postsRemoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAllPosts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.newzarc.newzarcapp.data.model.PostEntity>> continuation) {
        return null;
    }
    
    private final java.lang.Object getPostsFromApi(kotlin.coroutines.Continuation<? super java.util.List<com.newzarc.newzarcapp.data.model.PostEntity>> continuation) {
        return null;
    }
}