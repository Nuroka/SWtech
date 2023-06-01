package com.example.wordbook.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00140\u0016J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\u0006\u0010\u001a\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/example/wordbook/repository/WordRepository;", "", "database", "Lcom/example/wordbook/database/WordDatabase;", "(Lcom/example/wordbook/database/WordDatabase;)V", "delete", "", "word", "Lcom/example/wordbook/database/Word;", "(Lcom/example/wordbook/database/Word;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findById", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCounts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWordByEnglish", "english", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWordList", "", "getWordListByLiveData", "Landroidx/lifecycle/LiveData;", "save", "", "searchWords", "searchKeyword", "update", "app_debug"})
public final class WordRepository {
    private final com.example.wordbook.database.WordDatabase database = null;
    
    public WordRepository(@org.jetbrains.annotations.NotNull
    com.example.wordbook.database.WordDatabase database) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.wordbook.database.Word>> getWordListByLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getWordList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.wordbook.database.Word>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object save(@org.jetbrains.annotations.NotNull
    com.example.wordbook.database.Word word, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull
    com.example.wordbook.database.Word word, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object findById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.wordbook.database.Word> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object searchWords(@org.jetbrains.annotations.NotNull
    java.lang.String searchKeyword, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.wordbook.database.Word>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getWordByEnglish(@org.jetbrains.annotations.NotNull
    java.lang.String english, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.wordbook.database.Word> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCounts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull
    com.example.wordbook.database.Word word, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
}