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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>list=new ArrayList<>();
        if(root==null) return list;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            Double avg=0.00;
            for(int i=0;i<n;i++){
                
                TreeNode current=q.poll();
                avg+=current.val;
                
                if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
            }
            list.add(avg/n);
        }
        return list;
    }
}
