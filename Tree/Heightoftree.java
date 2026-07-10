/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int height(Node root) {
        // code here
        int count=0;
        if(root==null) return 0;
        Queue<Node>q=new LinkedList<>();
        q.add(root);
    while(!q.isEmpty()){
        
        int n=q.size();
        count++;
        for(int i=0;i<n;i++){
            Node current=q.poll();
            if(current.left!=null) q.add(current.left);
            if(current.right!=null)q.add(current.right);
        }
    }
    return count-1;
    }
}
