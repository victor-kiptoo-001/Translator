package com.victor.translator.model

data class TranslationResult(
    val originalText: String,
    val translatedText: String,
    val sourceLangCode: String,
    val targetLangCode: String
)