import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldNotBe
import kotlin.test.Test

class Test {
    @Test
    fun test() {
        fun x() {
            println("in the code there is x")
        }

        x()
        println("Hello, ${Platform.name}!")
    }
}
