package misc

data class Car(var color: String = "BLACK",
               var brand: String = "",
               var type: String = "",
               var transmission: String = "MANUAL",
               var year: Int = 2000) {
    fun setColor(nColor: String): Car = apply {color = nColor}
    fun setBrand(nBrand: String): Car = apply {brand = nBrand}
    fun setType(nType: String): Car = apply {type = nType}
    fun setTransmission(nTranmission: String): Car = apply {transmission = nTranmission}
    fun setYear(nYear: Int): Car = apply { year = nYear}
    fun print() = println("Brand : $brand\nType : $type\nColor : $color\nTransmission : $transmission\nYear : $year")
}

fun main(args: Array<String>) {
    val mazda2 = Car().setColor("RED")
            .setBrand("Mazda")
            .setType("Mazda-2")
            .setTransmission("AUTO")
            .setYear(2018)
    mazda2.print()
}