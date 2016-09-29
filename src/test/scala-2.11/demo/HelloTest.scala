package demo

import org.scalatest.FunSuite

/**
  * Created by dsegal on 9/28/16.
  */
class HelloTest extends FunSuite {
  test("sayHello function work correctly") {
    val hello = new Hello
    assert(hello.sayHello("Scala") == "Hello, Scala")
  }
  test("greet function") {
    val helloInstance = new Hello
    val name:String = "Doron"
    assert(helloInstance.greet(name) == s"Hi, $name")
  }
}
