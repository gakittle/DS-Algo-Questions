package trees;

public class LowestCommonAncestorBST {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
  }

  class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, int x, int y) {
      if (root == null) return null;

      if (x < root.val && y < root.val) {
        return lowestCommonAncestor(root.left, x, y);
      }

      if (x > root.val && y > root.val) {
        return lowestCommonAncestor(root.right, x, y);
      }

      // assumes a node can be an ancestor of itself
      return root;
    }
  }
}
