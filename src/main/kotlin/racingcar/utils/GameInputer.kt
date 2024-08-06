package racingcar.utils

object GameInputer {
    fun getCarNames() : List<String>{
        val inputString = readln()
        return inputString.split(",").map { it.trim() }
    }

    fun getRounds() : Int{
        val input = readlnOrNull()
        return input?.toIntOrNull() ?: throw IllegalArgumentException("유효한 정수를 입력하지 않았습니다.")
    }
}