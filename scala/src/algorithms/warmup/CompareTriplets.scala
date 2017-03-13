package algorithms.warmup

object CompareTriplets {
  def main(args: Array[String]) {
    val a = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    val b = scala.io.StdIn.readLine().split(" ").map(_.toInt)

    var a_score = 0
    var b_score = 0

    for ((ax, bx) <- a zip b) {
      if (ax > bx) {
        a_score += 1
      }
      else if (bx > ax) {
        b_score += 1
      }
    }

    println(a_score + " " + b_score)
  }
}
