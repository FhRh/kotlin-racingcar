package study.game

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.view.GameAnnouncer

class GameAnnouncerTest {
    private val gameAnnouncer = GameAnnouncer
    @Test
    fun 이름_입력_안내문구_출력(){
        assertThat(gameAnnouncer.askForCarNames()).isEqualTo("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    }
}