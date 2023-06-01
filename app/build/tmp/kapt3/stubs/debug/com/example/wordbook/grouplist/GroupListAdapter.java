package com.example.wordbook.grouplist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0017\u0018\u0019\u001aBK\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005\u0012!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012H\u0016R,\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR,\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/example/wordbook/grouplist/GroupListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/wordbook/database/Group;", "Lcom/example/wordbook/grouplist/GroupListAdapter$GroupListViewHolder;", "onMoveToGroup", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "group", "", "onDeleteGroup", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getOnDeleteGroup", "()Lkotlin/jvm/functions/Function1;", "getOnMoveToGroup", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DeleteClickListener", "GroupClickListener", "GroupDiffCallback", "GroupListViewHolder", "app_debug"})
public final class GroupListAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.wordbook.database.Group, com.example.wordbook.grouplist.GroupListAdapter.GroupListViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.example.wordbook.database.Group, kotlin.Unit> onMoveToGroup = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.example.wordbook.database.Group, kotlin.Unit> onDeleteGroup = null;
    
    public GroupListAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.wordbook.database.Group, kotlin.Unit> onMoveToGroup, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.wordbook.database.Group, kotlin.Unit> onDeleteGroup) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<com.example.wordbook.database.Group, kotlin.Unit> getOnMoveToGroup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<com.example.wordbook.database.Group, kotlin.Unit> getOnDeleteGroup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.wordbook.grouplist.GroupListAdapter.GroupListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.wordbook.grouplist.GroupListAdapter.GroupListViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/wordbook/grouplist/GroupListAdapter$GroupDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/wordbook/database/Group;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class GroupDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.wordbook.database.Group> {
        
        public GroupDiffCallback() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        com.example.wordbook.database.Group oldItem, @org.jetbrains.annotations.NotNull
        com.example.wordbook.database.Group newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        com.example.wordbook.database.Group oldItem, @org.jetbrains.annotations.NotNull
        com.example.wordbook.database.Group newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/example/wordbook/grouplist/GroupListAdapter$GroupListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/wordbook/databinding/ViewholderGroupBinding;", "(Lcom/example/wordbook/databinding/ViewholderGroupBinding;)V", "getBinding", "()Lcom/example/wordbook/databinding/ViewholderGroupBinding;", "Companion", "app_debug"})
    public static final class GroupListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.wordbook.databinding.ViewholderGroupBinding binding = null;
        @org.jetbrains.annotations.NotNull
        public static final com.example.wordbook.grouplist.GroupListAdapter.GroupListViewHolder.Companion Companion = null;
        
        private GroupListViewHolder(com.example.wordbook.databinding.ViewholderGroupBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.wordbook.databinding.ViewholderGroupBinding getBinding() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/wordbook/grouplist/GroupListAdapter$GroupListViewHolder$Companion;", "", "()V", "from", "Lcom/example/wordbook/grouplist/GroupListAdapter$GroupListViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.example.wordbook.grouplist.GroupListAdapter.GroupListViewHolder from(@org.jetbrains.annotations.NotNull
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004R,\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/example/wordbook/grouplist/GroupListAdapter$GroupClickListener;", "", "onMoveToGroup", "Lkotlin/Function1;", "Lcom/example/wordbook/database/Group;", "Lkotlin/ParameterName;", "name", "group", "", "(Lkotlin/jvm/functions/Function1;)V", "getOnMoveToGroup", "()Lkotlin/jvm/functions/Function1;", "onGroupClick", "app_debug"})
    public static final class GroupClickListener {
        @org.jetbrains.annotations.NotNull
        private final kotlin.jvm.functions.Function1<com.example.wordbook.database.Group, kotlin.Unit> onMoveToGroup = null;
        
        public GroupClickListener(@org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super com.example.wordbook.database.Group, kotlin.Unit> onMoveToGroup) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlin.jvm.functions.Function1<com.example.wordbook.database.Group, kotlin.Unit> getOnMoveToGroup() {
            return null;
        }
        
        public final void onGroupClick(@org.jetbrains.annotations.NotNull
        com.example.wordbook.database.Group group) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004R,\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/example/wordbook/grouplist/GroupListAdapter$DeleteClickListener;", "", "onDeleteGroup", "Lkotlin/Function1;", "Lcom/example/wordbook/database/Group;", "Lkotlin/ParameterName;", "name", "group", "", "(Lkotlin/jvm/functions/Function1;)V", "getOnDeleteGroup", "()Lkotlin/jvm/functions/Function1;", "onDeleteClick", "app_debug"})
    public static final class DeleteClickListener {
        @org.jetbrains.annotations.NotNull
        private final kotlin.jvm.functions.Function1<com.example.wordbook.database.Group, kotlin.Unit> onDeleteGroup = null;
        
        public DeleteClickListener(@org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super com.example.wordbook.database.Group, kotlin.Unit> onDeleteGroup) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlin.jvm.functions.Function1<com.example.wordbook.database.Group, kotlin.Unit> getOnDeleteGroup() {
            return null;
        }
        
        public final void onDeleteClick(@org.jetbrains.annotations.NotNull
        com.example.wordbook.database.Group group) {
        }
    }
}