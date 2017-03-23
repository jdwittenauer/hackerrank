package algorithms.warmup

object DiagonalDifference {
  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readLine().toInt
    val a = List.range(0, n).map(_ => scala.io.StdIn.readLine()).map(x => x.split(" ").map(_.toInt))
    val diag1 = List.range(0, n).map(x => a(x)(x)).sum
    val diag2 = List.range(0, n).map(x => a(x)((n - 1) - x)).sum
    println(Math.abs(diag1 - diag2))
  }
}
