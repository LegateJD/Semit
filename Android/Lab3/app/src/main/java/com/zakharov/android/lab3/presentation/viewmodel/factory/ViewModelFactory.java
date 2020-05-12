package com.zakharov.android.lab3.presentation.viewmodel.factory;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.zakharov.android.lab3.domain.repository.QuestionRepository;
import com.zakharov.android.lab3.presentation.viewmodel.QuizViewModel;
import com.zakharov.android.lab3.presentation.viewmodel.util.ResourcesProvider;

public class ViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private final QuestionRepository questionRepository;
    private final ResourcesProvider resourcesProvider;

    public ViewModelFactory(@NonNull QuestionRepository questionRepository, @NonNull ResourcesProvider resourcesProvider) {
        this.questionRepository = questionRepository;
        this.resourcesProvider = resourcesProvider;
    }

    @NonNull
    @Override
    @SuppressWarnings("unchecked")
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass == QuizViewModel.class) {
            return (T) new QuizViewModel(questionRepository, resourcesProvider);
        }
        return null;
    }
}
