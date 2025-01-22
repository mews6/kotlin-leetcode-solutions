/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
 
class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null; // null is counted as a blank node, so it doesn't break
        }
        val temp = root.left
        root.left = root.right
        root.right = temp
        invertTree(root.left) //you can use recursion pretty liberally in Kotlin as long as the recursed function is defined in your space
        invertTree(root.right)
        return root
    }
}