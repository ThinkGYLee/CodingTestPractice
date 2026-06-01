fun main() {
    val n = readLine()!!.toInt()
    val forecasts = mutableListOf<Triple<String, String, String>>()
    for (i in 1..n) {
        val (date, day, weather) = readln().split(" ")
        forecasts.add(Triple(date, day, weather))
    }
    // Please write your code here.
    val filteredForecasts = forecasts.filter{ it.third == "Rain" }
    val mappedForecasts = filteredForecasts.map{
        val (y, m, d) = it.first.split("-")
        DayInfo(
            year = y.toInt(),
            month = m.toInt(),
            day = d.toInt(),
            yo = it.second,
            weather = it.third
        )
    }
    val sortedForecasts = mappedForecasts.sortedBy{it.year}
    val first = sortedForecasts.first()
    val yearFiltered = sortedForecasts.filter{ it.year == first.year}
    val monthSorted = yearFiltered.sortedBy{ it.month }
    val second = monthSorted.first()
    val monthFiltered = monthSorted.filter{ it.month == second.month }
    val daySorted = monthFiltered.sortedBy{ it.day }
    val result = daySorted.first()
    println("${result.year}-${String.format("%02d", result.month)}-${String.format("%02d", result.day)} ${result.yo} ${result.weather}")
}

data class DayInfo(
    val year: Int,
    val month: Int,
    val day: Int,
    val yo: String,
    val weather: String
)