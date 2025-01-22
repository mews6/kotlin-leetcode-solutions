class Solution {
    fun isPalindrome(x: Int): Boolean {
        val chars = x.toString(); //You can use Java's toString method
        return (chars == chars.reversed()) //reversing any string is trivial
    }
}