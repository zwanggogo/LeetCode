package com.zw.leetCode_107;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			val = x;
		}
	}

	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		List<TreeNode> list = new ArrayList<>();
		List<Integer> l = null;
		if (root != null) {
			list.add(root);
//			l.add(root.val);
		}
		while (list.size() > 0) {
			
			l = new ArrayList<>();
			int length = list.size();
			for (int i = 0; i < length; i++) {
				TreeNode node = list.remove(0);
				l.add(node.val);
				if (node.left != null) {
					list.add(node.left);
				}
				if (node.right != null) {
					list.add(node.right);
				}

			}
			result.add(0, l);
		}
		return result;

	}
	public static void main(String[] args) {
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(9);
		TreeNode t5 = new TreeNode(20);
		t3.left = t4;
		t3.right = t5;
		TreeNode t6 = new TreeNode(15);
		TreeNode t7 = new TreeNode(7);
		t5.left = t6;
		t6.right = t7;
		levelOrderBottom(t3);
	}

}