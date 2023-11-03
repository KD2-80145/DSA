package solution3;



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

	private int countLeafNodes(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;

		int c1 = countLeafNodes(root.left);
		int c2 = countLeafNodes(root.right);

		return c1 + c2;
	}

	

	public int countLeafNodes() {
		return countLeafNodes(root);
	}

	public void display() {
		displayPost(root);
	}

}
