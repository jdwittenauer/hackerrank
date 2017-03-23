package algorithms.warmup

object VeryBigSum {
  def main(args: Array[String]): Unit = {
    println(io.Source.stdin.getLines().slice(1, 2).next().split(" ").map(_.toLong).sum)
  }
}
