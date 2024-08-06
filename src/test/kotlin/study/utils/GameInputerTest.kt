package study.utils

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.utils.GameInputer
import java.io.ByteArrayInputStream
import java.io.InputStream


class GameInputerTest {
    private val gameInputer = GameInputer
    @Test
    fun 자동차_이름을_입력받아_쉼표_기준으로_구분한다(){
        //given
        val expected: List<String> = listOf("apple", "banana", "cherry")
        val input = "apple,banana,cherry"
        val simulatedInput: InputStream = ByteArrayInputStream(input.toByteArray())
        System.setIn(simulatedInput)

        //when
        val result = gameInputer.getCarNames()

        //then
        assertThat(result).isEqualTo(expected)
    }
}