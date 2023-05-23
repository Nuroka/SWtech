package com.example.wordbook.databinding;
import com.example.wordbook.R;
import com.example.wordbook.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTestDateBindingImpl extends FragmentTestDateBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.testdate, 1);
        sViewsWithIds.put(R.id.button_day1, 2);
        sViewsWithIds.put(R.id.button_day2, 3);
        sViewsWithIds.put(R.id.button_day3, 4);
        sViewsWithIds.put(R.id.button_day4, 5);
        sViewsWithIds.put(R.id.button_day5, 6);
        sViewsWithIds.put(R.id.button_day6, 7);
        sViewsWithIds.put(R.id.button_day7, 8);
        sViewsWithIds.put(R.id.button_day8, 9);
        sViewsWithIds.put(R.id.button_day9, 10);
        sViewsWithIds.put(R.id.button_day10, 11);
        sViewsWithIds.put(R.id.button_day11, 12);
        sViewsWithIds.put(R.id.button_day12, 13);
        sViewsWithIds.put(R.id.button_day13, 14);
        sViewsWithIds.put(R.id.button_day14, 15);
        sViewsWithIds.put(R.id.button_day15, 16);
        sViewsWithIds.put(R.id.button_day16, 17);
        sViewsWithIds.put(R.id.button_day17, 18);
        sViewsWithIds.put(R.id.button_day18, 19);
        sViewsWithIds.put(R.id.button_day19, 20);
        sViewsWithIds.put(R.id.button_day20, 21);
        sViewsWithIds.put(R.id.button_day21, 22);
        sViewsWithIds.put(R.id.button_day22, 23);
        sViewsWithIds.put(R.id.button_day23, 24);
        sViewsWithIds.put(R.id.button_day24, 25);
        sViewsWithIds.put(R.id.button_day25, 26);
        sViewsWithIds.put(R.id.button_day26, 27);
        sViewsWithIds.put(R.id.button_day27, 28);
        sViewsWithIds.put(R.id.button_day28, 29);
        sViewsWithIds.put(R.id.button_day29, 30);
        sViewsWithIds.put(R.id.button_day30, 31);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTestDateBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 32, sIncludes, sViewsWithIds));
    }
    private FragmentTestDateBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[11]
            , (android.widget.Button) bindings[12]
            , (android.widget.Button) bindings[13]
            , (android.widget.Button) bindings[14]
            , (android.widget.Button) bindings[15]
            , (android.widget.Button) bindings[16]
            , (android.widget.Button) bindings[17]
            , (android.widget.Button) bindings[18]
            , (android.widget.Button) bindings[19]
            , (android.widget.Button) bindings[20]
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[21]
            , (android.widget.Button) bindings[22]
            , (android.widget.Button) bindings[23]
            , (android.widget.Button) bindings[24]
            , (android.widget.Button) bindings[25]
            , (android.widget.Button) bindings[26]
            , (android.widget.Button) bindings[27]
            , (android.widget.Button) bindings[28]
            , (android.widget.Button) bindings[29]
            , (android.widget.Button) bindings[30]
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[31]
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[7]
            , (android.widget.Button) bindings[8]
            , (android.widget.Button) bindings[9]
            , (android.widget.Button) bindings[10]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.example.wordbook.test.TestDateViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.wordbook.test.TestDateViewModel ViewModel) {
        this.mViewModel = ViewModel;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}