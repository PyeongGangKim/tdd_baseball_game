import java.util.Scanner



class Game(
    private val computer: Computer,
    private val user: User
) {
    private var isDone : Boolean = false
    private var isContinue : Boolean = true
    private var answer : List<Int> = emptyList()
    private var userAnswer: List<Int> = emptyList()
    var scanner: Scanner = Scanner(System.`in`)

    fun start() {
        while(isContinue) {
            startGame()
            println(GAME_MENT)
            val continueGameNumber = scanner.nextInt()

        }
    }

    private fun startGame() {
        answer = computer.generateNum()
        do {
            // user한테 입력받기
            userAnswer = user.getUserAnswer()
            // user 입력과 answer과 비교 후 힌트 or game 끝내기

        } while (isDone)
    }

    fun checkAnswer() {

    }

    companion object {
        private const val GAME_MENT = "새로운 게임 시작(1), 게임 종료(2)"
    }
}