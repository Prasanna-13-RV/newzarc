package com.newzarc.newzarcapp.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/newzarc/newzarcapp/data/api/PostService;", "", "createPost", "Lretrofit2/Response;", "Lcom/newzarc/newzarcapp/data/model/mypost/MyPostEntity;", "post", "(Lcom/newzarc/newzarcapp/data/model/mypost/MyPostEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPosts", "Lcom/newzarc/newzarcapp/data/model/post/PostList;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyPosts", "Lcom/newzarc/newzarcapp/data/model/mypost/MyPostList;", "userId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PostService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "http://192.168.1.15:8080/api/allposts")
    public abstract java.lang.Object getAllPosts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.newzarc.newzarcapp.data.model.post.PostList>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "http://192.168.1.15:8080/api/post/user/{id}")
    public abstract java.lang.Object getMyPosts(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "id")
    java.lang.String userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.newzarc.newzarcapp.data.model.mypost.MyPostList>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "http://192.168.1.15:8080/api/post/create")
    public abstract java.lang.Object createPost(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    com.newzarc.newzarcapp.data.model.mypost.MyPostEntity post, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.newzarc.newzarcapp.data.model.mypost.MyPostEntity>> continuation);
}