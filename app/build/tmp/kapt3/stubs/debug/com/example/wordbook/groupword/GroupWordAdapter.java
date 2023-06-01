package com.example.wordbook.groupword;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0015\u0016\u0017B(\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0016R,\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/example/wordbook/groupword/GroupWordAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/wordbook/database/GroupWord;", "Lcom/example/wordbook/groupword/GroupWordAdapter$GroupWordViewHolder;", "onDeleteGroupWord", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "groupword", "", "(Lkotlin/jvm/functions/Function1;)V", "getOnDeleteGroupWord", "()Lkotlin/jvm/functions/Function1;", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DeleteWordClickListener", "GroupWordDiffCallback", "GroupWordViewHolder", "app_debug"})
public final class GroupWordAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.wordbook.database.GroupWord, com.example.wordbook.groupword.GroupWordAdapter.GroupWordViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.example.wordbook.database.GroupWord, kotlin.Unit> onDeleteGroupWord = null;
    
    public GroupWordAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.wordbook.database.GroupWord, kotlin.Unit> onDeleteGroupWord) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<com.example.wordbook.database.GroupWord, kotlin.Unit> getOnDeleteGroupWord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.wordbook.groupword.GroupWordAdapter.GroupWordViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.wordbook.groupword.GroupWordAdapter.GroupWordViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/wordbook/groupword/GroupWordAdapter$GroupWordDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/wordbook/database/GroupWord;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class GroupWordDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.wordbook.database.GroupWord> {
        
        public GroupWordDiffCallback() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        com.example.wordbook.database.GroupWord oldItem, @org.jetbrains.annotations.NotNull
        com.example.wordbook.database.GroupWord newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        com.example.wordbook.database.GroupWord oldItem, @org.jetbrains.annotations.NotNull
        com.example.wordbook.database.GroupWord newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/example/wordbook/groupword/GroupWordAdapter$GroupWordViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/wordbook/databinding/ViewholderGroupwordBinding;", "(Lcom/example/wordbook/databinding/ViewholderGroupwordBinding;)V", "getBinding", "()Lcom/example/wordbook/databinding/ViewholderGroupwordBinding;", "Companion", "app_debug"})
    public static final class GroupWordViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.wordbook.databinding.ViewholderGroupwordBinding binding = null;
        @org.jetbrains.annotations.NotNull
        public static final com.example.wordbook.groupword.GroupWordAdapter.GroupWordViewHolder.Companion Companion = null;
        
        private GroupWordViewHolder(com.example.wordbook.databinding.ViewholderGroupwordBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.wordbook.databinding.ViewholderGroupwordBinding getBinding() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/wordbook/groupword/GroupWordAdapter$GroupWordViewHolder$Companion;", "", "()V", "from", "Lcom/example/wordbook/groupword/GroupWordAdapter$GroupWordViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.example.wordbook.groupword.GroupWordAdapter.GroupWordViewHolder from(@org.jetbrains.annotations.NotNull
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004R,\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/example/wordbook/groupword/GroupWordAdapter$DeleteWordClickListener;", "", "onDeleteGroupWord", "Lkotlin/Function1;", "Lcom/example/wordbook/database/GroupWord;", "Lkotlin/ParameterName;", "name", "groupword", "", "(Lkotlin/jvm/functions/Function1;)V", "getOnDeleteGroupWord", "()Lkotlin/jvm/functions/Function1;", "onDeleteGroupWordClick", "app_debug"})
    public static final class DeleteWordClickListener {
        @org.jetbrains.annotations.NotNull
        private final kotlin.jvm.functions.Function1<com.example.wordbook.database.GroupWord, kotlin.Unit> onDeleteGroupWord = null;
        
        public DeleteWordClickListener(@org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super com.example.wordbook.database.GroupWord, kotlin.Unit> onDeleteGroupWord) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlin.jvm.functions.Function1<com.example.wordbook.database.GroupWord, kotlin.Unit> getOnDeleteGroupWord() {
            return null;
        }
        
        public final void onDeleteGroupWordClick(@org.jetbrains.annotations.NotNull
        com.example.wordbook.database.GroupWord groupword) {
        }
    }
}