package study.model

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import racingcar.model.Cars

class CarsTest {
    private val cars = Cars()
    @Test
    fun `자동차 이름 리스트로 자동차 객체들의 집합을 생성한다`(){
        //given
        val carNames : List<String> = listOf("apple", "banana", "cherry")
        val expectedNames : List<String> = listOf("apple", "banana", "cherry")
        val expectedPositions : List<Int> = listOf(0,0,0)

        //when
        cars.initCars(carNames)

        //then
        val resultNames = cars.carList.map{it.name}
        assertEquals(expectedNames, resultNames)

        val resultPositions = cars.carList.map{it.position}
        assertEquals(expectedPositions, resultPositions)

    }
}