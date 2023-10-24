//Find Largest Value in Each
/*Given the root of a binary tree, return an array of
 the largest value in each row of the tree (0-indexed). 
 
 Example :
Input: root = [1,2,3]
Output: [1,3]*/

class Solution {
    public List<Integer> largestValues(TreeNode root) {
         List<Integer> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int max_val = Integer.MIN_VALUE;
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = q.poll();
                max_val = Math.max(max_val, node.val);

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }

            res.add(max_val);
        }

        return res;        
    }
}
