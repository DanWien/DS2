

import java.util.NoSuchElementException;

public class BacktrackingBST implements Backtrack, ADTSet<BacktrackingBST.Node> {
    private Stack stack;
    private Stack redoStack;
    private Node root = null;

    // Do not change the constructor's signature
    public BacktrackingBST(Stack stack, Stack redoStack) {
        this.stack = stack;
        this.redoStack = redoStack;
    }

    public Node getRoot() {
    	if (root == null) {
    		throw new NoSuchElementException("empty tree has no root");
    	}
        return root;
    }
	
    public Node search(int k) {
        if (root.getKey() == k)
            return root;
        if (root.right!=null && k>root.getKey())
            return root.right.search(k);
        if (root.left!=null && k<root.getKey())
            return root.left.search(k);
    	return null;
    }

    public void insert(Node node) {
        // TODO: implement your code here
    }

    public void delete(Node node) {
        // TODO: implement your code here
    }

    public Node minimum() {
        // TODO: implement your code here
    	return null; // temporal return command to prevent compilation error
    }

    public Node maximum() {
        // TODO: implement your code here
    	return null; // temporal return command to prevent compilation error
    }

    public Node successor(Node node) {
        // TODO: implement your code here
    	return null; // temporal return command to prevent compilation error
    }

    public Node predecessor(Node node) {
        // TODO: implement your code here
    	return null; // temporal return command to prevent compilation error
    }

    @Override
    public void backtrack() {
        // TODO: implement your code here
    }

    @Override
    public void retrack() {
        // TODO: implement your code here
    }

    public void printPreOrder(){
        // TODO: implement your code here
    }

    @Override
    public void print() {
    	printPreOrder();
    }

    public static class Node {
    	// These fields are public for grading purposes. By coding conventions and best practice they should be private.
        public Node left;
        public Node right;
        
        private Node parent;
        private int key;
        private Object value;

        public Node(int key, Object value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }

        public Node search(int k) {
            if (this.getKey() == k)
                return this;
            if(this.right!= null && k>this.getKey())
                return this.right.search(k);
            if(this.left!=null && k<this.getKey())
                return this.left.search(k);
            return null;
        }
    }

}
