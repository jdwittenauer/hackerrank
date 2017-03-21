package algorithms.warmup

object PlusMinus {
  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readLine().toInt
    val a = scala.io.StdIn.readLine().split(" ").map(_.toInt)

    var pos, neg, zero = 0
    for (x <- a) {
      if (x > 0) pos += 1
      else if (x < 0) neg += 1
      else zero += 1
    }

    println(pos.toFloat / n)
    println(neg.toFloat / n)
    println(zero.toFloat / n)
  }
}
