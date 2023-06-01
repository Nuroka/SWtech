package com.example.wordbook.groupword;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\u0006\u0010\u0016\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/example/wordbook/groupword/GroupWordViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "mGroupId", "", "(Landroid/app/Application;I)V", "groupWordList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/wordbook/database/GroupWord;", "getGroupWordList", "()Landroidx/lifecycle/MutableLiveData;", "getMGroupId", "()I", "repository", "Lcom/example/wordbook/repository/GroupListRepository;", "deleteGroupWord", "", "groupword", "(Lcom/example/wordbook/database/GroupWord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllWords", "getWordList", "searchWords", "query", "", "app_debug"})
public final class GroupWordViewModel extends androidx.lifecycle.ViewModel {
    private final int mGroupId = 0;
    private final com.example.wordbook.repository.GroupListRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.wordbook.database.GroupWord>> groupWordList = null;
    
    public GroupWordViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application, int mGroupId) {
        super();
    }
    
    public final int getMGroupId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.wordbook.database.GroupWord>> getGroupWordList() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteGroupWord(@org.jetbrains.annotations.NotNull
    com.example.wordbook.database.GroupWord groupword, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void searchWords(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
    
    private final void getAllWords() {
    }
    
    public final void getWordList() {
    }
}