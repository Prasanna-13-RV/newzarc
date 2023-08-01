package com.newzarc.newzarcapp.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\nJ\u0014\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b0\nJ\u0014\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/newzarc/newzarcapp/viewmodel/NewsViewModel;", "Landroidx/lifecycle/ViewModel;", "getNewsUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/GetNewsUseCase;", "updateNewsUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/UpdateNewsUseCase;", "getPostsUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/GetPostsUseCase;", "(Lcom/newzarc/newzarcapp/domain/usecase/GetNewsUseCase;Lcom/newzarc/newzarcapp/domain/usecase/UpdateNewsUseCase;Lcom/newzarc/newzarcapp/domain/usecase/GetPostsUseCase;)V", "getNews", "Landroidx/lifecycle/LiveData;", "", "Lcom/newzarc/newzarcapp/data/model/NewsEntity;", "getPosts", "Lcom/newzarc/newzarcapp/data/model/PostEntity;", "updateNews", "app_debug"})
public final class NewsViewModel extends androidx.lifecycle.ViewModel {
    private final com.newzarc.newzarcapp.domain.usecase.GetNewsUseCase getNewsUseCase = null;
    private final com.newzarc.newzarcapp.domain.usecase.UpdateNewsUseCase updateNewsUseCase = null;
    private final com.newzarc.newzarcapp.domain.usecase.GetPostsUseCase getPostsUseCase = null;
    
    @javax.inject.Inject
    public NewsViewModel(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.domain.usecase.GetNewsUseCase getNewsUseCase, @org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.domain.usecase.UpdateNewsUseCase updateNewsUseCase, @org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.domain.usecase.GetPostsUseCase getPostsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.newzarc.newzarcapp.data.model.NewsEntity>> getNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.newzarc.newzarcapp.data.model.NewsEntity>> updateNews() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.newzarc.newzarcapp.data.model.PostEntity>> getPosts() {
        return null;
    }
}