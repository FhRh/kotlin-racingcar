package racingcar

import racingcar.controller.GameController

fun main() {
    val gameController = GameController()
    gameController.ready()
    gameController.process()
    gameController.end()
}
