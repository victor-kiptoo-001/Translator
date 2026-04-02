package com.victor.translator.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.victor.translator.repository.TranslationRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class TranslatorViewModel(private val repository: TranslationRepository) : ViewModel() {
    val translationResult = MutableStateFlow("")

    fun translate(text: String, from: String, to: String) {
        viewModelScope.launch {
            val result = repository.getTranslation(text, from, to)
            translationResult.value = result
        }
    }
}