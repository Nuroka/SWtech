package com.example.wordbook.addgroupword;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0018"}, d2 = {"Lcom/example/wordbook/addgroupword/AddGroupWordViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "mGroupId", "", "(Landroid/app/Application;I)V", "getMGroupId", "()I", "repositoryGroup", "Lcom/example/wordbook/repository/GroupListRepository;", "repositoryWord", "Lcom/example/wordbook/repository/WordRepository;", "wordList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/wordbook/database/Word;", "getWordList", "()Landroidx/lifecycle/MutableLiveData;", "getAllWord", "", "searchWords", "query", "", "app_debug"})
public final class AddGroupWordViewModel extends androidx.lifecycle.ViewModel {
    private final int mGroupId = 0;
    private final com.example.wordbook.repository.WordRepository repositoryWord = null;
    private final com.example.wordbook.repository.GroupListRepository repositoryGroup = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.wordbook.database.Word>> wordList = null;
    
    public AddGroupWordViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application, int mGroupId) {
        super();
    }
    
    public final int getMGroupId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.wordbook.database.Word>> getWordList() {
        return null;
    }
    
    public final void searchWords(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
    }
    
    private final void getAllWord() {
    }
}