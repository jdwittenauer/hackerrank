package algorithms.warmup

object MinimaxSum {
  def main(args: Array[String]): Unit = {
    val a = scala.io.StdIn.readLine().split(" ").map(_.toLong)
    var (min, max) = (Long.MaxValue, Long.MinValue)

    for (i <- a.indices) {
      val sum = a.slice(0, i).sum + a.slice(i + 1, a.length).sum
      if (sum < min) min = sum
      if (sum > max) max = sum
    }

    printf("%s %s", min, max)
  }
}
