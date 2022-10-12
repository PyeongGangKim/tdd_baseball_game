import java.util.*

class Computer {
    private val nums: MutableSet<Int> = mutableSetOf()
    fun generateNum(): List<Int> {
        while(nums.size != 3) {
            nums.add(Random().nextInt())
        }
        return nums.toList()
    }

}
