object TestRunner {
  def main(args: Array[String]): Unit = {
    val signalcase_1 = Signal(87, 102, 17, 10, 9)
    assert(Policy.score(signalcase_1) == 221)
    assert(Policy.classify(signalcase_1) == "accept")
    val signalcase_2 = Signal(87, 71, 20, 14, 9)
    assert(Policy.score(signalcase_2) == 165)
    assert(Policy.classify(signalcase_2) == "accept")
    val signalcase_3 = Signal(97, 78, 18, 13, 8)
    assert(Policy.score(signalcase_3) == 198)
    assert(Policy.classify(signalcase_3) == "accept")
  }
}
