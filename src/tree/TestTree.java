package tree;

import tree.BinaryTree.TreeNode;

public class TestTree {

	public static void main(String[] args) {
		TreeNode r1=new TreeNode(1);
		TreeNode r2=new TreeNode(2);
		TreeNode r3=new TreeNode(3);
		TreeNode r4=new TreeNode(4);
		TreeNode r5=new TreeNode(5);
		TreeNode r6=new TreeNode(6);
		
		r1.leftNode=r2;
		r1.rightNode=r3;
		r2.leftNode=r4;
		r2.rightNode=r5;
		r3.rightNode=r6;
		
		//int nodeNum = BinaryTree.getNodeNum(r1);
		//int depth = BinaryTree.getDepth(r1);
		//System.out.println(nodeNum);
		//System.out.println(depth);
		//BinaryTree.preorder(r1);
		//BinaryTree.levelTraversal(r1);
		//BinaryTree.convertBST2DLLRec(r1);
		int i = BinaryTree.getNodeNumKthLevelRec(r1, 2);
		System.out.println(i);
	}
}
