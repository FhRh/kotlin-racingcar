package racingcar.controller

import racingcar.model.Cars
import racingcar.model.RandomDice
import racingcar.utils.GameInputer
import racingcar.view.GameAnnouncer

class GameController {
    private val cars = Cars()
    private var rounds = 0

    fun ready(){
        GameAnnouncer.askForCarNames()
        val carNames = GameInputer.getCarNames()
        cars.initCars(carNames)

        GameAnnouncer.askForRounds()
        val inputRounds = GameInputer.getRounds()
        rounds = inputRounds
    }

    fun process() {
        for (i in 1..rounds) {
            processRound()
        }
    }

    fun end() {
    }

    private fun processRound(){
        val carNum = cars.getSize()
        for(i in 1..carNum){
            val diceNum = RandomDice.rollDice()
            if(diceNum>=4){
                cars.moveCar(i)
            }
        }
    }
}