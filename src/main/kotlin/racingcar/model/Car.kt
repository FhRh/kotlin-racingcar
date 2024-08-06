package racingcar.model

data class Car (val name : String, var position : Int = 0){
    fun move(){
        position++
    }

    fun printNowPosition(){
        println(name+" : "+("-".repeat(position)))
    }
}