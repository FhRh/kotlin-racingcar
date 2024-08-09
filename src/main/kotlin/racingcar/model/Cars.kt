package racingcar.model

class Cars(private val carList:List<Car>) {
    val size: Int
        get() = carList.size

    init{
        val nameSet = mutableSetOf<String>()
        for (car in carList) {
            if (!nameSet.add(car.name)) {
                throw IllegalArgumentException("중복된 차 이름이 있습니다 : ${car.name}")
            }
        }
    }

    fun getCarList():List<Car>{
        return carList.map{it.copy()}
    }

    fun moveCar(index : Int){
        carList[index-1].move()
    }

    fun printCarsPositions(){
        carList.forEach{it.printNowPosition()}
        println()
    }

    fun printWinners(){
        val winners : List<String> = getWinnerNames()
        val winnerNames = winners.joinToString(", ") { it }
        println("최종 우승자 : $winnerNames")
    }

    fun getWinnerNames():List<String>{
        val maxPosition = carList.maxOf { it.position }
        return carList.filter { it.position == maxPosition }
            .map { it.name }
    }
}