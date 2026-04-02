package com.victor.translator.utils

object LanguageData {
    // A sample map of the languages ML Kit supports
    // You can expand this to all 100+ codes
    val languages = mapOf(
        "English" to "en",
        "Swahili" to "sw",
        "French" to "fr",
        "Spanish" to "es",
        "German" to "de",
        "Arabic" to "ar",
        "Hindi" to "hi"
    )
    
    fun getLanguageNames() = languages.keys.toList()
    fun getCode(name: String) = languages[name] ?: "en"
}