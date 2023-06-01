package com.example.wordbook.databinding;
import com.example.wordbook.R;
import com.example.wordbook.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAddWordInfoBindingImpl extends FragmentAddWordInfoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.englishInfo, 3);
        sViewsWithIds.put(R.id.meansInfo, 4);
        sViewsWithIds.put(R.id.linearLayout, 5);
        sViewsWithIds.put(R.id.backInfoBtn, 6);
        sViewsWithIds.put(R.id.wordInfoAddBtn, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAddWordInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentAddWordInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.Button) bindings[7]
            );
        this.englishInfoText.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.meansInfoText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.wordInfo == variableId) {
            setWordInfo((com.example.wordbook.database.Word) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setWordInfo(@Nullable com.example.wordbook.database.Word WordInfo) {
        this.mWordInfo = WordInfo;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.wordInfo);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String wordInfoMeans = null;
        java.lang.String wordInfoEnglish = null;
        com.example.wordbook.database.Word wordInfo = mWordInfo;

        if ((dirtyFlags & 0x3L) != 0) {



                if (wordInfo != null) {
                    // read wordInfo.means
                    wordInfoMeans = wordInfo.getMeans();
                    // read wordInfo.english
                    wordInfoEnglish = wordInfo.getEnglish();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.englishInfoText, wordInfoEnglish);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.meansInfoText, wordInfoMeans);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): wordInfo
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}