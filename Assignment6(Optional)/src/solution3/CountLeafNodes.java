package solution3;


public class CountLeafNodes {

	public static void main(String[] args) {
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
		int count=tree.countLeafNodes();
		System.out.println(count);

	}

}
