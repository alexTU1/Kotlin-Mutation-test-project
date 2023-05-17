import java.text.DecimalFormat



fun main() {
    val amount = 100.0 // Amount to convert
    val currencies = listOf("JPY", "CAD", "AUD", "GBP", "KWD", "BHD", "EUR", "CHF", "CNH")

    for (currency in currencies) {
        // Convert currency to USD and output result
        val usdAmount = convertCurrencyToUsd(amount, currency)
        println("$amount $currency is equivalent to $usdAmount USD")
    }
}

fun convertJpyToUsd(amount: Double): Double {
    val jpyToUsdRate = 0.0091
    return amount * jpyToUsdRate
}

fun convertCadToUsd(amount: Double): Double {
    val cadToUsdRate = 0.81
    return amount * cadToUsdRate
}

fun convertAudToUsd(amount: Double): Double {
    val audToUsdRate = 0.76
    return amount * audToUsdRate
}

fun convertGbpToUsd(amount: Double): Double {
    val gbpToUsdRate = 1.39
    return amount * gbpToUsdRate
}

fun convertKwdToUsd(amount: Double): Double {
    val kwdToUsdRate = 3.31
    return amount * kwdToUsdRate
}

fun convertBhdToUsd(amount: Double): Double {
    val bhdToUsdRate = 2.65
    return amount * bhdToUsdRate
}

fun convertEurToUsd(amount: Double): Double {
    val eurToUsdRate = 1.17
    return amount * eurToUsdRate
}

fun convertChfToUsd(amount: Double): Double {
    val chfToUsdRate = 1.07
    return amount * chfToUsdRate
}

fun convertCnhToUsd(amount: Double): Double {
    val cnhToUsdRate = 0.15
    return amount * cnhToUsdRate
}

fun convertCurrencyToUsd(amount: Double, currency: String): Double {
    return when (currency) {
        "JPY" -> convertJpyToUsd(amount)
        "CAD" -> convertCadToUsd(amount)
        "AUD" -> convertAudToUsd(amount)
        "GBP" -> convertGbpToUsd(amount)
        "KWD" -> convertKwdToUsd(amount)
        "BHD" -> convertBhdToUsd(amount)
        "EUR" -> convertEurToUsd(amount)
        "CHF" -> convertChfToUsd(amount)
        "CNH" -> convertCnhToUsd(amount)
        else -> throw IllegalArgumentException("Invalid currency: $currency")
    }
}