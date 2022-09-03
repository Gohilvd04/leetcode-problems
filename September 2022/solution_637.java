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
        List<Double> result = new ArrayList<>();

    

        if(root == null){

            return result;

        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){

            int size = queue.size();

            List<Integer> temp = new ArrayList<>();

            for(int i=0;i<size;i++){

                TreeNode node = queue.poll();

                temp.add(node.val);

                if(node.left != null ){

                    queue.add(node.left);

                }

                if(node.right != null){

                    queue.add(node.right);

                }

            }

            double ans = 0;

            for(int i=0; i<temp.size(); i++){

                ans += temp.get(i);

            }

            ans = ans / temp.size();

            result.add(ans);   

        }

        return result;
    }
}