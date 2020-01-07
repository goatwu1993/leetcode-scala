object Problem5 {
  def longestPalindrome(s: String): String = {
    def expand(s: String, start_l: Int, start_r: Int): Int = {
      val l = s.length
      var i = 0
      while (start_l - (i + 1) >= 0 &&
             start_r + (i + 1) < l &&
             s(start_l - (i + 1)) == s(start_r + (i + 1))) {
        i += 1
      }
      i
    }

    val l = s.length
    if (l <= 1) return s

    var (rs_left, rs_right) = (0, 0)

    for (i <- 0 until l) {
      //odd
      val len1 = expand(s, i, i)
      if (len1 * 2 + 1 > rs_right - rs_left) {
        rs_left = i - len1
        rs_right = i + len1 + 1
      }
      //even
      if (i <= l - 2 && s(i) == s(i + 1)) {
        val len2 = expand(s, i, i + 1)
        if (len2 * 2 + 2 > rs_right - rs_left) {
          rs_left = i - len2
          rs_right = i + len2 + 2
        }
      }
    }
    s.substring(rs_left, rs_right)
  }
}
