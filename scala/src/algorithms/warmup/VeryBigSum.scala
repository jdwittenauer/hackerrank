package algorithms.warmup

object VeryBigSum {
  def main(args: Array[String]) {
    println(io.Source.stdin.getLines().slice(1, 2).next().split(" ").map(_.toLong).sum)
  }
}
