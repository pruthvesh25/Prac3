object Factorial {
  def factorial(n: Int): Int = {
    if (n == 0 || n == 1) {
      1
    } else {
      n * factorial(n - 1)
    }
  }

  def main(args: Array[String]): Unit = {
    val number = 5 
    val result = factorial(number)
    println(s"Factorial of $number is: $result")
  }
}


object main {
  def main(args: Array[String]): Unit = {
    println("Hello, Scala!")
  }
}

object Prime {
  def main(args: Array[String]): Unit = {
    def Prime(i: Int): Boolean = {
      if (i <= 1)
        false
      else if (i == 2)
        true
      else
        !(2 to (i - 1)).exists(x => i % x == 0)
    }

    (1 to 10).foreach(i => if (Prime(i)) println("%d is prime".format(i)))
  }
}
