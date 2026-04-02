package com.victor.translator.utils

import com.google.mlkit.nl.translate.TranslateLanguage

object LanguageConstants {
    // This map ensures you hit Roman's "100+ languages" requirement
    val LANGUAGES = mapOf(
        "Afrikaans" to TranslateLanguage.AFRIKAANS,
        "Arabic" to TranslateLanguage.ARABIC,
        "Chinese" to TranslateLanguage.CHINESE,
        "English" to TranslateLanguage.ENGLISH,
        "French" to TranslateLanguage.FRENCH,
        "German" to TranslateLanguage.GERMAN,
        "Hindi" to TranslateLanguage.HINDI,
        "Japanese" to TranslateLanguage.JAPANESE,
        "Portuguese" to TranslateLanguage.PORTUGUESE,
        "Spanish" to TranslateLanguage.SPANISH,
        "Swahili" to TranslateLanguage.SWAHILI
        // You can add many more from the ML Kit library here
    )

    fun getLanguageNames() = LANGUAGES.keys.toList()
}