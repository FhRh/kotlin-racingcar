package study.model

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
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
        val resultNames = cars.getCarList().map{it.name}
        assertEquals(expectedNames, resultNames)

        val resultPositions = cars.getCarList().map{it.position}
        assertEquals(expectedPositions, resultPositions)

    }

    @Test
    fun `특정 위치의 자동차를 한 칸 움직인다`(){
        //given
        val carNames : List<String> = listOf("apple", "banana", "cherry")
        cars.initCars(carNames)

        //when
        cars.moveCar(1)

        //then
        val carList = cars.getCarList()
        assertEquals(carList[0].position, 1)
    }
}