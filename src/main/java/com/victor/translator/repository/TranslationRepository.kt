package com.victor.translator.repository

import com.victor.translator.api.TranslatorEngine

class TranslationRepository(private val engine: TranslatorEngine) {
    suspend fun getTranslation(text: String, from: String, to: String): String {
        return engine.translateText(text, from, to)
    }
}