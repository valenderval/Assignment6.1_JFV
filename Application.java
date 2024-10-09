/**
 * 
 */

/**
 * @author Nathan Johnson, Jacob Vallery, Bellarmine University
 *
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree(5);
		DepthFirstSearch aSearch=new DepthFirstSearch();
		aSearch.DFS(root);
		System.out.println("Numer of nodes traversed: "+aSearch.nodeCount);
		System.out.println("Height of Tree: "+aSearch.treeHeight(root));
	}//end main

}//end class
