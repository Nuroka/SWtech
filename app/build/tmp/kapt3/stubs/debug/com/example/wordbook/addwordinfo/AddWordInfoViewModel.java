package com.example.wordbook.addwordinfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\u001aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0005H\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/example/wordbook/addwordinfo/AddWordInfoViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "mWordId", "", "mGroupId", "(Landroid/app/Application;II)V", "_state", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/wordbook/addwordinfo/AddWordInfoViewModelState;", "getMGroupId", "()I", "getMWordId", "repositoryGroup", "Lcom/example/wordbook/repository/GroupListRepository;", "repositoryWord", "Lcom/example/wordbook/repository/WordRepository;", "state", "Landroidx/lifecycle/LiveData;", "getState", "()Landroidx/lifecycle/LiveData;", "checkWordInGroupWord", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertGroupWord", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "", "wordId", "app_debug"})
public final class AddWordInfoViewModel extends androidx.lifecycle.ViewModel {
    private final int mWordId = 0;
    private final int mGroupId = 0;
    private final com.example.wordbook.repository.WordRepository repositoryWord = null;
    private final com.example.wordbook.repository.GroupListRepository repositoryGroup = null;
    private androidx.lifecycle.MutableLiveData<com.example.wordbook.addwordinfo.AddWordInfoViewModelState> _state;
    
    public AddWordInfoViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application, int mWordId, int mGroupId) {
        super();
    }
    
    public final int getMWordId() {
        return 0;
    }
    
    public final int getMGroupId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.wordbook.addwordinfo.AddWordInfoViewModelState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertGroupWord(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object checkWordInGroupWord(int mWordId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    private final void load(int wordId) {
    }
}