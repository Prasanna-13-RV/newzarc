package com.newzarc.newzarcapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/newzarc/newzarcapp/data/PostsRepositoryImpl;", "Lcom/newzarc/newzarcapp/domain/repository/PostsRepository;", "postsRemoteDataSource", "Lcom/newzarc/newzarcapp/data/datasource/PostsRemoteDataSource;", "(Lcom/newzarc/newzarcapp/data/datasource/PostsRemoteDataSource;)V", "createPost", "Lretrofit2/Response;", "Lcom/newzarc/newzarcapp/data/model/mypost/MyPostEntity;", "post", "(Lcom/newzarc/newzarcapp/data/model/mypost/MyPostEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPosts", "", "Lcom/newzarc/newzarcapp/data/model/post/PostEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyPosts", "user_id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyPostsFromApi", "getPostsFromApi", "app_debug"})
public final class PostsRepositoryImpl implements com.newzarc.newzarcapp.domain.repository.PostsRepository {
    private final com.newzarc.newzarcapp.data.datasource.PostsRemoteDataSource postsRemoteDataSource = null;
    
    public PostsRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.data.datasource.PostsRemoteDataSource postsRemoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAllPosts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.newzarc.newzarcapp.data.model.post.PostEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getMyPosts(@org.jetbrains.annotations.NotNull
    java.lang.String user_id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.newzarc.newzarcapp.data.model.mypost.MyPostEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object createPost(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.data.model.mypost.MyPostEntity post, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.newzarc.newzarcapp.data.model.mypost.MyPostEntity>> continuation) {
        return null;
    }
    
    private final java.lang.Object getPostsFromApi(kotlin.coroutines.Continuation<? super java.util.List<com.newzarc.newzarcapp.data.model.post.PostEntity>> continuation) {
        return null;
    }
    
    private final java.lang.Object getMyPostsFromApi(java.lang.String user_id, kotlin.coroutines.Continuation<? super java.util.List<com.newzarc.newzarcapp.data.model.mypost.MyPostEntity>> continuation) {
        return null;
    }
}