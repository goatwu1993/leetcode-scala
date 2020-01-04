class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x

  def canEqual(a: Any) = a.isInstanceOf[ListNode]

  override def equals(that: Any): Boolean =
    that match {
      case that: ListNode => {
        that.canEqual(this) &&
        this.x == that.x &&
        this.next == that.next
      }
      case _ => false
    }
  override def toString(): String = {
    if (this.next == null) {
      return this._x.toString()
    } else {
      return this._x.toString() + "->" + this.next.toString()
    }
  }
}
