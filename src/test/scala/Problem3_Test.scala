class Problem3_Test extends org.scalatest.FunSuite {
  test("assert(Problem3.lengthOfLongestSubstring(\"\") == 0") {
    assert(Problem3.lengthOfLongestSubstring("") == 0)
  }

  test("Problem3.lengthOfLongestSubstring(\"a\") == 1") {
    assert(Problem3.lengthOfLongestSubstring("a") == 1)
  }

  test("Problem3.lengthOfLongestSubstring(\"abccba\") == 3") {
    assert(Problem3.lengthOfLongestSubstring("abccba") == 3)
  }

  test("Problem3.lengthOfLongestSubstring(\"abcddcba\") == 4") {
    assert(Problem3.lengthOfLongestSubstring("abcddcba") == 4)
  }

  test("Problem3.lengthOfLongestSubstring(\"abcdefg\") == 7") {
    assert(Problem3.lengthOfLongestSubstring("abcdefg") == 7)
  }

  test("Problem3.lengthOfLongestSubstring(\"abcabcbb\") == 3") {
    println("-----------------------------------")
    assert(Problem3.lengthOfLongestSubstring("abcabcbb") == 3)
  }
}
