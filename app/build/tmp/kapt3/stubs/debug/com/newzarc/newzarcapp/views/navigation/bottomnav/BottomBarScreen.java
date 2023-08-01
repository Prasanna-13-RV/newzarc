package com.newzarc.newzarcapp.views.navigation.bottomnav;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\r\u000e\u000f\u0010\u0011B\u001f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u0082\u0001\u0005\u0012\u0013\u0014\u0015\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/newzarc/newzarcapp/views/navigation/bottomnav/BottomBarScreen;", "", "route", "", "title", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;)V", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getRoute", "()Ljava/lang/String;", "getTitle", "Account", "Add", "News", "Posts", "Show", "Lcom/newzarc/newzarcapp/views/navigation/bottomnav/BottomBarScreen$Account;", "Lcom/newzarc/newzarcapp/views/navigation/bottomnav/BottomBarScreen$Add;", "Lcom/newzarc/newzarcapp/views/navigation/bottomnav/BottomBarScreen$News;", "Lcom/newzarc/newzarcapp/views/navigation/bottomnav/BottomBarScreen$Posts;", "Lcom/newzarc/newzarcapp/views/navigation/bottomnav/BottomBarScreen$Show;", "app_debug"})
public abstract class BottomBarScreen {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String route = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.ui.graphics.vector.ImageVector icon = null;
    
    private BottomBarScreen(java.lang.String route, java.lang.String title, androidx.compose.ui.graphics.vector.ImageVector icon) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRoute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.ui.graphics.vector.ImageVector getIcon() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/newzarc/newzarcapp/views/navigation/bottomnav/BottomBarScreen$News;", "Lcom/newzarc/newzarcapp/views/navigation/bottomnav/BottomBarScreen;", "()V", "app_debug"})
    public static final class News extends com.newzarc.newzarcapp.views.navigation.bottomnav.BottomBarScreen {
        @org.jetbrains.annotations.NotNull
        public static final com.newzarc.newzarcapp.views.navigation.bottomnav.BottomBarScreen.News INSTANCE = null;
        
        private News() {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/newzarc/newzarcapp/views/navigation/bottomnav/BottomBarScreen$Posts;", "Lcom/newzarc/newzarcapp/views/navigation/bottomnav/BottomBarScreen;", "()V", "app_debug"})
    public static final class Posts extends com.newzarc.newzarcapp.views.navigation.bottomnav.BottomBarScreen {
        @org.jetbrains.annotations.NotNull
        public static final com.newzarc.newzarcapp.views.navigation.bottomnav.BottomBarScreen.Posts INSTANCE = null;
        
        private Posts() {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/newzarc/newzarcapp/views/navigation/bottomnav/BottomBarScreen$Add;", "Lcom/newzarc/newzarcapp/views/navigation/bottomnav/BottomBarScreen;", "()V", "app_debug"})
    public static final class Add extends com.newzarc.newzarcapp.views.navigation.bottomnav.BottomBarScreen {
        @org.jetbrains.annotations.NotNull
        public static final com.newzarc.newzarcapp.views.navigation.bottomnav.BottomBarScreen.Add INSTANCE = null;
        
        private Add() {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/newzarc/newzarcapp/views/navigation/bottomnav/BottomBarScreen$Show;", "Lcom/newzarc/newzarcapp/views/navigation/bottomnav/BottomBarScreen;", "()V", "app_debug"})
    public static final class Show extends com.newzarc.newzarcapp.views.navigation.bottomnav.BottomBarScreen {
        @org.jetbrains.annotations.NotNull
        public static final com.newzarc.newzarcapp.views.navigation.bottomnav.BottomBarScreen.Show INSTANCE = null;
        
        private Show() {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/newzarc/newzarcapp/views/navigation/bottomnav/BottomBarScreen$Account;", "Lcom/newzarc/newzarcapp/views/navigation/bottomnav/BottomBarScreen;", "()V", "app_debug"})
    public static final class Account extends com.newzarc.newzarcapp.views.navigation.bottomnav.BottomBarScreen {
        @org.jetbrains.annotations.NotNull
        public static final com.newzarc.newzarcapp.views.navigation.bottomnav.BottomBarScreen.Account INSTANCE = null;
        
        private Account() {
            super(null, null, null);
        }
    }
}