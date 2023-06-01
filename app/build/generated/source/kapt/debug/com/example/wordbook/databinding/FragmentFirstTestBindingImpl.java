package com.example.wordbook.databinding;
import com.example.wordbook.R;
import com.example.wordbook.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFirstTestBindingImpl extends FragmentFirstTestBinding implements com.example.wordbook.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.question_container, 8);
        sViewsWithIds.put(R.id.candidate_container, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFirstTestBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentFirstTestBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[7]
            , (android.widget.LinearLayout) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.buttonMeans1.setTag(null);
        this.buttonMeans2.setTag(null);
        this.buttonMeans3.setTag(null);
        this.buttonMeans4.setTag(null);
        this.buttonMeans5.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textCount.setTag(null);
        this.textEnglish.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.example.wordbook.generated.callback.OnClickListener(this, 4);
        mCallback6 = new com.example.wordbook.generated.callback.OnClickListener(this, 5);
        mCallback3 = new com.example.wordbook.generated.callback.OnClickListener(this, 2);
        mCallback4 = new com.example.wordbook.generated.callback.OnClickListener(this, 3);
        mCallback2 = new com.example.wordbook.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setViewModel((com.example.wordbook.test.FirstTestViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.wordbook.test.FirstTestViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelMTestCount((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeViewModelMTestUnit((androidx.lifecycle.LiveData<com.example.wordbook.test.FirstTestViewModel.TestUnit>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelMTestCount(androidx.lifecycle.LiveData<java.lang.Integer> ViewModelMTestCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMTestUnit(androidx.lifecycle.LiveData<com.example.wordbook.test.FirstTestViewModel.TestUnit> ViewModelMTestUnit, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
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
        java.lang.String viewModelMTestCountToString = null;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelMTestCount = null;
        com.example.wordbook.test.FirstTestViewModel.TestUnit viewModelMTestUnitGetValue = null;
        java.lang.Integer viewModelMTestCountGetValue = null;
        androidx.lifecycle.LiveData<com.example.wordbook.test.FirstTestViewModel.TestUnit> viewModelMTestUnit = null;
        com.example.wordbook.test.FirstTestViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.MTestCount
                        viewModelMTestCount = viewModel.getMTestCount();
                    }
                    updateLiveDataRegistration(0, viewModelMTestCount);


                    if (viewModelMTestCount != null) {
                        // read viewModel.MTestCount.getValue()
                        viewModelMTestCountGetValue = viewModelMTestCount.getValue();
                    }


                    if (viewModelMTestCountGetValue != null) {
                        // read viewModel.MTestCount.getValue().toString()
                        viewModelMTestCountToString = viewModelMTestCountGetValue.toString();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.MTestUnit
                        viewModelMTestUnit = viewModel.getMTestUnit();
                    }
                    updateLiveDataRegistration(1, viewModelMTestUnit);


                    if (viewModelMTestUnit != null) {
                        // read viewModel.MTestUnit.getValue()
                        viewModelMTestUnitGetValue = viewModelMTestUnit.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.buttonMeans1.setOnClickListener(mCallback2);
            this.buttonMeans2.setOnClickListener(mCallback3);
            this.buttonMeans3.setOnClickListener(mCallback4);
            this.buttonMeans4.setOnClickListener(mCallback5);
            this.buttonMeans5.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.example.wordbook.util.BindingAdaptersKt.setFirstCandidate(this.buttonMeans1, viewModelMTestUnitGetValue);
            com.example.wordbook.util.BindingAdaptersKt.setSecondCandidate(this.buttonMeans2, viewModelMTestUnitGetValue);
            com.example.wordbook.util.BindingAdaptersKt.setThirdCandidate(this.buttonMeans3, viewModelMTestUnitGetValue);
            com.example.wordbook.util.BindingAdaptersKt.setFourthCandidate(this.buttonMeans4, viewModelMTestUnitGetValue);
            com.example.wordbook.util.BindingAdaptersKt.setQuestionEnglish(this.textEnglish, viewModelMTestUnitGetValue);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textCount, viewModelMTestCountToString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.example.wordbook.test.FirstTestViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onClickCandidate(3);
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                com.example.wordbook.test.FirstTestViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onClickCandidate(4);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.example.wordbook.test.FirstTestViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onClickCandidate(1);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.example.wordbook.test.FirstTestViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onClickCandidate(2);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.example.wordbook.test.FirstTestViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onClickCandidate(0);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.MTestCount
        flag 1 (0x2L): viewModel.MTestUnit
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}