class Solution {
    fun strStr(haystack: String, needle: String): Int {
         var ret = -1;
         var i = 0
         var j = needle.length-1
         while (i < haystack.length-(needle.length-1)) {
            if (haystack.slice(i..j) == needle) {
                ret = i
                return ret;
            }
            i += 1
            j += 1
         }
         return ret
    }
}