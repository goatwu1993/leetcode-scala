class Problem5_Test extends org.scalatest.FunSuite {
  test("test1") {
    assert(Problem5.longestPalindrome("aa") == "aa")
  }

  test("test2") {
    assert(Problem5.longestPalindrome("a") == "a")
  }

  test("test3") {
    assert(Problem5.longestPalindrome("abccba") == "abccba")
  }

  test("test4") {
    assert(Problem5.longestPalindrome("abc") == "a")
  }

  test("test5") {
    assert(Problem5.longestPalindrome("abcdefg") == "a")
  }

  test("test6") {
    println("-----------------------------------")
    assert(Problem5.longestPalindrome("abcabcbb") == "bcb")
  }
}
