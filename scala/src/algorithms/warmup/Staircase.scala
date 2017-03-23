package algorithms.warmup

object Staircase {
  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readLine().toInt
    for (i <- 0 until n) {
      val spaces = List.range(0, (n - 1) - i).map(_ => " ").fold("")(_ + _)
      val pounds = List.range(0, i + 1).map(_ => "#").reduce(_ + _)
      println(spaces + pounds)
    }
  }
}
