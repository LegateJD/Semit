package com.zakharov.android.lab3.domain.repository;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.zakharov.android.lab3.data.entity.Question;

public interface QuestionRepository {

    @Nullable
    Question getQuestion();

    void saveQuestion(@NonNull Question question);

    void deleteQuestion();
}
