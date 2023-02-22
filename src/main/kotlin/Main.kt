import java.util.*

fun main() {
    names()
    towns()
    println(names("SOLIAN","CHESTA","TALAI"))













     }
fun names() {
    var girls = arrayOf("Lyn","Morin","Chloe","Marion")
    println(girls.contentToString())


}

fun towns() {
    var cities = arrayOf("harare","mumbai","dodoma","jakata")
    cities.forEach { city -> println(city.capitalize()) }

    var numArray = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
      var  sum =(numArray[1])+(numArray[4])
    println(sum)

    var index = numArray.indexOf(158)
    println(index)

    var sortedNums = numArray.sortedArray()
    println(Arrays.toString(sortedNums)) }

fun names (nameA: String ,nameB: String ,nameC: String): String{
    var schools = arrayOf(nameA,nameB,nameC)
    return schools.contentToString()


}

