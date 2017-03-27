package algorithms.warmup

import java.time._
import java.time.format._

object TimeConversion {
  def main(args: Array[String]): Unit = {
    val input = scala.io.StdIn.readLine()
    val format = DateTimeFormatter.ofPattern("hh:mm:ssa")
    val time = LocalTime.parse(input, format)
    println(time.format(DateTimeFormatter.ofPattern("HH:mm:ss")))
  }
}
