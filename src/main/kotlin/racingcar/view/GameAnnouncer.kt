package racingcar.view

import racingcar.model.Cars

object GameAnnouncer {
    private const val NAME_INPUT_DESCRIPTION = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)."
    private const val ROUNDS_INPUT_DESCRIPTION = "시도할 횟수는 몇 회인가요?"
    private const val PROCESSING_DESCRIPTION = "실행결과"

    fun askForCarNames(){
        println(NAME_INPUT_DESCRIPTION)
    }
    fun askForRounds() {
        println(ROUNDS_INPUT_DESCRIPTION)
    }
    fun printCarPositions(cars : Cars){
        cars.printCarsPositions()
    }
    fun printWinners(cars: Cars) {
        cars.printWinners()
    }
    fun printProcess() {
        println(PROCESSING_DESCRIPTION)
    }
}