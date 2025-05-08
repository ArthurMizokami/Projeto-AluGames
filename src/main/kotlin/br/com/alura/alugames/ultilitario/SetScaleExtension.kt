package br.com.alura.alugames.ultilitario

import java.math.RoundingMode
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

fun Double.formatoComDuasCasasDecimais(): Double {
    val decimalFormat = DecimalFormat("#.00", DecimalFormatSymbols(Locale.US))
    return decimalFormat.format(this).toDouble()
    }