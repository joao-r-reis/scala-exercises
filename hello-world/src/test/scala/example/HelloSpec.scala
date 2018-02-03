package example

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    Hello.greeting shouldEqual "hello"
  }

  // just to see if I can put 2 tests in same spec class
  "The Hello object2" should "say hello" in {
    Hello.greeting shouldEqual "hello"
  }
}
