package com.example.practicatestingsinsoluciones

/**
 * Ecuacion en formato:
 *
 * ax + b = c
 *
 * a : parte1
 * b : parte2
 * + : operador
 * c: parte3
 *
 * Solucion:
 * x = (c - b) / a
 * es decir:
 *
 * x = (parte3 - parte2)/parte1
 */
class EcuacionPrimerGrado {
    private val parseador = Parseador()
    fun obtenerResultado(ecuacion: String): Double {
        val parte1 = parseador.obtenerParte1(ecuacion)
        val parte2 = parseador.obtenerParte2(ecuacion)
        val parte3 = parseador.obtenerParte3(ecuacion)
        return java.lang.Double.valueOf((parte3 - parte2).toDouble()) / java.lang.Double.valueOf(
            parte1.toDouble()
        )
    }
}