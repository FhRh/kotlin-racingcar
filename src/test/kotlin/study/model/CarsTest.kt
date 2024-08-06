package study.model

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import racingcar.model.Car
import racingcar.model.Cars

class CarsTest {

    @Test
    fun `자동차 이름 리스트로 자동차 객체들의 집합을 생성한다`(){
        //given
        val car1 = Car("apple")
        val car2 = Car("banana")
        val car3 = Car("cherry")
        val expected = listOf(car1, car2, car3)

        //when
        val cars = Cars(listOf(car1,car2,car3))

        //then
        val result = cars.getCarList()

        assertEquals(expected, result)
    }

    @Test
    fun `특정 위치의 자동차를 한 칸 움직인다`(){
        //given
        val expected = 1
        val car1 = Car("apple")
        val car2 = Car("banana")
        val car3 = Car("cherry")
        val cars = Cars(listOf(car1,car2,car3))

        //when
        cars.moveCar(1)

        //then
        val carList = cars.getCarList()
        assertEquals(carList[0].position, 1)
    }

    @Test
    fun `우승한 차들의 이름을 출력한다`(){
        //given
        val expected = listOf("apple", "banana")
        val car1 = Car("apple", 2)
        val car2 = Car("banana", 2)
        val car3 = Car("cherry", 1)
        val cars = Cars(listOf(car1,car2,car3))

        //when
        val result = cars.getWinnerNames()

        //then
        assertEquals(expected,result)
    }
}