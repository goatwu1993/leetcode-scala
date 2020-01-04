class Problem2_Test extends org.scalatest.FunSuite {
  test("342 + 465 = 708") {
    val a = new LinkList(Array(2, 4, 3))
    val b = new LinkList(Array(5, 6, 4))
    assert(
      Problem2
        .addTwoNumbers(a.root, b.root) == new LinkList(Array(7, 0, 8)).root
    )
  }

  test("342+null = 342") {
    val a = new LinkList(Array(2, 4, 3))
    val b = new LinkList(Array())
    assert(
      Problem2
        .addTwoNumbers(a.root, b.root) == new LinkList(Array(2, 4, 3)).root
    )
  }

  test("342+0 = 342") {
    val a = new LinkList(Array(2, 4, 3))
    val b = new LinkList(Array(0))
    assert(
      Problem2
        .addTwoNumbers(a.root, b.root) == new LinkList(Array(2, 4, 3)).root
    )
  }

  test("342+1 = 343") {
    val a = new LinkList(Array(2, 4, 3))
    val b = new LinkList(Array(1))
    assert(
      Problem2
        .addTwoNumbers(a.root, b.root) == new LinkList(Array(3, 4, 3)).root
    )
  }

  test("0+0 = 343") {
    val a = new LinkList(Array(0))
    val b = new LinkList(Array(0))
    assert(
      Problem2
        .addTwoNumbers(a.root, b.root) == new LinkList(Array(0)).root
    )
  }

  test("4+6 = 10") {
    val a = new LinkList(Array(4))
    val b = new LinkList(Array(6))
    assert(
      Problem2
        .addTwoNumbers(a.root, b.root) == new LinkList(Array(0, 1)).root
    )
  }

  test("333+667 = 1000") {
    val a = new LinkList(Array(3, 3, 3))
    val b = new LinkList(Array(7, 6, 6))
    assert(
      Problem2
        .addTwoNumbers(a.root, b.root) == new LinkList(Array(0, 0, 0, 1)).root
    )
  }
  test("1+99 = 100") {
    val a = new LinkList(Array(1))
    val b = new LinkList(Array(9, 9))
    assert(
      Problem2
        .addTwoNumbers(a.root, b.root) == new LinkList(Array(0, 0, 1)).root
    )
  }
}
