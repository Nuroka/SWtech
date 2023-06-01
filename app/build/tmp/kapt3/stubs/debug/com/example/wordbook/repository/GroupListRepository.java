package com.example.wordbook.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0010J\u0011\u0010\u0017\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00150\u0014J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00152\u0006\u0010\u0016\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010\u0016\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010 \u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\'\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010\u0016\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/example/wordbook/repository/GroupListRepository;", "", "database", "Lcom/example/wordbook/database/GroupListDatabase;", "(Lcom/example/wordbook/database/GroupListDatabase;)V", "deleteGroupWord", "", "word", "Lcom/example/wordbook/database/GroupWord;", "(Lcom/example/wordbook/database/GroupWord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletegroup", "group", "Lcom/example/wordbook/database/Group;", "(Lcom/example/wordbook/database/Group;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findByGroup", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findGroupWordbyId", "getAllGroupWordList", "Landroidx/lifecycle/LiveData;", "", "groupid", "getCounts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGroupList", "getGroupListByLiveData", "getGroupWordEnglishList", "", "getWordList", "insertGroupWord", "", "insertgroup", "searchWords", "searchKeyword", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectAllGroupWordList", "app_debug"})
public final class GroupListRepository {
    private final com.example.wordbook.database.GroupListDatabase database = null;
    
    public GroupListRepository(@org.jetbrains.annotations.NotNull
    com.example.wordbook.database.GroupListDatabase database) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.wordbook.database.Group>> getGroupListByLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getGroupList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.wordbook.database.Group>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertgroup(@org.jetbrains.annotations.NotNull
    com.example.wordbook.database.Group group, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deletegroup(@org.jetbrains.annotations.NotNull
    com.example.wordbook.database.Group group, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object findByGroup(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.wordbook.database.Group> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCounts(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertGroupWord(@org.jetbrains.annotations.NotNull
    com.example.wordbook.database.GroupWord word, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteGroupWord(@org.jetbrains.annotations.NotNull
    com.example.wordbook.database.GroupWord word, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object selectAllGroupWordList(int groupid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.wordbook.database.GroupWord>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.wordbook.database.GroupWord>> getAllGroupWordList(int groupid) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object findGroupWordbyId(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.wordbook.database.GroupWord> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getWordList(int groupid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.wordbook.database.GroupWord>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object searchWords(@org.jetbrains.annotations.NotNull
    java.lang.String searchKeyword, int groupid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.wordbook.database.GroupWord>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getGroupWordEnglishList(int groupid, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> continuation) {
        return null;
    }
}