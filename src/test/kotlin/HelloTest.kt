import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class HelloTest : StringSpec({
    "should return greeting message" {
        val hello = Hello()
        hello.greet() shouldBe "Hello, World!"
    }
})