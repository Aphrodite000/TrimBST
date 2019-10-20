public class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        //递归的终止条件
        //先修剪根节点
        if(root==null){
            return root;
        }
        //本级递归需要做什么
        //二叉搜索树左子树小于根节点，根节点小于右子树
        if(root.val<L){
            return trimBST(root.right,L,R);
        }
        if(root.val>R){
            return trimBST(root.left,L,R);
        }
        //再修剪左子树和右子树节点
        //新的左右子树是修剪过的左右子树
        root.left=trimBST(root.left,L,R);
        root.right=trimBST(root.right,L,R);
        return root;
    }
}
