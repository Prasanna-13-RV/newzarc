package com.newzarc.newzarcapp.data.datasourceImpl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/newzarc/newzarcapp/data/datasourceImpl/PostsRemoteDataSourceImpl;", "Lcom/newzarc/newzarcapp/data/datasource/PostsRemoteDataSource;", "postService", "Lcom/newzarc/newzarcapp/data/api/PostService;", "(Lcom/newzarc/newzarcapp/data/api/PostService;)V", "createPosts", "Lretrofit2/Response;", "Lcom/newzarc/newzarcapp/data/model/mypost/MyPostEntity;", "post", "(Lcom/newzarc/newzarcapp/data/model/mypost/MyPostEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPosts", "Lcom/newzarc/newzarcapp/data/model/post/PostList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyPosts", "Lcom/newzarc/newzarcapp/data/model/mypost/MyPostList;", "user_id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PostsRemoteDataSourceImpl implements com.newzarc.newzarcapp.data.datasource.PostsRemoteDataSource {
    private final com.newzarc.newzarcapp.data.api.PostService postService = null;
    
    @javax.inject.Inject
    public PostsRemoteDataSourceImpl(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.data.api.PostService postService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAllPosts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.newzarc.newzarcapp.data.model.post.PostList>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getMyPosts(@org.jetbrains.annotations.NotNull
    java.lang.String user_id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.newzarc.newzarcapp.data.model.mypost.MyPostList>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object createPosts(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.data.model.mypost.MyPostEntity post, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.newzarc.newzarcapp.data.model.mypost.MyPostEntity>> continuation) {
        return null;
    }
}