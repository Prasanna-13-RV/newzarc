package com.newzarc.newzarcapp.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00130\u0012J\u0014\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00130\u0012J\u0014\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00130\u0012R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/newzarc/newzarcapp/viewmodel/NewsViewModel;", "Landroidx/lifecycle/ViewModel;", "getNewsUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/GetNewsUseCase;", "updateNewsUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/UpdateNewsUseCase;", "getPostsUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/GetPostsUseCase;", "getMyPostUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/GetMyPostUseCase;", "postCreateUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/PostCreateUseCase;", "(Lcom/newzarc/newzarcapp/domain/usecase/GetNewsUseCase;Lcom/newzarc/newzarcapp/domain/usecase/UpdateNewsUseCase;Lcom/newzarc/newzarcapp/domain/usecase/GetPostsUseCase;Lcom/newzarc/newzarcapp/domain/usecase/GetMyPostUseCase;Lcom/newzarc/newzarcapp/domain/usecase/PostCreateUseCase;)V", "createPost", "", "post", "Lcom/newzarc/newzarcapp/data/model/mypost/MyPostEntity;", "getMyPosts", "Landroidx/lifecycle/LiveData;", "", "user_id", "", "getNews", "Lcom/newzarc/newzarcapp/data/model/news/NewsEntity;", "getPosts", "Lcom/newzarc/newzarcapp/data/model/post/PostEntity;", "updateNews", "app_debug"})
public final class NewsViewModel extends androidx.lifecycle.ViewModel {
    private final com.newzarc.newzarcapp.domain.usecase.GetNewsUseCase getNewsUseCase = null;
    private final com.newzarc.newzarcapp.domain.usecase.UpdateNewsUseCase updateNewsUseCase = null;
    private final com.newzarc.newzarcapp.domain.usecase.GetPostsUseCase getPostsUseCase = null;
    private final com.newzarc.newzarcapp.domain.usecase.GetMyPostUseCase getMyPostUseCase = null;
    private final com.newzarc.newzarcapp.domain.usecase.PostCreateUseCase postCreateUseCase = null;
    
    @javax.inject.Inject
    public NewsViewModel(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.domain.usecase.GetNewsUseCase getNewsUseCase, @org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.domain.usecase.UpdateNewsUseCase updateNewsUseCase, @org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.domain.usecase.GetPostsUseCase getPostsUseCase, @org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.domain.usecase.GetMyPostUseCase getMyPostUseCase, @org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.domain.usecase.PostCreateUseCase postCreateUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.newzarc.newzarcapp.data.model.news.NewsEntity>> getNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.newzarc.newzarcapp.data.model.news.NewsEntity>> updateNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.newzarc.newzarcapp.data.model.post.PostEntity>> getPosts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.newzarc.newzarcapp.data.model.mypost.MyPostEntity>> getMyPosts(@org.jetbrains.annotations.NotNull
    java.lang.String user_id) {
        return null;
    }
    
    public final void createPost(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.data.model.mypost.MyPostEntity post) {
    }
}