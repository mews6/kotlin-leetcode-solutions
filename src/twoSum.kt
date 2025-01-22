class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var ret: IntArray = IntArray(0); //Makes an empty IntArray
        for (i in 0..(nums.size-2)) {
            for (j in i+1..(nums.size-1)) {
                if (nums[i]+nums[j] == target) {
                    ret += i
                    ret += j
                    return ret;
                }
            }
        } 
        return ret //here for control reasons, Kotlin does not like having abstract 
    }
}