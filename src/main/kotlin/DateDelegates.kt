package org.example

import com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year
import java.util.Calendar

data class MyDate(val year: Int, val month: Int, val day: Int)

fun MyDate.toMillis(): Long {
    // Convert MyDate to milliseconds (this is a simplified example)
    val calendar = Calendar.getInstance()
    calendar.set(year, month, day)
    return calendar.timeInMillis
}

