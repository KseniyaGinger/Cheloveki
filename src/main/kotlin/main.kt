fun main () {

    val likes = 2
    var name = "Человек"

    var result = if ((likes % 100 == 12) || (likes % 100 == 13) || (likes % 100 == 14)) {
        name
    } else if ((likes % 10 == 2) || (likes % 10 == 3) || (likes % 10 == 4)) {
        name + "а"
    } else {
        name
    }

    println("правильное окончание: $result")





}