class LinkList(var nums: Array[Int]) {
  val l = nums.length
  var root: ListNode = null
  if (l > 0) {
    root = new ListNode(nums(0))
    var pos = root
    for (i <- (1 until l)) {
      pos.next = new ListNode(nums(i))
      pos = pos.next
    }
  }

  def canEqual(a: Any) = a.isInstanceOf[LinkList]

  override def equals(that: Any): Boolean =
    that match {
      case that: LinkList => {
        that.canEqual(this) &&
        this.root == that.root
      }
      case _ => false
    }

  override def toString(): String = {
    return this.root.toString
  }
}
