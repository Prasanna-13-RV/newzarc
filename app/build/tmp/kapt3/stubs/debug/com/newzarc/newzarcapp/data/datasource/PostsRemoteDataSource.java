package com.newzarc.newzarcapp.data.datasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\f\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/newzarc/newzarcapp/data/datasource/PostsRemoteDataSource;", "", "createPosts", "Lretrofit2/Response;", "Lcom/newzarc/newzarcapp/data/model/mypost/MyPostEntity;", "post", "(Lcom/newzarc/newzarcapp/data/model/mypost/MyPostEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPosts", "Lcom/newzarc/newzarcapp/data/model/post/PostList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyPosts", "Lcom/newzarc/newzarcapp/data/model/mypost/MyPostList;", "user_id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PostsRemoteDataSource {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAllPosts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.newzarc.newzarcapp.data.model.post.PostList>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMyPosts(@org.jetbrains.annotations.NotNull
    java.lang.String user_id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.newzarc.newzarcapp.data.model.mypost.MyPostList>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object createPosts(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.data.model.mypost.MyPostEntity post, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.newzarc.newzarcapp.data.model.mypost.MyPostEntity>> continuation);
}