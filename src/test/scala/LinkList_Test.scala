class LinkList_Test extends org.scalatest.FunSuite {
  test("1->2-3 == 1->2-3") {
    val a = new LinkList(Array(1, 2, 3))
    val b = new LinkList(Array(1, 2, 3))
    assert(a == b)
  }

  test("1->2 != 1->30") {
    val a = new LinkList(Array(1, 2, 30))
    val b = new LinkList(Array(1, 30, 2))
    assert(a != b)
  }

  test("1->2 != 1->2->3") {
    val a = new LinkList(Array(1, 2))
    val b = new LinkList(Array(1, 2, 3))
    assert(a != b)
  }

  test("null != 1->2->3") {
    val a = null
    val b = new LinkList(Array(1, 2, 3))
    assert(a != b)
  }

  test("1->2->3 != null") {
    val a = new LinkList(Array(1, 2, 3))
    val b = null
    assert(a != b)
  }

  test("1->2->3.toString == 1->2->3") {
    val a = new LinkList(Array(1, 2, 3))
    assert(a.toString() == "1->2->3")
  }
}
