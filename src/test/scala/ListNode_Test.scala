class ListNode_Test extends org.scalatest.FunSuite {
  test("1->2 == 1->2") {
    val a = new ListNode(1)
    a.next = new ListNode(2)
    val b = new ListNode(1)
    b.next = new ListNode(2)
    assert(a == b)
  }

  test("1->2 != 1->30") {
    val a = new ListNode(1)
    a.next = new ListNode(2)
    val b = new ListNode(1)
    b.next = new ListNode(30)
    assert(a != b)
  }

  test("1->2 != 1->2->3") {
    val a = new ListNode(1)
    a.next = new ListNode(2)
    val b = new ListNode(1)
    b.next = new ListNode(2)
    b.next.next = new ListNode(3)
    assert(a != b)
  }

  test("null != 1->2->3") {
    val a = null
    val b = new ListNode(1)
    b.next = new ListNode(2)
    b.next.next = new ListNode(3)
    assert(a != b)
  }

  test("1->2->3 != null") {
    val a = new ListNode(1)
    a.next = new ListNode(2)
    a.next.next = new ListNode(3)
    val b = null
    assert(a != b)
  }

  test("1->2->3.toString == 1->2->3") {
    val a = new ListNode(1)
    a.next = new ListNode(2)
    a.next.next = new ListNode(3)
    assert(a.toString() == "1->2->3")
  }
}
