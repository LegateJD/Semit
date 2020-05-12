package com.zakharov.android.lab3.databinding;
import com.zakharov.android.lab3.R;
import com.zakharov.android.lab3.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityQuizAllInOneBindingImpl extends ActivityQuizAllInOneBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.answersContainer, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mOnAnswerQuestionClickListenerOnAnswerQuestionClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mOnDeleteQuestionClickListenerOnDeleteQuestionClickAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mOnSaveQuestionClickListenerOnSaveQuestionClickAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityQuizAllInOneBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityQuizAllInOneBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.core.widget.NestedScrollView) bindings[12]
            , (com.google.android.material.button.MaterialButton) bindings[11]
            , (com.google.android.material.checkbox.MaterialCheckBox) bindings[3]
            , (android.widget.EditText) bindings[4]
            , (com.google.android.material.checkbox.MaterialCheckBox) bindings[9]
            , (android.widget.EditText) bindings[10]
            , (com.google.android.material.textview.MaterialTextView) bindings[1]
            , (android.widget.EditText) bindings[2]
            , (com.google.android.material.checkbox.MaterialCheckBox) bindings[5]
            , (android.widget.EditText) bindings[6]
            , (com.google.android.material.checkbox.MaterialCheckBox) bindings[7]
            , (android.widget.EditText) bindings[8]
            );
        this.button.setTag(null);
        this.firstAnswerCheckBox.setTag(null);
        this.firstAnswerInputField.setTag(null);
        this.fourthAnswerCheckBox.setTag(null);
        this.fourthAnswerInputField.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.questionOutputField.setTag(null);
        this.questionTextInputField.setTag(null);
        this.secondAnswerCheckBox.setTag(null);
        this.secondAnswerInputField.setTag(null);
        this.thirdAnswerCheckBox.setTag(null);
        this.thirdAnswerInputField.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
        if (BR.onSaveQuestionClickListener == variableId) {
            setOnSaveQuestionClickListener((com.zakharov.android.lab3.presentation.view.clicklistener.OnSaveQuestionClickListener) variable);
        }
        else if (BR.onDeleteQuestionClickListener == variableId) {
            setOnDeleteQuestionClickListener((com.zakharov.android.lab3.presentation.view.clicklistener.OnDeleteQuestionClickListener) variable);
        }
        else if (BR.onAnswerQuestionClickListener == variableId) {
            setOnAnswerQuestionClickListener((com.zakharov.android.lab3.presentation.view.clicklistener.OnAnswerQuestionClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.zakharov.android.lab3.presentation.viewmodel.QuizViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOnSaveQuestionClickListener(@Nullable com.zakharov.android.lab3.presentation.view.clicklistener.OnSaveQuestionClickListener OnSaveQuestionClickListener) {
        this.mOnSaveQuestionClickListener = OnSaveQuestionClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.onSaveQuestionClickListener);
        super.requestRebind();
    }
    public void setOnDeleteQuestionClickListener(@Nullable com.zakharov.android.lab3.presentation.view.clicklistener.OnDeleteQuestionClickListener OnDeleteQuestionClickListener) {
        this.mOnDeleteQuestionClickListener = OnDeleteQuestionClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.onDeleteQuestionClickListener);
        super.requestRebind();
    }
    public void setOnAnswerQuestionClickListener(@Nullable com.zakharov.android.lab3.presentation.view.clicklistener.OnAnswerQuestionClickListener OnAnswerQuestionClickListener) {
        this.mOnAnswerQuestionClickListener = OnAnswerQuestionClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.onAnswerQuestionClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.zakharov.android.lab3.presentation.viewmodel.QuizViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelScreenMode((androidx.lifecycle.LiveData<com.zakharov.android.lab3.domain.entity.ScreenMode>) object, fieldId);
            case 1 :
                return onChangeViewModelQuestion((androidx.lifecycle.LiveData<com.zakharov.android.lab3.data.entity.Question>) object, fieldId);
            case 2 :
                return onChangeViewModelAnswerResults((androidx.lifecycle.LiveData<java.util.List<java.lang.Integer>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelScreenMode(androidx.lifecycle.LiveData<com.zakharov.android.lab3.domain.entity.ScreenMode> ViewModelScreenMode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelQuestion(androidx.lifecycle.LiveData<com.zakharov.android.lab3.data.entity.Question> ViewModelQuestion, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAnswerResults(androidx.lifecycle.LiveData<java.util.List<java.lang.Integer>> ViewModelAnswerResults, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        android.view.View.OnClickListener viewModelScreenModeScreenModeASKQUESTIONOnAnswerQuestionClickListenerOnAnswerQuestionClickViewModelScreenModeScreenModeSHOWANSWERRESULTSOnDeleteQuestionClickListenerOnDeleteQuestionClickJavaLangObjectNull = null;
        java.lang.String viewModelScreenModeScreenModeCREATEQUESTIONViewModelQuestionAnswers0TextJavaLangObjectNull = null;
        java.lang.Integer viewModelAnswerResults3 = null;
        android.view.View.OnClickListener onAnswerQuestionClickListenerOnAnswerQuestionClickAndroidViewViewOnClickListener = null;
        java.lang.Integer viewModelScreenModeScreenModeSHOWANSWERRESULTSViewModelAnswerResults1SecondAnswerCheckBoxAndroidColorColorBackground = null;
        java.lang.String viewModelScreenModeScreenModeSHOWANSWERRESULTSButtonAndroidStringButtonDeleteQuestionJavaLangObjectNull = null;
        com.zakharov.android.lab3.domain.entity.ScreenMode viewModelScreenModeGetValue = null;
        androidx.lifecycle.LiveData<com.zakharov.android.lab3.domain.entity.ScreenMode> viewModelScreenMode = null;
        java.lang.String viewModelQuestionAnswers0Text = null;
        java.lang.String viewModelQuestionAnswers1Text = null;
        java.lang.Integer viewModelAnswerResults2 = null;
        java.lang.String viewModelScreenModeScreenModeCREATEQUESTIONViewModelQuestionAnswers1TextJavaLangObjectNull = null;
        int viewModelScreenModeScreenModeCREATEQUESTIONViewVISIBLEViewINVISIBLE = 0;
        com.zakharov.android.lab3.presentation.view.clicklistener.OnSaveQuestionClickListener onSaveQuestionClickListener = mOnSaveQuestionClickListener;
        android.view.View.OnClickListener viewModelScreenModeScreenModeCREATEQUESTIONOnSaveQuestionClickListenerOnSaveQuestionClickViewModelScreenModeScreenModeASKQUESTIONOnAnswerQuestionClickListenerOnAnswerQuestionClickViewModelScreenModeScreenModeSHOWANSWERRESULTSOnDeleteQuestionClickListenerOnDeleteQuestionClickJavaLangObjectNull = null;
        int viewModelScreenModeScreenModeCREATEQUESTIONViewVISIBLEViewGONE = 0;
        java.util.List<com.zakharov.android.lab3.data.entity.Answer> viewModelQuestionAnswers = null;
        com.zakharov.android.lab3.data.entity.Answer viewModelQuestionAnswers2 = null;
        androidx.lifecycle.LiveData<com.zakharov.android.lab3.data.entity.Question> viewModelQuestion = null;
        boolean viewModelScreenModeScreenModeSHOWANSWERRESULTS = false;
        java.lang.String viewModelQuestionText = null;
        int ViewModelScreenModeScreenModeCREATEQUESTIONViewVISIBLEViewGONE1 = 0;
        java.lang.Integer viewModelAnswerResults1 = null;
        java.lang.String viewModelScreenModeScreenModeCREATEQUESTIONViewModelQuestionAnswers2TextJavaLangObjectNull = null;
        boolean viewModelScreenModeScreenModeCREATEQUESTION = false;
        android.view.View.OnClickListener onDeleteQuestionClickListenerOnDeleteQuestionClickAndroidViewViewOnClickListener = null;
        java.util.List<java.lang.Integer> viewModelAnswerResultsGetValue = null;
        java.lang.Integer viewModelScreenModeScreenModeSHOWANSWERRESULTSViewModelAnswerResults0FirstAnswerCheckBoxAndroidColorColorBackground = null;
        androidx.lifecycle.LiveData<java.util.List<java.lang.Integer>> viewModelAnswerResults = null;
        com.zakharov.android.lab3.data.entity.Answer viewModelQuestionAnswers1 = null;
        java.lang.String viewModelQuestionAnswers3Text = null;
        java.lang.String viewModelScreenModeScreenModeASKQUESTIONButtonAndroidStringButtonAnswerQuestionViewModelScreenModeScreenModeSHOWANSWERRESULTSButtonAndroidStringButtonDeleteQuestionJavaLangObjectNull = null;
        java.lang.String viewModelQuestionAnswers2Text = null;
        boolean ViewModelScreenModeScreenModeCREATEQUESTION1 = false;
        boolean viewModelScreenModeScreenModeASKQUESTION = false;
        java.lang.Integer viewModelAnswerResults0 = null;
        java.lang.String viewModelScreenModeScreenModeCREATEQUESTIONViewModelQuestionAnswers3TextJavaLangObjectNull = null;
        android.view.View.OnClickListener viewModelScreenModeScreenModeSHOWANSWERRESULTSOnDeleteQuestionClickListenerOnDeleteQuestionClickJavaLangObjectNull = null;
        com.zakharov.android.lab3.presentation.view.clicklistener.OnDeleteQuestionClickListener onDeleteQuestionClickListener = mOnDeleteQuestionClickListener;
        java.lang.Integer viewModelScreenModeScreenModeSHOWANSWERRESULTSViewModelAnswerResults2ThirdAnswerCheckBoxAndroidColorColorBackground = null;
        com.zakharov.android.lab3.data.entity.Answer viewModelQuestionAnswers3 = null;
        com.zakharov.android.lab3.data.entity.Question viewModelQuestionGetValue = null;
        android.view.View.OnClickListener onSaveQuestionClickListenerOnSaveQuestionClickAndroidViewViewOnClickListener = null;
        com.zakharov.android.lab3.data.entity.Answer viewModelQuestionAnswers0 = null;
        java.lang.Object viewModelScreenModeScreenModeASKQUESTIONJavaLangObjectNullJavaLangObjectNull = null;
        com.zakharov.android.lab3.presentation.view.clicklistener.OnAnswerQuestionClickListener onAnswerQuestionClickListener = mOnAnswerQuestionClickListener;
        boolean ViewModelScreenModeScreenModeSHOWANSWERRESULTS1 = false;
        java.lang.String viewModelScreenModeScreenModeCREATEQUESTIONViewModelQuestionTextJavaLangObjectNull = null;
        java.lang.String viewModelScreenModeScreenModeCREATEQUESTIONButtonAndroidStringButtonSaveQuestionViewModelScreenModeScreenModeASKQUESTIONButtonAndroidStringButtonAnswerQuestionViewModelScreenModeScreenModeSHOWANSWERRESULTSButtonAndroidStringButtonDeleteQuestionJavaLangObjectNull = null;
        com.zakharov.android.lab3.presentation.viewmodel.QuizViewModel viewModel = mViewModel;
        java.lang.Integer viewModelScreenModeScreenModeSHOWANSWERRESULTSViewModelAnswerResults3FourthAnswerCheckBoxAndroidColorColorBackground = null;

        if ((dirtyFlags & 0xffL) != 0) {



                if (viewModel != null) {
                    // read viewModel.screenMode()
                    viewModelScreenMode = viewModel.screenMode();
                }
                updateLiveDataRegistration(0, viewModelScreenMode);


                if (viewModelScreenMode != null) {
                    // read viewModel.screenMode().getValue()
                    viewModelScreenModeGetValue = viewModelScreenMode.getValue();
                }

            if ((dirtyFlags & 0xc5L) != 0) {

                    // read viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS
                    viewModelScreenModeScreenModeSHOWANSWERRESULTS = (viewModelScreenModeGetValue) == (com.zakharov.android.lab3.domain.entity.ScreenMode.SHOW_ANSWER_RESULTS);
                if((dirtyFlags & 0xc5L) != 0) {
                    if(viewModelScreenModeScreenModeSHOWANSWERRESULTS) {
                            dirtyFlags |= 0x2000L;
                            dirtyFlags |= 0x20000000L;
                            dirtyFlags |= 0x2000000000L;
                            dirtyFlags |= 0x200000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x10000000L;
                            dirtyFlags |= 0x1000000000L;
                            dirtyFlags |= 0x100000000000L;
                    }
                }
                if((dirtyFlags & 0x40000000L) != 0) {
                    if(viewModelScreenModeScreenModeSHOWANSWERRESULTS) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }
                if((dirtyFlags & 0x100L) != 0) {
                    if(viewModelScreenModeScreenModeSHOWANSWERRESULTS) {
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000L;
                    }
                }
            }
            if ((dirtyFlags & 0xc3L) != 0) {

                    // read viewModel.screenMode().getValue() != ScreenMode.CREATE_QUESTION
                    viewModelScreenModeScreenModeCREATEQUESTION = (viewModelScreenModeGetValue) != (com.zakharov.android.lab3.domain.entity.ScreenMode.CREATE_QUESTION);
                if((dirtyFlags & 0xc3L) != 0) {
                    if(viewModelScreenModeScreenModeCREATEQUESTION) {
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x20000L;
                            dirtyFlags |= 0x8000000L;
                            dirtyFlags |= 0x200000000L;
                            dirtyFlags |= 0x20000000000L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x10000L;
                            dirtyFlags |= 0x4000000L;
                            dirtyFlags |= 0x100000000L;
                            dirtyFlags |= 0x10000000000L;
                    }
                }
                if((dirtyFlags & 0xc1L) != 0) {
                    if(viewModelScreenModeScreenModeCREATEQUESTION) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }

                if ((dirtyFlags & 0xc1L) != 0) {

                        // read viewModel.screenMode().getValue() != ScreenMode.CREATE_QUESTION ? View.VISIBLE : View.GONE
                        viewModelScreenModeScreenModeCREATEQUESTIONViewVISIBLEViewGONE = ((viewModelScreenModeScreenModeCREATEQUESTION) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0xf9L) != 0) {

                    // read viewModel.screenMode().getValue() == ScreenMode.CREATE_QUESTION
                    ViewModelScreenModeScreenModeCREATEQUESTION1 = (viewModelScreenModeGetValue) == (com.zakharov.android.lab3.domain.entity.ScreenMode.CREATE_QUESTION);
                if((dirtyFlags & 0xc1L) != 0) {
                    if(ViewModelScreenModeScreenModeCREATEQUESTION1) {
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x2000000L;
                            dirtyFlags |= 0x80000000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                            dirtyFlags |= 0x1000000L;
                            dirtyFlags |= 0x40000000000L;
                    }
                }
                if((dirtyFlags & 0xf9L) != 0) {
                    if(ViewModelScreenModeScreenModeCREATEQUESTION1) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }

                if ((dirtyFlags & 0xc1L) != 0) {

                        // read viewModel.screenMode().getValue() == ScreenMode.CREATE_QUESTION ? View.VISIBLE : View.INVISIBLE
                        viewModelScreenModeScreenModeCREATEQUESTIONViewVISIBLEViewINVISIBLE = ((ViewModelScreenModeScreenModeCREATEQUESTION1) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
                        // read viewModel.screenMode().getValue() == ScreenMode.CREATE_QUESTION ? View.VISIBLE : View.GONE
                        ViewModelScreenModeScreenModeCREATEQUESTIONViewVISIBLEViewGONE1 = ((ViewModelScreenModeScreenModeCREATEQUESTION1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0xc1L) != 0) {

                    // read viewModel.screenMode().getValue() == ScreenMode.ASK_QUESTION
                    viewModelScreenModeScreenModeASKQUESTION = (viewModelScreenModeGetValue) == (com.zakharov.android.lab3.domain.entity.ScreenMode.ASK_QUESTION);
                    // read viewModel.screenMode().getValue() != ScreenMode.SHOW_ANSWER_RESULTS
                    ViewModelScreenModeScreenModeSHOWANSWERRESULTS1 = (viewModelScreenModeGetValue) != (com.zakharov.android.lab3.domain.entity.ScreenMode.SHOW_ANSWER_RESULTS);
                if((dirtyFlags & 0x100000L) != 0) {
                    if(viewModelScreenModeScreenModeASKQUESTION) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }
                if((dirtyFlags & 0x40000000000L) != 0) {
                    if(viewModelScreenModeScreenModeASKQUESTION) {
                            dirtyFlags |= 0x80000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000L;
                    }
                }
                if((dirtyFlags & 0xc1L) != 0) {
                    if(viewModelScreenModeScreenModeASKQUESTION) {
                            dirtyFlags |= 0x8000000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000000L;
                    }
                }


                    // read viewModel.screenMode().getValue() == ScreenMode.ASK_QUESTION ? null : null
                    viewModelScreenModeScreenModeASKQUESTIONJavaLangObjectNullJavaLangObjectNull = ((viewModelScreenModeScreenModeASKQUESTION) ? (null) : (null));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x200000L) != 0) {



                if (onSaveQuestionClickListener != null) {
                    // read onSaveQuestionClickListener::onSaveQuestionClick
                    onSaveQuestionClickListenerOnSaveQuestionClickAndroidViewViewOnClickListener = (((mOnSaveQuestionClickListenerOnSaveQuestionClickAndroidViewViewOnClickListener == null) ? (mOnSaveQuestionClickListenerOnSaveQuestionClickAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mOnSaveQuestionClickListenerOnSaveQuestionClickAndroidViewViewOnClickListener).setValue(onSaveQuestionClickListener));
                }
        }
        if ((dirtyFlags & 0x60208120800L) != 0) {


            if ((dirtyFlags & 0x40000100000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.screenMode()
                        viewModelScreenMode = viewModel.screenMode();
                    }
                    updateLiveDataRegistration(0, viewModelScreenMode);


                    if (viewModelScreenMode != null) {
                        // read viewModel.screenMode().getValue()
                        viewModelScreenModeGetValue = viewModelScreenMode.getValue();
                    }


                    // read viewModel.screenMode().getValue() == ScreenMode.ASK_QUESTION
                    viewModelScreenModeScreenModeASKQUESTION = (viewModelScreenModeGetValue) == (com.zakharov.android.lab3.domain.entity.ScreenMode.ASK_QUESTION);
                if((dirtyFlags & 0x100000L) != 0) {
                    if(viewModelScreenModeScreenModeASKQUESTION) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }
                if((dirtyFlags & 0x40000000000L) != 0) {
                    if(viewModelScreenModeScreenModeASKQUESTION) {
                            dirtyFlags |= 0x80000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000L;
                    }
                }
                if((dirtyFlags & 0xc1L) != 0) {
                    if(viewModelScreenModeScreenModeASKQUESTION) {
                            dirtyFlags |= 0x8000000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x20208020800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.question()
                        viewModelQuestion = viewModel.question();
                    }
                    updateLiveDataRegistration(1, viewModelQuestion);


                    if (viewModelQuestion != null) {
                        // read viewModel.question().getValue()
                        viewModelQuestionGetValue = viewModelQuestion.getValue();
                    }

                if ((dirtyFlags & 0x208020800L) != 0) {

                        if (viewModelQuestionGetValue != null) {
                            // read viewModel.question().getValue().answers
                            viewModelQuestionAnswers = viewModelQuestionGetValue.getAnswers();
                        }

                    if ((dirtyFlags & 0x8000000L) != 0) {

                            if (viewModelQuestionAnswers != null) {
                                // read viewModel.question().getValue().answers[2]
                                viewModelQuestionAnswers2 = getFromList(viewModelQuestionAnswers, 2);
                            }


                            if (viewModelQuestionAnswers2 != null) {
                                // read viewModel.question().getValue().answers[2].text
                                viewModelQuestionAnswers2Text = viewModelQuestionAnswers2.getText();
                            }
                    }
                    if ((dirtyFlags & 0x20000L) != 0) {

                            if (viewModelQuestionAnswers != null) {
                                // read viewModel.question().getValue().answers[1]
                                viewModelQuestionAnswers1 = getFromList(viewModelQuestionAnswers, 1);
                            }


                            if (viewModelQuestionAnswers1 != null) {
                                // read viewModel.question().getValue().answers[1].text
                                viewModelQuestionAnswers1Text = viewModelQuestionAnswers1.getText();
                            }
                    }
                    if ((dirtyFlags & 0x200000000L) != 0) {

                            if (viewModelQuestionAnswers != null) {
                                // read viewModel.question().getValue().answers[3]
                                viewModelQuestionAnswers3 = getFromList(viewModelQuestionAnswers, 3);
                            }


                            if (viewModelQuestionAnswers3 != null) {
                                // read viewModel.question().getValue().answers[3].text
                                viewModelQuestionAnswers3Text = viewModelQuestionAnswers3.getText();
                            }
                    }
                    if ((dirtyFlags & 0x800L) != 0) {

                            if (viewModelQuestionAnswers != null) {
                                // read viewModel.question().getValue().answers[0]
                                viewModelQuestionAnswers0 = getFromList(viewModelQuestionAnswers, 0);
                            }


                            if (viewModelQuestionAnswers0 != null) {
                                // read viewModel.question().getValue().answers[0].text
                                viewModelQuestionAnswers0Text = viewModelQuestionAnswers0.getText();
                            }
                    }
                }
                if ((dirtyFlags & 0x20000000000L) != 0) {

                        if (viewModelQuestionGetValue != null) {
                            // read viewModel.question().getValue().text
                            viewModelQuestionText = viewModelQuestionGetValue.getText();
                        }
                }
            }
        }

        if ((dirtyFlags & 0xc3L) != 0) {

                // read viewModel.screenMode().getValue() != ScreenMode.CREATE_QUESTION ? viewModel.question().getValue().answers[0].text : null
                viewModelScreenModeScreenModeCREATEQUESTIONViewModelQuestionAnswers0TextJavaLangObjectNull = ((viewModelScreenModeScreenModeCREATEQUESTION) ? (viewModelQuestionAnswers0Text) : (null));
                // read viewModel.screenMode().getValue() != ScreenMode.CREATE_QUESTION ? viewModel.question().getValue().answers[1].text : null
                viewModelScreenModeScreenModeCREATEQUESTIONViewModelQuestionAnswers1TextJavaLangObjectNull = ((viewModelScreenModeScreenModeCREATEQUESTION) ? (viewModelQuestionAnswers1Text) : (null));
                // read viewModel.screenMode().getValue() != ScreenMode.CREATE_QUESTION ? viewModel.question().getValue().answers[2].text : null
                viewModelScreenModeScreenModeCREATEQUESTIONViewModelQuestionAnswers2TextJavaLangObjectNull = ((viewModelScreenModeScreenModeCREATEQUESTION) ? (viewModelQuestionAnswers2Text) : (null));
                // read viewModel.screenMode().getValue() != ScreenMode.CREATE_QUESTION ? viewModel.question().getValue().answers[3].text : null
                viewModelScreenModeScreenModeCREATEQUESTIONViewModelQuestionAnswers3TextJavaLangObjectNull = ((viewModelScreenModeScreenModeCREATEQUESTION) ? (viewModelQuestionAnswers3Text) : (null));
                // read viewModel.screenMode().getValue() != ScreenMode.CREATE_QUESTION ? viewModel.question().getValue().text : null
                viewModelScreenModeScreenModeCREATEQUESTIONViewModelQuestionTextJavaLangObjectNull = ((viewModelScreenModeScreenModeCREATEQUESTION) ? (viewModelQuestionText) : (null));
        }
        // batch finished

        if ((dirtyFlags & 0x40000100L) != 0) {

                // read viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS
                viewModelScreenModeScreenModeSHOWANSWERRESULTS = (viewModelScreenModeGetValue) == (com.zakharov.android.lab3.domain.entity.ScreenMode.SHOW_ANSWER_RESULTS);
            if((dirtyFlags & 0xc5L) != 0) {
                if(viewModelScreenModeScreenModeSHOWANSWERRESULTS) {
                        dirtyFlags |= 0x2000L;
                        dirtyFlags |= 0x20000000L;
                        dirtyFlags |= 0x2000000000L;
                        dirtyFlags |= 0x200000000000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                        dirtyFlags |= 0x10000000L;
                        dirtyFlags |= 0x1000000000L;
                        dirtyFlags |= 0x100000000000L;
                }
            }
            if((dirtyFlags & 0x40000000L) != 0) {
                if(viewModelScreenModeScreenModeSHOWANSWERRESULTS) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }
            if((dirtyFlags & 0x100L) != 0) {
                if(viewModelScreenModeScreenModeSHOWANSWERRESULTS) {
                        dirtyFlags |= 0x800000000L;
                }
                else {
                        dirtyFlags |= 0x400000000L;
                }
            }

            if ((dirtyFlags & 0x40000000L) != 0) {

                    // read viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? @android:string/button_delete_question : null
                    viewModelScreenModeScreenModeSHOWANSWERRESULTSButtonAndroidStringButtonDeleteQuestionJavaLangObjectNull = ((viewModelScreenModeScreenModeSHOWANSWERRESULTS) ? (button.getResources().getString(R.string.button_delete_question)) : (null));
            }
        }
        if ((dirtyFlags & 0x200L) != 0) {



                if (onAnswerQuestionClickListener != null) {
                    // read onAnswerQuestionClickListener::onAnswerQuestionClick
                    onAnswerQuestionClickListenerOnAnswerQuestionClickAndroidViewViewOnClickListener = (((mOnAnswerQuestionClickListenerOnAnswerQuestionClickAndroidViewViewOnClickListener == null) ? (mOnAnswerQuestionClickListenerOnAnswerQuestionClickAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mOnAnswerQuestionClickListenerOnAnswerQuestionClickAndroidViewViewOnClickListener).setValue(onAnswerQuestionClickListener));
                }
        }

        if ((dirtyFlags & 0x40000000000L) != 0) {

                // read viewModel.screenMode().getValue() == ScreenMode.ASK_QUESTION ? @android:string/button_answer_question : viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? @android:string/button_delete_question : null
                viewModelScreenModeScreenModeASKQUESTIONButtonAndroidStringButtonAnswerQuestionViewModelScreenModeScreenModeSHOWANSWERRESULTSButtonAndroidStringButtonDeleteQuestionJavaLangObjectNull = ((viewModelScreenModeScreenModeASKQUESTION) ? (button.getResources().getString(R.string.button_answer_question)) : (viewModelScreenModeScreenModeSHOWANSWERRESULTSButtonAndroidStringButtonDeleteQuestionJavaLangObjectNull));
        }

        if ((dirtyFlags & 0xc1L) != 0) {

                // read viewModel.screenMode().getValue() == ScreenMode.CREATE_QUESTION ? @android:string/button_save_question : viewModel.screenMode().getValue() == ScreenMode.ASK_QUESTION ? @android:string/button_answer_question : viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? @android:string/button_delete_question : null
                viewModelScreenModeScreenModeCREATEQUESTIONButtonAndroidStringButtonSaveQuestionViewModelScreenModeScreenModeASKQUESTIONButtonAndroidStringButtonAnswerQuestionViewModelScreenModeScreenModeSHOWANSWERRESULTSButtonAndroidStringButtonDeleteQuestionJavaLangObjectNull = ((ViewModelScreenModeScreenModeCREATEQUESTION1) ? (button.getResources().getString(R.string.button_save_question)) : (viewModelScreenModeScreenModeASKQUESTIONButtonAndroidStringButtonAnswerQuestionViewModelScreenModeScreenModeSHOWANSWERRESULTSButtonAndroidStringButtonDeleteQuestionJavaLangObjectNull));
        }
        // batch finished

        if ((dirtyFlags & 0x202020002000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.answerResults()
                    viewModelAnswerResults = viewModel.answerResults();
                }
                updateLiveDataRegistration(2, viewModelAnswerResults);


                if (viewModelAnswerResults != null) {
                    // read viewModel.answerResults().getValue()
                    viewModelAnswerResultsGetValue = viewModelAnswerResults.getValue();
                }

            if ((dirtyFlags & 0x200000000000L) != 0) {

                    if (viewModelAnswerResultsGetValue != null) {
                        // read viewModel.answerResults().getValue()[3]
                        viewModelAnswerResults3 = getFromList(viewModelAnswerResultsGetValue, 3);
                    }
            }
            if ((dirtyFlags & 0x2000000000L) != 0) {

                    if (viewModelAnswerResultsGetValue != null) {
                        // read viewModel.answerResults().getValue()[2]
                        viewModelAnswerResults2 = getFromList(viewModelAnswerResultsGetValue, 2);
                    }
            }
            if ((dirtyFlags & 0x2000L) != 0) {

                    if (viewModelAnswerResultsGetValue != null) {
                        // read viewModel.answerResults().getValue()[1]
                        viewModelAnswerResults1 = getFromList(viewModelAnswerResultsGetValue, 1);
                    }
            }
            if ((dirtyFlags & 0x20000000L) != 0) {

                    if (viewModelAnswerResultsGetValue != null) {
                        // read viewModel.answerResults().getValue()[0]
                        viewModelAnswerResults0 = getFromList(viewModelAnswerResultsGetValue, 0);
                    }
            }
        }
        if ((dirtyFlags & 0x800000000L) != 0) {



                if (onDeleteQuestionClickListener != null) {
                    // read onDeleteQuestionClickListener::onDeleteQuestionClick
                    onDeleteQuestionClickListenerOnDeleteQuestionClickAndroidViewViewOnClickListener = (((mOnDeleteQuestionClickListenerOnDeleteQuestionClickAndroidViewViewOnClickListener == null) ? (mOnDeleteQuestionClickListenerOnDeleteQuestionClickAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mOnDeleteQuestionClickListenerOnDeleteQuestionClickAndroidViewViewOnClickListener).setValue(onDeleteQuestionClickListener));
                }
        }

        if ((dirtyFlags & 0xc5L) != 0) {

                // read viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? viewModel.answerResults().getValue()[1] : @android:color/colorBackground
                viewModelScreenModeScreenModeSHOWANSWERRESULTSViewModelAnswerResults1SecondAnswerCheckBoxAndroidColorColorBackground = ((viewModelScreenModeScreenModeSHOWANSWERRESULTS) ? (viewModelAnswerResults1) : (getColorFromResource(secondAnswerCheckBox, R.color.colorBackground)));
                // read viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? viewModel.answerResults().getValue()[0] : @android:color/colorBackground
                viewModelScreenModeScreenModeSHOWANSWERRESULTSViewModelAnswerResults0FirstAnswerCheckBoxAndroidColorColorBackground = ((viewModelScreenModeScreenModeSHOWANSWERRESULTS) ? (viewModelAnswerResults0) : (getColorFromResource(firstAnswerCheckBox, R.color.colorBackground)));
                // read viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? viewModel.answerResults().getValue()[2] : @android:color/colorBackground
                viewModelScreenModeScreenModeSHOWANSWERRESULTSViewModelAnswerResults2ThirdAnswerCheckBoxAndroidColorColorBackground = ((viewModelScreenModeScreenModeSHOWANSWERRESULTS) ? (viewModelAnswerResults2) : (getColorFromResource(thirdAnswerCheckBox, R.color.colorBackground)));
                // read viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? viewModel.answerResults().getValue()[3] : @android:color/colorBackground
                viewModelScreenModeScreenModeSHOWANSWERRESULTSViewModelAnswerResults3FourthAnswerCheckBoxAndroidColorColorBackground = ((viewModelScreenModeScreenModeSHOWANSWERRESULTS) ? (viewModelAnswerResults3) : (getColorFromResource(fourthAnswerCheckBox, R.color.colorBackground)));
        }
        if ((dirtyFlags & 0x100L) != 0) {

                // read viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? onDeleteQuestionClickListener::onDeleteQuestionClick : null
                viewModelScreenModeScreenModeSHOWANSWERRESULTSOnDeleteQuestionClickListenerOnDeleteQuestionClickJavaLangObjectNull = ((viewModelScreenModeScreenModeSHOWANSWERRESULTS) ? (onDeleteQuestionClickListenerOnDeleteQuestionClickAndroidViewViewOnClickListener) : (null));
        }

        if ((dirtyFlags & 0x100000L) != 0) {

                // read viewModel.screenMode().getValue() == ScreenMode.ASK_QUESTION ? onAnswerQuestionClickListener::onAnswerQuestionClick : viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? onDeleteQuestionClickListener::onDeleteQuestionClick : null
                viewModelScreenModeScreenModeASKQUESTIONOnAnswerQuestionClickListenerOnAnswerQuestionClickViewModelScreenModeScreenModeSHOWANSWERRESULTSOnDeleteQuestionClickListenerOnDeleteQuestionClickJavaLangObjectNull = ((viewModelScreenModeScreenModeASKQUESTION) ? (onAnswerQuestionClickListenerOnAnswerQuestionClickAndroidViewViewOnClickListener) : (viewModelScreenModeScreenModeSHOWANSWERRESULTSOnDeleteQuestionClickListenerOnDeleteQuestionClickJavaLangObjectNull));
        }

        if ((dirtyFlags & 0xf9L) != 0) {

                // read viewModel.screenMode().getValue() == ScreenMode.CREATE_QUESTION ? onSaveQuestionClickListener::onSaveQuestionClick : viewModel.screenMode().getValue() == ScreenMode.ASK_QUESTION ? onAnswerQuestionClickListener::onAnswerQuestionClick : viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? onDeleteQuestionClickListener::onDeleteQuestionClick : null
                viewModelScreenModeScreenModeCREATEQUESTIONOnSaveQuestionClickListenerOnSaveQuestionClickViewModelScreenModeScreenModeASKQUESTIONOnAnswerQuestionClickListenerOnAnswerQuestionClickViewModelScreenModeScreenModeSHOWANSWERRESULTSOnDeleteQuestionClickListenerOnDeleteQuestionClickJavaLangObjectNull = ((ViewModelScreenModeScreenModeCREATEQUESTION1) ? (onSaveQuestionClickListenerOnSaveQuestionClickAndroidViewViewOnClickListener) : (viewModelScreenModeScreenModeASKQUESTIONOnAnswerQuestionClickListenerOnAnswerQuestionClickViewModelScreenModeScreenModeSHOWANSWERRESULTSOnDeleteQuestionClickListenerOnDeleteQuestionClickJavaLangObjectNull));
        }
        // batch finished
        if ((dirtyFlags & 0xf9L) != 0) {
            // api target 1

            this.button.setOnClickListener(viewModelScreenModeScreenModeCREATEQUESTIONOnSaveQuestionClickListenerOnSaveQuestionClickViewModelScreenModeScreenModeASKQUESTIONOnAnswerQuestionClickListenerOnAnswerQuestionClickViewModelScreenModeScreenModeSHOWANSWERRESULTSOnDeleteQuestionClickListenerOnDeleteQuestionClickJavaLangObjectNull);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.button, viewModelScreenModeScreenModeCREATEQUESTIONButtonAndroidStringButtonSaveQuestionViewModelScreenModeScreenModeASKQUESTIONButtonAndroidStringButtonAnswerQuestionViewModelScreenModeScreenModeSHOWANSWERRESULTSButtonAndroidStringButtonDeleteQuestionJavaLangObjectNull);
            this.firstAnswerCheckBox.setClickable(ViewModelScreenModeScreenModeSHOWANSWERRESULTS1);
            this.firstAnswerInputField.setVisibility(viewModelScreenModeScreenModeCREATEQUESTIONViewVISIBLEViewINVISIBLE);
            this.fourthAnswerCheckBox.setClickable(ViewModelScreenModeScreenModeSHOWANSWERRESULTS1);
            this.fourthAnswerInputField.setVisibility(viewModelScreenModeScreenModeCREATEQUESTIONViewVISIBLEViewINVISIBLE);
            this.questionOutputField.setVisibility(viewModelScreenModeScreenModeCREATEQUESTIONViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.questionTextInputField, (java.lang.CharSequence) viewModelScreenModeScreenModeASKQUESTIONJavaLangObjectNullJavaLangObjectNull);
            this.questionTextInputField.setVisibility(ViewModelScreenModeScreenModeCREATEQUESTIONViewVISIBLEViewGONE1);
            this.secondAnswerCheckBox.setClickable(ViewModelScreenModeScreenModeSHOWANSWERRESULTS1);
            this.secondAnswerInputField.setVisibility(viewModelScreenModeScreenModeCREATEQUESTIONViewVISIBLEViewINVISIBLE);
            this.thirdAnswerCheckBox.setClickable(ViewModelScreenModeScreenModeSHOWANSWERRESULTS1);
            this.thirdAnswerInputField.setVisibility(viewModelScreenModeScreenModeCREATEQUESTIONViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0xc5L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.firstAnswerCheckBox, androidx.databinding.adapters.Converters.convertColorToDrawable(viewModelScreenModeScreenModeSHOWANSWERRESULTSViewModelAnswerResults0FirstAnswerCheckBoxAndroidColorColorBackground));
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.fourthAnswerCheckBox, androidx.databinding.adapters.Converters.convertColorToDrawable(viewModelScreenModeScreenModeSHOWANSWERRESULTSViewModelAnswerResults3FourthAnswerCheckBoxAndroidColorColorBackground));
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.secondAnswerCheckBox, androidx.databinding.adapters.Converters.convertColorToDrawable(viewModelScreenModeScreenModeSHOWANSWERRESULTSViewModelAnswerResults1SecondAnswerCheckBoxAndroidColorColorBackground));
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.thirdAnswerCheckBox, androidx.databinding.adapters.Converters.convertColorToDrawable(viewModelScreenModeScreenModeSHOWANSWERRESULTSViewModelAnswerResults2ThirdAnswerCheckBoxAndroidColorColorBackground));
        }
        if ((dirtyFlags & 0xc3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.firstAnswerCheckBox, viewModelScreenModeScreenModeCREATEQUESTIONViewModelQuestionAnswers0TextJavaLangObjectNull);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fourthAnswerCheckBox, viewModelScreenModeScreenModeCREATEQUESTIONViewModelQuestionAnswers3TextJavaLangObjectNull);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.questionOutputField, viewModelScreenModeScreenModeCREATEQUESTIONViewModelQuestionTextJavaLangObjectNull);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.secondAnswerCheckBox, viewModelScreenModeScreenModeCREATEQUESTIONViewModelQuestionAnswers1TextJavaLangObjectNull);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.thirdAnswerCheckBox, viewModelScreenModeScreenModeCREATEQUESTIONViewModelQuestionAnswers2TextJavaLangObjectNull);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.zakharov.android.lab3.presentation.view.clicklistener.OnAnswerQuestionClickListener value;
        public OnClickListenerImpl setValue(com.zakharov.android.lab3.presentation.view.clicklistener.OnAnswerQuestionClickListener value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onAnswerQuestionClick(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.zakharov.android.lab3.presentation.view.clicklistener.OnDeleteQuestionClickListener value;
        public OnClickListenerImpl1 setValue(com.zakharov.android.lab3.presentation.view.clicklistener.OnDeleteQuestionClickListener value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onDeleteQuestionClick(arg0); 
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private com.zakharov.android.lab3.presentation.view.clicklistener.OnSaveQuestionClickListener value;
        public OnClickListenerImpl2 setValue(com.zakharov.android.lab3.presentation.view.clicklistener.OnSaveQuestionClickListener value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onSaveQuestionClick(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.screenMode()
        flag 1 (0x2L): viewModel.question()
        flag 2 (0x3L): viewModel.answerResults()
        flag 3 (0x4L): onSaveQuestionClickListener
        flag 4 (0x5L): onDeleteQuestionClickListener
        flag 5 (0x6L): onAnswerQuestionClickListener
        flag 6 (0x7L): viewModel
        flag 7 (0x8L): null
        flag 8 (0x9L): viewModel.screenMode().getValue() == ScreenMode.ASK_QUESTION ? onAnswerQuestionClickListener::onAnswerQuestionClick : viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? onDeleteQuestionClickListener::onDeleteQuestionClick : null
        flag 9 (0xaL): viewModel.screenMode().getValue() == ScreenMode.ASK_QUESTION ? onAnswerQuestionClickListener::onAnswerQuestionClick : viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? onDeleteQuestionClickListener::onDeleteQuestionClick : null
        flag 10 (0xbL): viewModel.screenMode().getValue() != ScreenMode.CREATE_QUESTION ? viewModel.question().getValue().answers[0].text : null
        flag 11 (0xcL): viewModel.screenMode().getValue() != ScreenMode.CREATE_QUESTION ? viewModel.question().getValue().answers[0].text : null
        flag 12 (0xdL): viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? viewModel.answerResults().getValue()[1] : @android:color/colorBackground
        flag 13 (0xeL): viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? viewModel.answerResults().getValue()[1] : @android:color/colorBackground
        flag 14 (0xfL): viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? @android:string/button_delete_question : null
        flag 15 (0x10L): viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? @android:string/button_delete_question : null
        flag 16 (0x11L): viewModel.screenMode().getValue() != ScreenMode.CREATE_QUESTION ? viewModel.question().getValue().answers[1].text : null
        flag 17 (0x12L): viewModel.screenMode().getValue() != ScreenMode.CREATE_QUESTION ? viewModel.question().getValue().answers[1].text : null
        flag 18 (0x13L): viewModel.screenMode().getValue() == ScreenMode.CREATE_QUESTION ? View.VISIBLE : View.INVISIBLE
        flag 19 (0x14L): viewModel.screenMode().getValue() == ScreenMode.CREATE_QUESTION ? View.VISIBLE : View.INVISIBLE
        flag 20 (0x15L): viewModel.screenMode().getValue() == ScreenMode.CREATE_QUESTION ? onSaveQuestionClickListener::onSaveQuestionClick : viewModel.screenMode().getValue() == ScreenMode.ASK_QUESTION ? onAnswerQuestionClickListener::onAnswerQuestionClick : viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? onDeleteQuestionClickListener::onDeleteQuestionClick : null
        flag 21 (0x16L): viewModel.screenMode().getValue() == ScreenMode.CREATE_QUESTION ? onSaveQuestionClickListener::onSaveQuestionClick : viewModel.screenMode().getValue() == ScreenMode.ASK_QUESTION ? onAnswerQuestionClickListener::onAnswerQuestionClick : viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? onDeleteQuestionClickListener::onDeleteQuestionClick : null
        flag 22 (0x17L): viewModel.screenMode().getValue() != ScreenMode.CREATE_QUESTION ? View.VISIBLE : View.GONE
        flag 23 (0x18L): viewModel.screenMode().getValue() != ScreenMode.CREATE_QUESTION ? View.VISIBLE : View.GONE
        flag 24 (0x19L): viewModel.screenMode().getValue() == ScreenMode.CREATE_QUESTION ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): viewModel.screenMode().getValue() == ScreenMode.CREATE_QUESTION ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): viewModel.screenMode().getValue() != ScreenMode.CREATE_QUESTION ? viewModel.question().getValue().answers[2].text : null
        flag 27 (0x1cL): viewModel.screenMode().getValue() != ScreenMode.CREATE_QUESTION ? viewModel.question().getValue().answers[2].text : null
        flag 28 (0x1dL): viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? viewModel.answerResults().getValue()[0] : @android:color/colorBackground
        flag 29 (0x1eL): viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? viewModel.answerResults().getValue()[0] : @android:color/colorBackground
        flag 30 (0x1fL): viewModel.screenMode().getValue() == ScreenMode.ASK_QUESTION ? @android:string/button_answer_question : viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? @android:string/button_delete_question : null
        flag 31 (0x20L): viewModel.screenMode().getValue() == ScreenMode.ASK_QUESTION ? @android:string/button_answer_question : viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? @android:string/button_delete_question : null
        flag 32 (0x21L): viewModel.screenMode().getValue() != ScreenMode.CREATE_QUESTION ? viewModel.question().getValue().answers[3].text : null
        flag 33 (0x22L): viewModel.screenMode().getValue() != ScreenMode.CREATE_QUESTION ? viewModel.question().getValue().answers[3].text : null
        flag 34 (0x23L): viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? onDeleteQuestionClickListener::onDeleteQuestionClick : null
        flag 35 (0x24L): viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? onDeleteQuestionClickListener::onDeleteQuestionClick : null
        flag 36 (0x25L): viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? viewModel.answerResults().getValue()[2] : @android:color/colorBackground
        flag 37 (0x26L): viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? viewModel.answerResults().getValue()[2] : @android:color/colorBackground
        flag 38 (0x27L): viewModel.screenMode().getValue() == ScreenMode.ASK_QUESTION ? null : null
        flag 39 (0x28L): viewModel.screenMode().getValue() == ScreenMode.ASK_QUESTION ? null : null
        flag 40 (0x29L): viewModel.screenMode().getValue() != ScreenMode.CREATE_QUESTION ? viewModel.question().getValue().text : null
        flag 41 (0x2aL): viewModel.screenMode().getValue() != ScreenMode.CREATE_QUESTION ? viewModel.question().getValue().text : null
        flag 42 (0x2bL): viewModel.screenMode().getValue() == ScreenMode.CREATE_QUESTION ? @android:string/button_save_question : viewModel.screenMode().getValue() == ScreenMode.ASK_QUESTION ? @android:string/button_answer_question : viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? @android:string/button_delete_question : null
        flag 43 (0x2cL): viewModel.screenMode().getValue() == ScreenMode.CREATE_QUESTION ? @android:string/button_save_question : viewModel.screenMode().getValue() == ScreenMode.ASK_QUESTION ? @android:string/button_answer_question : viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? @android:string/button_delete_question : null
        flag 44 (0x2dL): viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? viewModel.answerResults().getValue()[3] : @android:color/colorBackground
        flag 45 (0x2eL): viewModel.screenMode().getValue() == ScreenMode.SHOW_ANSWER_RESULTS ? viewModel.answerResults().getValue()[3] : @android:color/colorBackground
    flag mapping end*/
    //end
}