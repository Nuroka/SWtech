package com.example.wordbook.test;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0017"}, d2 = {"Lcom/example/wordbook/test/TestWordGoalViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "selectedRange", "", "getSelectedRange", "()I", "setSelectedRange", "(I)V", "words", "", "Lcom/example/wordbook/database/Word;", "getWords", "()Ljava/util/List;", "setWords", "(Ljava/util/List;)V", "wordGoalDb", "", "app_debug"})
public final class TestWordGoalViewModel extends androidx.lifecycle.AndroidViewModel {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.wordbook.database.Word> words;
    private int selectedRange = 0;
    
    public TestWordGoalViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.wordbook.database.Word> getWords() {
        return null;
    }
    
    public final void setWords(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.wordbook.database.Word> p0) {
    }
    
    public final int getSelectedRange() {
        return 0;
    }
    
    public final void setSelectedRange(int p0) {
    }
    
    public final void wordGoalDb(int selectedRange) {
    }
}