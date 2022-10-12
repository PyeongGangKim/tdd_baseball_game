package unit

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Game {

    @Test
    @DisplayName("들어온 숫자에서 같은 자리에 같은 숫자의 갯수만큼 스트라이크를 내보낸다.")
    fun returnStrikeSameLocation() {

    }

    @Test
    @DisplayName("다른 자리에 같은 숫자가 있을 경우 볼을 내보낸다.")
    fun returnBallSameNumberDifferentLocation() {

    }

    @Test
    @DisplayName("들어온 숫자에서 같은 자리에 같은 숫자가 있으면 strike, 다른 자리에 있으면 ball을 내보낸다.")
    fun returnBallAndStrikeSameNumberDifferentLocationAndSameNumberSameLocation(){}

    @Test
    @DisplayName("같은 숫자가 아무것도 없으면 nothing을 내보낸다.")
    fun returnDifferentNumber() {

    }

    @Test
    @DisplayName("3스트라이크가 나오면 게임이 끝난다.")
    fun threeStrikeGameDone() {

    }
}