//import java.{util => ju}
object Problem1 {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var i = 0
    val l = nums.length
    var index_map: Map[Int, Int] = Map()
    var rs_found = false
    //var nums_sorted = nums.sorted
    while (i < l && !rs_found) {
      val remainder = target - nums(i)
      if (index_map.contains(remainder)) {
        rs_found = true
      } else {
        index_map += (nums(i) -> i)
        i += 1
      }
    }
    return Array(i, index_map(target - nums(i)))
  }
}
