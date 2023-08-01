package com.newzarc.newzarcapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/newzarc/newzarcapp/di/LocalDataModule;", "", "()V", "providesNewsLocalDataSource", "Lcom/newzarc/newzarcapp/data/datasource/NewsLocalDataSource;", "newsDao", "Lcom/newzarc/newzarcapp/data/db/NewsDao;", "app_debug"})
@dagger.Module
public final class LocalDataModule {
    
    public LocalDataModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.newzarc.newzarcapp.data.datasource.NewsLocalDataSource providesNewsLocalDataSource(@org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.data.db.NewsDao newsDao) {
        return null;
    }
}