package hackerarnk;

/**
 * Created by oracle on 24/10/16.
 */
public class Bst {


    class Node {
        int data;
        Node left;
        Node right;
    }

    boolean checkBST(Node root) {
        return checkMe(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    boolean checkMe(Node root, int min, int max){
        if(root==null)
            return true;
        return min<root.data && max>root.data && checkMe(root.left,min,root.data)
                && checkMe(root.right, root.data, max);
    }
}