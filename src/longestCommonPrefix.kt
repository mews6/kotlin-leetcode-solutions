class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {

        var ret: String = ""

        //you can use 'it' to filter from a specific 
        //characteristic in a set, it is like a Python key
        val shortestStringLength: Int = strs.minOf{ it.length } 

        for (i in (0..shortestStringLength-1)) {
            for (j in strs) {
                if (j[i] != strs[0][i]) { //they should all be the same, therefore if one differs this will catch it.
                    return ret
                }
            }
            ret += strs[0][i]
        }
        return ret
    }
}