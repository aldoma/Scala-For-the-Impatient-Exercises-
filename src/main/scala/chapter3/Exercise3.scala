package chapter3

/*
Repeat the preceding assignment, but produce a new array with the swapped
values. Use for / yield .
 */
object Exercise3 extends App {

  def swap(c: Array[Int]) = {
    for (i <- c.indices) yield {
      if (i % 2 == 0)
        if (i == c.length - 1) c(i)
        else c(i + 1)
      else c(i - 1)
    }
  }

  val array = Array(1, 2, 3, 4, 5)

  println(swap(array).mkString(", "))
  println(swap(array :+ 6).mkString(", "))
}
