package racingcar.controller

import racingcar.model.Car
import racingcar.model.Cars
import racingcar.model.RandomDice
import racingcar.utils.GameInputer
import racingcar.view.GameAnnouncer

class GameController {
    fun run(){
        GameAnnouncer.askForCarNames()
        val carNames = GameInputer.getCarNames()
        val carList = carNames.map { name -> Car(name) }
        val cars = Cars(carList)

        GameAnnouncer.askForRounds()
        val rounds = GameInputer.getRounds()

        GameAnnouncer.printProcess()
        for (i in 1..rounds) {
            processRound(cars)
        }

        GameAnnouncer.printWinners(cars)

    }

    private fun processRound(cars: Cars) {
        val carNum = cars.size
        for (i in 1..carNum) {
            if (RandomDice.rollDice() >= 4) {
                cars.moveCar(i)
            }
        }
        GameAnnouncer.printCarPositions(cars)
    }
}