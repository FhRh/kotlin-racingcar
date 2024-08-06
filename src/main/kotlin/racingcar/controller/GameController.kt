package racingcar.controller

import racingcar.model.Cars
import racingcar.utils.GameInputer
import racingcar.view.GameAnnouncer

class GameController {
    private val gameAnnouncer = GameAnnouncer
    private val gameInputer = GameInputer
    private val cars = Cars()
    private var rounds = 0

    fun ready(){
        gameAnnouncer.askForCarNames()
        val carNames = gameInputer.getCarNames()
        cars.initCars(carNames)

        gameAnnouncer.askForRounds()
        val inputRounds = gameInputer.getRounds()
        rounds = inputRounds
    }

    fun process() {
    }

    fun end() {
    }
}