import kotlin.properties.Delegates

class Game(
    private val computer: Computer,
    private val user: User
) {
    private var isDone : Boolean = false
    private var answer : List<Int> = emptyList()
    private var userAnswer: List<Int> = emptyList()

    fun start() {
       answer = computer.generateNum()
       do {
           // user한테 입력받기
           user.getUserAnswer()
           // user 입력과 answer과 비교 후 힌트 or game 끝내기
       } while (isDone)
    }
}