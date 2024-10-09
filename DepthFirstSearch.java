/**
 * @author Jacob Vallery
 *
 */
public class DepthFirstSearch {       
	      Node root;
	      int nodeCount;
	      public DepthFirstSearch()
	       {               
	              System.out.println("Call DFS with root node to do a Depth First Search.");
	              nodeCount = 0;
	       }//end constructor
	       
	        public void DFS(Node node) {
	            if (node == null) {
	           
	                return;
	            }
	            //value
	            System.out.println(node.getData());
	            nodeCount++;
	            // Recursive call on the left 
	            DFS(node.getlChild());

	            // Recursive call on the right 
	            DFS(node.getrChild());
	        }//end DFS
	        
	        public int treeHeight(Node node) {
	            if (node == null) {
	                return 0;
	            }

	            int leftHeight = treeHeight(node.getlChild());
	            int rightHeight = treeHeight(node.getrChild());

	            return 1 + Math.max(leftHeight, rightHeight);
	        }//end treeHeight
	                
    }//end class