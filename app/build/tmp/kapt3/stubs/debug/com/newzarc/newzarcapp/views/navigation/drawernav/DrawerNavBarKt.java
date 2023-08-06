package com.newzarc.newzarcapp.views.navigation.drawernav;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u001a\b\u0010\n\u001a\u00020\u0001H\u0007\u001a4\u0010\u000b\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a \u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007\u001a\u001a\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007\u001a\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b\u00a8\u0006\u001c"}, d2 = {"BodyContentComponent", "", "navController", "Landroidx/navigation/NavController;", "currentScreen", "Lcom/newzarc/newzarcapp/views/navigation/drawernav/DrawerAppScreen;", "openDrawer", "Lkotlin/Function0;", "myviewmodel", "Lcom/newzarc/newzarcapp/viewmodel/NewsViewModel;", "DrawerAppComponentPreview", "DrawerContentComponent", "Landroidx/compose/runtime/MutableState;", "closeDrawer", "data", "", "DrawerNavBar", "LogOutFunction", "context", "Landroid/content/Context;", "RoundedImageFromUrl", "imageUrl", "", "modifier", "Landroidx/compose/ui/Modifier;", "getScreenBasedOnIndex", "index", "", "app_debug"})
public final class DrawerNavBarKt {
    
    @androidx.compose.runtime.Composable
    public static final void DrawerNavBar(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void DrawerContentComponent(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<com.newzarc.newzarcapp.views.navigation.drawernav.DrawerAppScreen> currentScreen, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> closeDrawer, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    java.lang.Object data) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void RoundedImageFromUrl(@org.jetbrains.annotations.NotNull
    java.lang.String imageUrl, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final com.newzarc.newzarcapp.views.navigation.drawernav.DrawerAppScreen getScreenBasedOnIndex(int index) {
        return null;
    }
    
    @androidx.compose.runtime.Composable
    public static final void BodyContentComponent(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.views.navigation.drawernav.DrawerAppScreen currentScreen, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> openDrawer, @org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.viewmodel.NewsViewModel myviewmodel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void LogOutFunction(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.newzarc.newzarcapp.viewmodel.NewsViewModel myviewmodel, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview
    public static final void DrawerAppComponentPreview() {
    }
}