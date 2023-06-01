package com.example.wordbook.edit;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0012\u001a\u00020\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J!\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/example/wordbook/edit/EditVocaViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "mWordId", "", "(Landroid/app/Application;I)V", "_state", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/wordbook/edit/EditVocaViewModelState;", "getMWordId", "()I", "repository", "Lcom/example/wordbook/repository/WordRepository;", "state", "Landroidx/lifecycle/LiveData;", "getState", "()Landroidx/lifecycle/LiveData;", "deleteWord", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWordByEnglish", "Lcom/example/wordbook/database/Word;", "english", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "load", "", "wordId", "updateWord", "means", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class EditVocaViewModel extends androidx.lifecycle.ViewModel {
    private final int mWordId = 0;
    private final com.example.wordbook.repository.WordRepository repository = null;
    private androidx.lifecycle.MutableLiveData<com.example.wordbook.edit.EditVocaViewModelState> _state;
    
    public EditVocaViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application, int mWordId) {
        super();
    }
    
    public final int getMWordId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.wordbook.edit.EditVocaViewModelState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getWordByEnglish(@org.jetbrains.annotations.NotNull
    java.lang.String english, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.wordbook.database.Word> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateWord(@org.jetbrains.annotations.NotNull
    java.lang.String english, @org.jetbrains.annotations.NotNull
    java.lang.String means, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    private final void load(int wordId) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteWord(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
}