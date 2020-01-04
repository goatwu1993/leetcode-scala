class Problem1_Test extends org.scalatest.FunSuite {
  test("Problem1.twoSum") {
    assert(Problem1.twoSum(Array(3, 2, 4), 6).toSet === Array(1, 2).toSet)
  }
}
