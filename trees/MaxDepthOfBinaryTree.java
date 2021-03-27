package trees;

public class MaxDepthOfBinaryTree {
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
    public int maxDepth(TreeNode root) {
      if (root == null) {
        return 0;
      }
      int leftMax = maxDepth(root.left);
      int rightMax = maxDepth(root.right);

      return 1 + (leftMax > rightMax ? leftMax : rightMax);
    }

    // alternative solution - track max w/ class variable
    /*
      public int currDepth = 0;
      public int maxDepthVal = 0;
      public int maxDepth(TreeNode root) {
        traverseTree(root);
        return this.maxDepthVal;
      }

      public void traverseTree(TreeNode root) {
        if (root == null) {
          return;
        }

        this.currDepth++;
        this.maxDepthVal = this.currDepth > this.maxDepthVal ? this.currDepth : this.maxDepthVal;
        traverseTree(root.left);
        traverseTree(root.right);
        this.currDepth--;
      }
    */
  }
}
