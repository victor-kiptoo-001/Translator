package com.victor.translator.api

import com.google.mlkit.nl.translate.TranslateLanguage
import com.google.mlkit.nl.translate.Translation
import com.google.mlkit.nl.translate.TranslatorOptions
import kotlinx.coroutines.tasks.await

class TranslatorEngine {
    suspend fun translateText(text: String, sourceLang: String, targetLang: String): String {
        val options = TranslatorOptions.Builder()
            .setSourceLanguage(sourceLang)
            .setTargetLanguage(targetLang)
            .build()
        
        val translator = Translation.getClient(options)
        
        return try {
            // Ensure the model is downloaded before translating
            translator.downloadModelIfNeeded().await()
            translator.translate(text).await()
        } catch (e: Exception) {
            "Error: ${e.message}"
        } finally {
            translator.close()
        }
    }
}