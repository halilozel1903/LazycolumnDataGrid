package com.halil.ozel.recyclerviewsample

fun genreToEmoji(genre: String): String {
    val lower = genre.lowercase()
    return when {
        "hip hop" in lower || "rap" in lower -> "\uD83C\uDF99" // studio microphone
        "reggaeton" in lower || "latin" in lower -> "\uD83C\uDFB6"
        "country" in lower -> "\uD83E\uDD20"
        "dance" in lower -> "\uD83D\uDC83"
        "indie" in lower -> "\uD83C\uDFB8"
        else -> "\uD83C\uDFB5"
    }
}

fun nationToFlag(nation: String): String = when (nation) {
    "USA" -> "\uD83C\uDDFA\uD83C\uDDF8"
    "Trinidad and Tobago" -> "\uD83C\uDDF9\uD83C\uDDF9"
    "Canada" -> "\uD83C\uDDE8\uD83C\uDDE6"
    "Italy" -> "\uD83C\uDDEE\uD83C\uDDF9"
    "Colombia" -> "\uD83C\uDDE8\uD83C\uDDF4"
    "Dominican Republic" -> "\uD83C\uDDE9\uD83C\uDDF4"
    "Greece" -> "\uD83C\uDDEC\uD83C\uDDF7"
    "UK" -> "\uD83C\uDDEC\uD83C\uDDE7"
    else -> ""
}
