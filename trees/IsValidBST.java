package trees;

public class IsValidBST {
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
    public boolean isValidBST(TreeNode root) {
      return isNodeValInRange(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isNodeValInRange(TreeNode root, int min, int max) {
      if (root == null) return true;
      if (root.val <= min || root.val >= max) return false;

      return isNodeValInRange(root.left, min, root.val) && isNodeValInRange(root.right, root.val, max);
    }
  }
}
