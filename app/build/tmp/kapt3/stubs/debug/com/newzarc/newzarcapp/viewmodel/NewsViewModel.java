package com.newzarc.newzarcapp.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u0016\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0016J\u001e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u0016J\u001c\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010$0#2\u0006\u0010%\u001a\u00020\u0018J\u0014\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\'\u0018\u00010$0#J\u0014\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020)\u0018\u00010$0#J,\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010\u0015\u001a\u00020\u00162\n\u0010,\u001a\u0006\u0012\u0002\b\u00030-2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J.\u0010.\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010$2\u0006\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!J\u000e\u00101\u001a\u0002022\u0006\u0010\u0015\u001a\u00020\u0016J&\u00103\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u00104\u001a\u00020+2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018J\u0014\u00105\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\'\u0018\u00010$0#R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/newzarc/newzarcapp/viewmodel/NewsViewModel;", "Landroidx/lifecycle/ViewModel;", "getNewsUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/GetNewsUseCase;", "updateNewsUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/UpdateNewsUseCase;", "getPostsUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/GetPostsUseCase;", "getMyPostUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/GetMyPostUseCase;", "postCreateUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/PostCreateUseCase;", "getUserUserCase", "Lcom/newzarc/newzarcapp/domain/usecase/user/GetUserUserCase;", "postCreateUserUseCase", "Lcom/newzarc/newzarcapp/domain/usecase/user/PostCreateUserUseCase;", "(Lcom/newzarc/newzarcapp/domain/usecase/GetNewsUseCase;Lcom/newzarc/newzarcapp/domain/usecase/UpdateNewsUseCase;Lcom/newzarc/newzarcapp/domain/usecase/GetPostsUseCase;Lcom/newzarc/newzarcapp/domain/usecase/GetMyPostUseCase;Lcom/newzarc/newzarcapp/domain/usecase/PostCreateUseCase;Lcom/newzarc/newzarcapp/domain/usecase/user/GetUserUserCase;Lcom/newzarc/newzarcapp/domain/usecase/user/PostCreateUserUseCase;)V", "gson", "Lcom/google/gson/Gson;", "clearSharedObject", "", "context", "Landroid/content/Context;", "PREFS_NAME", "", "KEY_OBJECT", "createPost", "post", "Lcom/newzarc/newzarcapp/data/model/mypost/MyPostEntity;", "createUser", "user", "Lcom/newzarc/newzarcapp/data/model/user/UserEntity;", "navController", "Landroidx/navigation/NavController;", "getMyPosts", "Landroidx/lifecycle/LiveData;", "", "user_id", "getNews", "Lcom/newzarc/newzarcapp/data/model/news/NewsEntity;", "getPosts", "Lcom/newzarc/newzarcapp/data/model/post/PostEntity;", "getSharedObject", "", "clazz", "Ljava/lang/Class;", "getUserByEmail", "email", "password", "isInternetAvailable", "", "saveSharedObject", "obj", "updateNews", "app_debug"})
public final class NewsViewModel extends androidx.lifecycle.ViewModel {
    private final com.newzarc.newzarcapp.domain.usecase.GetNewsUseCase getNewsUseCase = null;
    private final com.newzarc.newzarcapp.domain.usecase.UpdateNewsUseCase updateNewsUseCase = null;
    private final com.newzarc.newzarcapp.domain.usecase.GetPostsUseCase getPostsUseCase = null;
    private final com.newzarc.newzarcapp.domain.usecase.GetMyPostUseCase getMyPostUseCase = null;
    private final com.newzarc.newzarcapp.domain.usecase.PostCreateUseCase postCreateUseCase = null;
    private final com.newzarc.newzarcapp.domain.usecase.user.GetUserUserCase getUserUserCase = null;
    private final com.newzarc.newzarcapp.domain.usecase.user.PostCreateUserUseCase postCreateUserUseCase = null;
    private final com.google.gson.Gson gson = null;
    
    @javax.inject.Inject
    public NewsViewModel(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.domain.usecase.GetNewsUseCase getNewsUseCase, @org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.domain.usecase.UpdateNewsUseCase updateNewsUseCase, @org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.domain.usecase.GetPostsUseCase getPostsUseCase, @org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.domain.usecase.GetMyPostUseCase getMyPostUseCase, @org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.domain.usecase.PostCreateUseCase postCreateUseCase, @org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.domain.usecase.user.GetUserUserCase getUserUserCase, @org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.domain.usecase.user.PostCreateUserUseCase postCreateUserUseCase) {
        super();
    }
    
    public final boolean isInternetAvailable(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
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
    com.newzarc.newzarcapp.data.model.mypost.MyPostEntity post, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.newzarc.newzarcapp.data.model.user.UserEntity> getUserByEmail(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
        return null;
    }
    
    public final void createUser(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.data.model.user.UserEntity user, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public final void saveSharedObject(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.Object obj, @org.jetbrains.annotations.NotNull
    java.lang.String PREFS_NAME, @org.jetbrains.annotations.NotNull
    java.lang.String KEY_OBJECT) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getSharedObject(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.Class<?> clazz, @org.jetbrains.annotations.NotNull
    java.lang.String PREFS_NAME, @org.jetbrains.annotations.NotNull
    java.lang.String KEY_OBJECT) {
        return null;
    }
    
    public final void clearSharedObject(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String PREFS_NAME, @org.jetbrains.annotations.NotNull
    java.lang.String KEY_OBJECT) {
    }
}