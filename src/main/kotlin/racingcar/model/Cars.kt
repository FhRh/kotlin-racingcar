package racingcar.model

class Cars() {
    private var carList : List<Car> = ArrayList()
    fun initCars(carNames : List<String>){
        val cars = carNames.map {Car(it)}
        carList = cars
    }

    fun getCarList():List<Car>{
        return carList.map{it.copy()}
    }
}