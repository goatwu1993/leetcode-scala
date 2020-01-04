object Problem2 {
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    if (l1 == null) {
      return l2
    }
    if (l2 == null) {
      return l1
    }
    var ten = 0
    val rs = new ListNode((l1._x + l2._x + ten) % 10)
    ten = (l1._x + l2._x + ten) / 10
    var pos = rs
    var pos1 = l1.next
    var pos2 = l2.next

    while (pos1 != null && pos2 != null) {
      var tmp = (pos1._x + pos2._x + ten) % 10
      ten = (pos1._x + pos2._x + ten) / 10
      pos.next = new ListNode(tmp)
      pos = pos.next
      pos1 = pos1.next
      pos2 = pos2.next
    }
    var longer: ListNode = null
    if (pos1 != null) {
      longer = pos1
    } else if (pos2 != null) {
      longer = pos2
    }
    while (longer != null) {
      var tmp = (longer._x + ten) % 10
      ten = (longer._x + ten) / 10
      pos.next = new ListNode(tmp)
      pos = pos.next
      longer = longer.next
    }
    if (ten != 0) {
      pos.next = new ListNode(ten)
    }
    return rs
  }
}
