package algorithms.warmup

object BirthdayCakeCandles {
  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readLine().toInt
    val a = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    val candles = a.count(_ == a.max)
    println(candles)
  }
}
