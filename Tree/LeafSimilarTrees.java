/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void leaf(TreeNode root,ArrayList<Integer>list){
        if(root==null) return;
        if(root.left==null&&root.right==null){
             list.add(root.val);
             return;
        }
        leaf(root.left,list);
        leaf(root.right,list);
        
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer>list=new ArrayList<>();
        leaf(root1,list);
         ArrayList<Integer>l1=new ArrayList<>();
         leaf(root2,l1);
         return l1.equals(list);
    }
}
