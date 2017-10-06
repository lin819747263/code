package tree;

import java.util.ArrayList;

public class BinaryTree{
/**
 * 
 * 输的构建
 * @author lin819747263
 *
 */
static class TreeNode {
	int val;
	TreeNode leftNode;
	TreeNode rightNode;
	public TreeNode(int val) {
		this.val=val;
	}
}
/**
 * 统计节点个数
 * @param root
 * @return
 */
public static int getNodeNum(TreeNode root) {
	if(root ==null) {
		return 0;
	}else {
		return getNodeNum(root.leftNode)+getNodeNum(root.rightNode)+1;
	}
	
}


/**
 * 得到二叉树深度
 * @param root
 * @return
 */
public static int getDepth(TreeNode root) {
	if(root==null) {
		return 0;
	}
	int leftDepth=getDepth(root.leftNode);
	int rightDepth=getDepth(root.rightNode);
	
	return Math.max(leftDepth, rightDepth)+1;
}

/**
 * 
 * 先序遍历
 * @param root
 */

public static void preorder(TreeNode root) {
	if(root==null) {
		return;
	}
	System.out.println(root.val+" ");
	preorder(root.leftNode);
	preorder(root.rightNode);
}
/***
 * 中序遍历
 * @param root
 */
public static void midorder(TreeNode root) {
	if(root==null) {
		return;
	}
	preorder(root.leftNode);
	System.out.println(root.val+" ");
	preorder(root.rightNode);
}
/**
 * 后序遍历
 * @param root
 */
public static void aftorder(TreeNode root) {
	if(root==null) {
		return;
	}
	preorder(root.leftNode);
	System.out.println(root.val+" ");
	preorder(root.rightNode);
}

/**
 * 分层打印
 * @param root
 */
public static void levelTraversal(TreeNode root) {
	ArrayList<ArrayList<Integer>> ret=new ArrayList<ArrayList<Integer>>();
	dfs(root,0,ret);
	System.out.println(ret);
}
private static void dfs(TreeNode root,int level,ArrayList<ArrayList<Integer>> ret) {
	if(root ==null) {
		return;
	}
	
	if(level >=ret.size()) {
		ret.add(new ArrayList<Integer>());
	}
	
	ret.get(level).add(root.val);
	dfs(root.leftNode,level+1,ret);
	dfs(root.rightNode,level+1,ret);
}
/**
 * 
 * 二叉树转链表
 * @param root
 * @return
 */
public static TreeNode convertBST2DLLRec(TreeNode root) {
	root=convertBST2DLLSubRec(root);
	
	while(root.leftNode!=null) {
		root=root.leftNode;
	}
	return root;
}


private static TreeNode convertBST2DLLSubRec(TreeNode root) {
	if(root==null||(root.leftNode==null&&root.rightNode==null)) {
		return root;
	}
	
	TreeNode tmp=null;
	
	if(root.leftNode!=null) {
		tmp=convertBST2DLLSubRec(root.leftNode);
		while(tmp.rightNode!=null) {
			tmp=tmp.rightNode;
		}
		tmp.rightNode=root;
		root.leftNode=tmp;
	}
	if(root.rightNode!=null) {
		tmp=convertBST2DLLSubRec(root.rightNode);
		while(tmp.leftNode!=null) {
			tmp=tmp.leftNode;
		}
		tmp.leftNode=root;
		tmp.rightNode=tmp;
	}
	
	return root;
}

public static int getNodeNumKthLevelRec(TreeNode root,int k) {
	if(root ==null||k<1) {
		return 0;
		
	}
	if(k==1) {
		return 1;
	}
	int numl=getNodeNumKthLevelRec(root.leftNode, k-1);
	int numr=getNodeNumKthLevelRec(root.rightNode, k-1);
	return numl+numr;
	
}
/**
 * 求二叉树叶子节点
 * @param root
 * @return
 */
public static int getNodeNumLeafRec(TreeNode root) {
	if(root ==null) {
		return 0;
	}
	if(root.leftNode==null&&root.rightNode==null) {
		return 1;
	}
	
	return getNodeNumLeafRec(root.leftNode)+getNodeNumLeafRec(root.rightNode);
}

/**
 * 两棵树是否相等
 * @param r1
 * @param r2
 * @return
 */
public static boolean isSameRec(TreeNode r1,TreeNode r2) {
	if(r1==null&&r2==null) {
		return true;
	}
	if(r1 ==null||r2==null) {
		return false;
	}
	
	if(r1.val!=r2.val) {
		return false;
	}
	
	return isSameRec(r1.leftNode, r2.leftNode)&&isSameRec(r1.rightNode, r2.rightNode);
}


public static boolean isAVLRec(TreeNode root) {
	if(root ==null) {
		return true;
		
	}
	if(Math.abs(getDepth(root.leftNode)-getDepth(root.rightNode))>1) {
		return false;
	}
	
	return isAVLRec(root.leftNode)&&isAVLRec(root.rightNode);
}















}