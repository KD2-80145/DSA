package solution7;

import java.util.ArrayList;
import java.util.List;

public class Bst {
	public class TreeNode {

		public TreeNode left;
		public TreeNode right;
		public int data;

		public TreeNode(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	private TreeNode root;

	public Bst() {
		this.root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public TreeNode addNode(TreeNode root, int key) {
		if (root == null)
			return new TreeNode(key);

		if (key < root.data) {
			root.left = addNode(root.left, key);
		} else {
			root.right = addNode(root.right, key);
		}
		return root;
	}

	public void addNode(int key) {
		this.root = addNode(root, key);
	}

	public void displayPreOrder(TreeNode root) {
		if (root == null)
			return;

		System.out.print(root.data + " ");
		displayPreOrder(root.left);
		displayPreOrder(root.right);
	}

	public void displayInOrder(TreeNode root) {
		if (root == null)
			return;

		displayInOrder(root.left);
		System.out.print(root.data + " ");
		displayInOrder(root.right);
	}

	public void displayPost(TreeNode root) {
		if (root == null)
			return;

		displayPost(root.left);
		displayPost(root.right);
		System.out.print(root.data + " ");

	}

	private List<Integer> printChildren(TreeNode root, int data) {
		if (root == null)
			return new ArrayList<>();
		if (root.data == data) {
			List<Integer> rootChildren = new ArrayList<>();
			if (root.left != null)
				rootChildren.add(root.left.data);
			if (root.right != null)
				rootChildren.add(root.right.data);
			
			return rootChildren;
		}
		List<Integer> leftchildren = printChildren(root.left, data);
		List<Integer> rightchildren = printChildren(root.right, data);

		List<Integer> rootChildren = new ArrayList<>();

		for (int node : leftchildren) {
			rootChildren.add(node);
		}
		for (int node : rightchildren) {
			rootChildren.add(node);
		}

		return rootChildren;
	}

	public void printChildren(int data) {
		List<Integer> ans=printChildren(root, data);
		
		if(ans.size()==0) {
			System.out.println("No Children");
			return;
		}
		for (int ele :ans) {
			System.out.print(ele + " ");
		}
	}
	

	public void display() {
		displayPost(root);
	}

}
