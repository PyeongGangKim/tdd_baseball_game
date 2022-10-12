import java.util.*

class User {
    private val answer: MutableList<Int> = mutableListOf()
    fun getUserAnswer() : List<Int>{
        val scanner = Scanner(System.`in`)
        while(answer.size != 3) {
            val input = scanner.nextInt()
            if(!answer.contains(input)) {
                answer.add(input)
            }
        }
        return answer
    }
}


