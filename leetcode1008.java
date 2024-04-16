import java.util.*;

// import javax.swing.tree.TreeNode;
class TreeNode {
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

public class leetcode1008 {
    
    public static TreeNode bst(int preorder[]){
        return helper(preorder, 0, preorder.length-1);
    }
    public static TreeNode helper(int preorder[],int start,int end){
        if(start>end) return null;
        TreeNode node=new TreeNode(preorder[start]);
        int i;
        for(i=start;i<=end;i++){
            if(preorder[i]>node.val)
            break;
        }
        node.left=helper(preorder, start+1, i-1);
        node.right=helper(preorder, i, end);
        return node;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter n");
        int n=ob.nextInt();
        System.out.println("Enter ele of preorder");
        int preorder[]=new int[n];
        for(int i=0;i<n;i++){
            preorder[i]=ob.nextInt();
        }
        System.out.println(bst(preorder));
        ob.close();
    }
}
