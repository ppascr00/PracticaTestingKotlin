package com.example.practicatestingsinsoluciones

class Parseador {
    fun obtenerParte1(ecuacion: String): Int {
        val partes1 = obtenerPartes12(ecuacion)
        val parte1 = partes1[0].trim()
        return Integer.valueOf(parte1.substring(0, parte1.length - 1))
    }

    fun obtenerParte2(ecuacion: String): Int {
        val partes1 = obtenerPartes12(ecuacion)
        val parte2 = partes1[1].trim { it <= ' ' }
        val operador = obtenerOperador(ecuacion)
        return if ("-" == operador) {
            Integer.valueOf(parte2) * -1
        } else Integer.valueOf(parte2)
    }

    fun obtenerOperador(ecuacion: String): String {
        return if (ecuacion.indexOf('+') > 0) {
            "+"
        } else {
            "-"
        }
    }

    fun obtenerParte3(ecuacion: String): Int {
        val partesEcuacion = ecuacion.split("=").toTypedArray()
        return Integer.valueOf(partesEcuacion[1].trim { it <= ' ' })
    }

    private fun obtenerPartes12(ecuacion: String): Array<String> {
        val partesEcuacion = ecuacion.split("=").toTypedArray()
        val operador = obtenerOperador(ecuacion)
        return partesEcuacion[0].split(operador).toTypedArray()
    }
}