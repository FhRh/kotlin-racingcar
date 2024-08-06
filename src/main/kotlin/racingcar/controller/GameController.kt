package racingcar.controller

import racingcar.model.Car
import racingcar.model.Cars
import racingcar.model.RandomDice
import racingcar.utils.GameInputer
import racingcar.view.GameAnnouncer

class GameController {
    private var cars : Cars? = null
    private var rounds = 0

    fun ready(){
        GameAnnouncer.askForCarNames()
        val carNames = GameInputer.getCarNames()
        val carList = carNames.map { name -> Car(name) }
        cars = Cars(carList)

        GameAnnouncer.askForRounds()
        val inputRounds = GameInputer.getRounds()
        rounds = inputRounds
    }

    fun process() {
        GameAnnouncer.printProcess()
        for (i in 1..rounds) {
            processRound()
        }
    }

    fun end() {
        cars?.printWinners()
    }

    private fun processRound(){
        val carNum = cars?.size ?:0
        for(i in 1..carNum){
            val diceNum = RandomDice.rollDice()
            if(diceNum>=4){
                cars?.moveCar(i)
            }
        }

        cars?.printCarsPositions()
    }
}