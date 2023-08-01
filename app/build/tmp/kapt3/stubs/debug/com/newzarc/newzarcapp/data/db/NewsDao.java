package com.newzarc.newzarcapp.data.db;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/newzarc/newzarcapp/data/db/NewsDao;", "", "deleteNews", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllNews", "", "Lcom/newzarc/newzarcapp/data/model/NewsEntity;", "saveNews", "news", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface NewsDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object saveNews(@org.jetbrains.annotations.NotNull
    java.util.List<com.newzarc.newzarcapp.data.model.NewsEntity> news, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM NewsEntity")
    public abstract java.lang.Object deleteNews(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM NewsEntity")
    public abstract java.lang.Object getAllNews(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.newzarc.newzarcapp.data.model.NewsEntity>> continuation);
}