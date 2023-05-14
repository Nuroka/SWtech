package com.example.wordbook.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018J\u0011\u0010\u0019\u001a\u00020\u001aH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u0018J\u0011\u0010\u001d\u001a\u00020\u001aH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0006\u0010\u001e\u001a\u00020\u0018J\u0006\u0010\u001f\u001a\u00020\u0018R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/example/wordbook/main/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_mStudyMovingState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/wordbook/main/MovingState;", "_mTestDateMovingState", "_mTestMovingState", "_mTestWordGoalMovingState", "mStudyMovingState", "Landroidx/lifecycle/LiveData;", "getMStudyMovingState", "()Landroidx/lifecycle/LiveData;", "mTestDateMovingState", "getMTestDateMovingState", "mTestMovingState", "getMTestMovingState", "mTestWordGoalState", "getMTestWordGoalState", "repository", "Lcom/example/wordbook/repository/WordRepository;", "moveToStudy", "", "moveToStudyEnabled", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "moveToTest", "moveToTestEnabled", "setStudyMovingStateIdle", "setTestMovingStateIdle", "Companion", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    public static final com.example.wordbook.main.MainViewModel.Companion Companion = null;
    public static final int LIMIT_TO_MOVE_STUDY = 1;
    public static final int LIMIT_TO_MOVE_TEST = 4;
    private final com.example.wordbook.repository.WordRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.wordbook.main.MovingState> _mStudyMovingState = null;
    private final androidx.lifecycle.MutableLiveData<com.example.wordbook.main.MovingState> _mTestMovingState = null;
    private final androidx.lifecycle.MutableLiveData<com.example.wordbook.main.MovingState> _mTestWordGoalMovingState = null;
    private final androidx.lifecycle.MutableLiveData<com.example.wordbook.main.MovingState> _mTestDateMovingState = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.wordbook.main.MovingState> getMStudyMovingState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.wordbook.main.MovingState> getMTestMovingState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.wordbook.main.MovingState> getMTestWordGoalState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.wordbook.main.MovingState> getMTestDateMovingState() {
        return null;
    }
    
    public final void moveToStudy() {
    }
    
    public final void setStudyMovingStateIdle() {
    }
    
    public final void moveToTest() {
    }
    
    public final void setTestMovingStateIdle() {
    }
    
    private final java.lang.Object moveToStudyEnabled(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    private final java.lang.Object moveToTestEnabled(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/wordbook/main/MainViewModel$Companion;", "", "()V", "LIMIT_TO_MOVE_STUDY", "", "LIMIT_TO_MOVE_TEST", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}