object Problem3 {
  def lengthOfLongestSubstring(s: String): Int = {
    val l = s.length()
    if (l <= 1) return l
    var last_appearance = Map[Char, Int]()
    var (rs, i, j) = (0, 0, 0)
    while (j < l) {
      val c = s(j)
      if (last_appearance.contains(c)) {
        i = Math.max(last_appearance(c) + 1, i)
      }
      if (j - i + 1 > rs) {
        rs = j - i + 1
      }
      last_appearance += (c -> j)
      j += 1
    }
    return rs
  }
}
