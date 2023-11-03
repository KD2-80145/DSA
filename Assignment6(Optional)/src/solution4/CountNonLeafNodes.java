package solution4;

public class CountNonLeafNodes {
	
	
	public static void main(String[] args) {
//		Write a function to count the number of non leaf nodes in the given binary search tree.
		
		Bst tree = new Bst();

		tree.addNode(8);
		tree.addNode(3);
		tree.addNode(10);
		tree.addNode(1);
		tree.addNode(6);
		tree.addNode(14);
		tree.addNode(4);
		tree.addNode(7);
		tree.addNode(13);
		
		tree.display();
		System.out.println();
		tree.countNonLeafNodes();

	}

}
